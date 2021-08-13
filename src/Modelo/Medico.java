/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Persona;

/**
 *
 * @author Javier
 */
public class Medico extends Persona {
     private String especialidad;
     

     public Medico(String especialidad, String nombre,String apellidos, int edad, int numCedula, String sexo, int telefono, String ciudad){
       this.especialidad = especialidad;
       super.setApellidos(apellidos);
       super.setNombres(nombre);
       super.setEdad(edad);
       super.setNumcedula(numCedula);
       super.setGenero(sexo);
       super.setTelefono(telefono);
       //super.setCiudad(ciudad);
     }

//     public Medico(String especialidad, String nombre,String apellidos, int edad, int numCedula, String sexo, int telefono){
//       this.especialidad = especialidad;
//       this.getApellidos();
//       this.getNombres();
//       this.getEdad();
//       this.getNumcedula();
//       this.getGenero();
//       this.getTelefono();
//     }
    
}
