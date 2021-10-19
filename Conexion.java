package com.platzi.mensaje_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Conexion {
    
    public Connection getConnection(){
            Connection cone = null;
            try {
                cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso","root","");
                if (cone != null) {
                    System.out.println("!!! Conección exitosa... !!!");
                }
                
            } catch (SQLException e) {
                System.out.println("::: Error de coneccion ::: -> "+e);
            }
            return cone;
}
    
    
}
    
    
    
    
    

