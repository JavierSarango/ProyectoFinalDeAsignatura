/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conectar;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Home
 */
public class ControladorRegistroMedico {
    String [] campos = {"Nombres","Apellidos","Genero","Usuario","Contrasenia"};
    String [] datos = new String[100];
   public void mostrarDatos(){
   String sql = "SELECT *FROM usuarios";
   Conectar cc = new Conectar();
   Connection conect = cc.conexion();
   
       try {
           Statement st = (Statement) conect.createStatement();
           ResultSet rs = st.executeQuery(sql);
           while (rs.next()) {               
               datos[0] = rs.getString("Nombres");
               datos[1] = rs.getString("Apellidos");
               datos[2] = rs.getString("Genero");
               datos[3] = rs.getString("User");
               datos[4] = rs.getString("Password");
           }
           
       } catch (Exception e) {
       }
   }
   public void Registro(){
       
   }
   
}
