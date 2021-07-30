/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Javier
 */
public abstract class Persona {
    
    
    private String nombres;
    private String apellidos;
    private int edad;
    private int numcedula;
    private String genero;
    private int telefono;
    
    public abstract void ObtenerDatos();
    
    
    /**
     * @return the nombre
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombre to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the numcedula
     */
    public int getNumcedula() {
        return numcedula;
    }

    /**
     * @param numcedula the numcedula to set
     */
    public void setNumcedula(int numcedula) {
        this.numcedula = numcedula;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the sexo to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
