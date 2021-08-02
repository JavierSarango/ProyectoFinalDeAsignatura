/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.RegistroMedico;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */

public class ControladorRegistroMedico extends Conexion {
    public static PreparedStatement sentencia;
    public static ResultSet resultado;

    String [] campos = {"Nombres","Apellidos","Genero","Usuario","Contrasenia"};
    String [] datos = new String[100];
   public void mostrarDatos(){
   String sql = "SELECT *FROM usuarios";
   Conexion cc = new Conexion();
   Connection conect = cc.conectar();
   
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
       public boolean Guardar(RegistroMedico rm){
        //int resultado = 0;
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = ("INSERT INTO usuarios (Nombres, Apellidos, Genero, User, Password) VALUES (?,?,?,?,?)");
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, rm.getNombres());
            ps.setString(2, rm.getApellidos());
            ps.setString(3, rm.getGenero());
            ps.setString(4, rm.getUser());
            ps.setString(5, rm.getPassword());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       }
//       public int ID_Incrementabel(){
//        int Id_Usuarios = 1;
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        Conexion conexion = new Conexion();
//        try {
//            ps = (PreparedStatement) conexion.conectar().prepareStatement("SELECT MAX(Id_Usuarios) FROM usuarios");
//            rs = ps.executeQuery();
//            while(rs.next()){
//                Id_Usuarios = rs.getInt(1) + 1;
//            }
//        } catch (Exception e) {
//            System.out.println("Error" +e.getMessage());
//        }
//        finally{
//            try {
//                ps.close();
//                rs.close();
//            } catch (Exception e) {       
//            }
//        }
//        return Id_Usuarios;
//    }   
}
