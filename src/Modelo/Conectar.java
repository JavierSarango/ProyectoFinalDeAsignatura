/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Conectar {

    Connection conect = null;

    public Connection conexion() {

       

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            
            conect = DriverManager.getConnection("jdbc:mysql://localhost/consultoriomedico", "root", "");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro " +e);
        }    

        return conect;
    }

}
