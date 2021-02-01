/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

/**
 *
 * @author NitroPc
 */
public class Persona {
    private String nombre;
    private String nif;
    private int edad;

    public Persona(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }
    
    public Persona(){
        this.nombre = "Marco";
        this.nif = "648562G";
        this.edad = 32;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nif=" + nif + ", edad=" + edad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
