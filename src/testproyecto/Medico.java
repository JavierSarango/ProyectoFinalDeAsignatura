/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproyecto;

import Modelo.Persona;

/**
 *
 * @author Javier
 */
public class Medico extends Persona {
     private String especialidad;
     
     public Medico(String especialidad, String nombre, int edad, int numCedula, String sexo, int telefono){
       this.especialidad = especialidad;
       this.getNombre();
       this.getEdad();
       this.getNumcedula();
       this.getGenero();
       this.getTelefono();
     }

    @Override
    public void ObtenerDatos() {
        
    }
     
     
     
    
}
