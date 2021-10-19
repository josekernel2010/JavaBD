package com.platzi.mensaje_app;

import java.sql.Connection;

/**
 *
 * @author User
 */
public class Inicio {
    
    public static void main(String... args){
        
        
        Conexion conexion = new Conexion();
        
        try (Connection cmx = conexion.getConnection()){
        
        } catch (Exception e) {
            //System.out.println("El error: "+e);
        }
        
    }
    
}
