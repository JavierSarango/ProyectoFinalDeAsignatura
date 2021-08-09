/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class ControladorPersona {

    public boolean ingresarSistema(String nombreUsuario, String clave) {

        boolean bandera = false;

        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter("Usuario.txt"));
            BufferedReader br = new BufferedReader(new FileReader("Usuario.txt"));
            BufferedReader br1 = new BufferedReader(new FileReader("Clave.txt"));

            String stringUsuario = br.readLine();
            String stringClave = br1.readLine();

            if (nombreUsuario.equalsIgnoreCase(stringUsuario) && clave.equalsIgnoreCase(stringClave)) {
                bandera = true;
            } else {
                bandera = false;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bandera;
    }

}


