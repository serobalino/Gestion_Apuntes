package MD;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion_db {
    
    public java.sql.Statement conexion(){
    Connection conectar = null;
    java.sql.Statement st= null;    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://localhost/apuntes?user=root&password=");
        if(conectar != null)
        {
            st = conectar.createStatement();
        }
    }catch(Exception e){
        System.out.printf(e.getMessage());
    }
    return st;
    }

}
