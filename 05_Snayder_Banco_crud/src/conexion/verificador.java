/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion;

import java.sql.Connection;

/**
 *
 * @author USUARIO
 */
public class verificador {

    public static void main(String[] args) {
        
         conexion conexionDB = new conexion();
        Connection connection = conexionDB.getConnection();

        if (connection != null) {
            System.out.println("Conexión exitosa a la base de datos.");
        } else {
            System.out.println("Error al conectar a la base de datos.");
        }
    }
        
    }
    

