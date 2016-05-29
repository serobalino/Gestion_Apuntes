/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MD;

import DP.estudianteDP;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class estudianteMD {
    estudianteDP estudiantedp = new estudianteDP();
    conexion_db conexion = new conexion_db();
    
    public boolean verficarMD (estudianteDP estu) throws SQLException{
        boolean resultado = false;
        String sql = "select * from estudiantes where CI_EST='"+estu.getCedula()+"' limit 1";
        ResultSet rs = conexion.conexion().executeQuery(sql);
        while(rs.next()){
              resultado = true;
        }
        return resultado; 
    }
    
    public ArrayList Facultades() throws SQLException{
        ArrayList<String> retorno = new ArrayList();
        String sql = "select NOMBRE_FAC from facultades";
        ResultSet rs = conexion.conexion().executeQuery(sql);
        while(rs.next()){
              String nombre = rs.getString("NOMBRE_FAC");
              retorno.add(nombre);
        }
        return retorno;
    }
    public ArrayList Carreras(String Facultad) throws SQLException{
        ArrayList<String> retorno = new ArrayList();
        int codigoFac=0;
        String sql = "select ID_FAC from facultades where NOMBRE_FAC='"+Facultad+"'";
        ResultSet rs = conexion.conexion().executeQuery(sql);
        while(rs.next())
              codigoFac = rs.getInt("ID_FAC");
        sql = "select TITULO_CAR from carreras where ID_FAC="+codigoFac;
        
        rs = conexion.conexion().executeQuery(sql);
        while(rs.next()){
              String nombre = rs.getString("TITULO_CAR");
              retorno.add(nombre);
        }
        return retorno;
    }
    public ArrayList Niveles(String Carrera) throws SQLException{
        ArrayList<Integer> retorno = new ArrayList();
        int codigoCar=0;
        String sql = "select NIVEL_CAR from carreras where TITULO_CAR='"+Carrera+"' limit 1";
        System.out.print(""+sql);
        ResultSet rs = conexion.conexion().executeQuery(sql);
        while(rs.next())
              codigoCar = rs.getInt("NIVEL_CAR");
        for(int i=1;i<=codigoCar;i++)
            retorno.add(i);
        return retorno;
    }
}
