/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej13;

/**
 *
 * @author daniel
 */
public abstract class  Persona implements Identificable{
    
    //Atributos de la clase Persona
    private String nombre;
    private String apellidos;
    private String Nif;
    private Direccion direccion;

    public Persona(String nombre, String apellidos, String Nif, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Nif = Nif;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return Nif;
    }

    public void setNif(String Nif) {
        this.Nif = Nif;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", Nif=" + Nif + ", direccion=" + direccion + '}';
    }
    
////    @Override
////    public void identificate(){
//        
//    }
    
}
