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
    
    
   public void mostrarDatos(){
   String sql = "SELECT *FROM usuarios";
   Conectar cc = new Conectar();
   Connection conect = cc.conexion();
   
       try {
           Statement st = (Statement) conect.createStatement();
           ResultSet rs = st.executeQuery(sql);
           
       } catch (Exception e) {
       }
   }
   
}
