/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Javier
 */
public class Conectar {

    Connection conect = null;

    public Connection conexion() {

       

        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conect = DriverManager.getConnection("jdbc:mysql://localhost/consultoriomedico", "root", "");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }

       

        return conect;
    }

}
