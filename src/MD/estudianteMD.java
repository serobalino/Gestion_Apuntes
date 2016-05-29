/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MD;

import DP.estudianteDP;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sebastian
 */
public class estudianteMD {
    estudianteDP estudiantedp = new estudianteDP();
    conexion_db conexion = new conexion_db();
    public String verficarMD (estudianteDP estu) throws SQLException{
        String resultado = "0";
        String sql = "select * from estudiantes where CI_EST='"+estu.getCedula()+"' limit 1";
        ResultSet rs = conexion.conexion().executeQuery(sql);
        while(rs.next()){
            resultado = "1";
        }
        System.out.println(resultado);
        return(resultado);
    }
}
