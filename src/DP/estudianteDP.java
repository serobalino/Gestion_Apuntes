/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

import MD.estudianteMD;
import java.sql.SQLException;

/**
 *
 * @author Sebastian
 */
public class estudianteDP {
    private String Cedula;
    private int Carrera;
    private String Nombres;

    public estudianteDP() {
    }
    

    public estudianteDP(String Cedula, int Carrera, String Nombres) {
        this.Cedula = Cedula;
        this.Carrera = Carrera;
        this.Nombres = Nombres;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getCarrera() {
        return Carrera;
    }

    public void setCarrera(int Carrera) {
        this.Carrera = Carrera;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    
    public void verficarDP() throws SQLException
    {
        estudianteMD estudiantemd = new estudianteMD();
        estudiantemd.verficarMD(this);
    }
    
    
}
