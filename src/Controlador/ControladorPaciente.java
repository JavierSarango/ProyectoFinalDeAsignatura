/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Conexion;
import Modelo.ObtenerDatos;
import Modelo.Paciente;
import com.mysql.jdbc.PreparedStatement;
import java.awt.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class ControladorPaciente implements ObtenerDatos {
    Conexion c = new Conexion();
    SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public boolean Agregar(Paciente p) {
        PreparedStatement ps = null;
        Connection con = c.conectar();
        String sql = ("INSERT INTO registropacientes (Cedula, Nombres, Apellidos,FechaNacimiento, Telefono, Genero, Email) VALUES (?,?,?,?,?,?,?)");
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, String.valueOf(p.getNumcedula()));
            ps.setString(2, p.getNombres());
            ps.setString(3, p.getApellidos());
            ps.setString(4, st.format(p.getFechaNacimiento()));
            ps.setString(5, String.valueOf(p.getTelefono()));
            ps.setString(6, p.getGenero());
            ps.setString(7, p.getEmail());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public void Modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    public ArrayList<Paciente> Listar(){
        ArrayList listaPaciente = new ArrayList();
        Paciente p;
        PreparedStatement ps = null;
        Connection con = c.conectar();
        String sql = ("INSERT INTO registropacientes (Cedula, Nombres, Apellidos,FechaNacimiento, Telefono, Genero, Email) VALUES (?,?,?,?,?,?,?)");
        try {
            p = new Paciente();
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, String.valueOf(p.getNumcedula()));
            ps.setString(2, p.getNombres());
            ps.setString(3, p.getApellidos());
            ps.setString(4, st.format(p.getFechaNacimiento()));
            ps.setString(5, String.valueOf(p.getTelefono()));
            ps.setString(6, p.getGenero());
            ps.setString(7, p.getEmail());
            listaPaciente.add(p);
        } catch (Exception e) {
        }
        return listaPaciente;
    }
    public void ListarP(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"Cedula","Nombres","Apellidos","FechaNacimiento","Telefono","Genero","Email"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM registropacientes"; 
        String [] filas = new String[7];
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = (PreparedStatement) con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(int i = 0; i < 7; i++){
                    filas[1] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar");
        }
    }
}
