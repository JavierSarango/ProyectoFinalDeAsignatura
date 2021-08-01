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
        String sql = ("INSERT INTO usuarios (id_Usuarios, Nombres, Apellidos, Genero, User, Password) VALUES (?,?,?,?,?,?)");
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, rm.getId_Usuario());
            ps.setString(2, rm.getNombres());
            ps.setString(3, rm.getApellidos());
            ps.setString(4, rm.getGenero());
            ps.setString(5, rm.getUser());
            ps.setString(6, rm.getPassword());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       }
//   public void Registro(String nombre, String apellido, String especialidad, int telefono, int numCedula, String sexo, int edad, String user, String clave ){
//       
//       
//   }
//
//public class ControladorRegistroMedico1 extends Conexion{
//    public static PreparedStatement sentencia;
//    public static ResultSet resultado;
//    //public static String sql;
//    
//    public boolean Guardar(RegistroMedico rm){
//        //int resultado = 0;
//        PreparedStatement ps = null;
//        Connection con = conectar();
//        String sql = ("INSERT INTO usuarios (id_Usuarios, Nombres, Apellidos, Genero, User, Password) VALUES (?,?,?,?,?,?)");
//        try {
//            ps = (PreparedStatement) con.prepareStatement(sql);
//            ps.setString(1, rm.getId_Usuario());
//            ps.setString(2, rm.getNombres());
//            ps.setString(3, rm.getApellidos());
//            ps.setString(4, rm.getGenero());
//            ps.setString(5, rm.getUser());
//            ps.setString(6, rm.getPassword());
//            ps.execute();
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(RegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
//    public static String BucarNombre(String User){
//        String buscarNombre = null;
//        Connection conexion = null;
//        try {
//            conexion = RegistroMedico.conectar();
//            String busquedaName = ("SELECT Nombres, Apellidos, FROM usuarios WHERE User = '" + User + "'");
//            sentencia = (PreparedStatement) conexion.prepareStatement(busquedaName);
//            resultado = sentencia.executeQuery();
//            if(resultado.next()){
//                String Nombres = resultado.getString("Nombre");
//                String Apellidos = resultado.getString("Apellidos");
//                buscarNombre = (Nombres +" "+ Apellidos);
//            }
//            conexion.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return buscarNombre;
//    }
//    public static String BuscarUsuarios(String User, String Password){
//        String buscarUsuario = null;
//        Connection conexion = null;
//        try {
//            conexion = RegistroMedico.conectar();
//            String busquedaUser = ("SELECT Nombres, User, Password FROM usuarios WHERE User = '"+User+"' && Password = '"+ Password+"'");
//            sentencia = (PreparedStatement) conexion.prepareStatement(busquedaUser);
//            resultado = sentencia.executeQuery();
//            if(resultado.next()){
//                buscarUsuario = "Valido";
//            }else{
//                buscarUsuario = "Invalido";
//            }
//            conexion.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return buscarUsuario;
//    }
//   public void Registro(){
//       
//   }
   
}
