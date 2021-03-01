/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

/**
 *
 * @author NitroPc
 */
public abstract class Trabajador {

    //Atributos de trabajador
    private String nombre;
    private String apellido1;
    private String NIF;

    //Constructor de trabajador
    public Trabajador(String nombre, String apellido1, String NIF) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.NIF = NIF;
    }

    //Metodos get y set de trabajador
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    //Metodo abtracto cotizar el cual deben contener todas las clases de abajo de forma obligatoria
    public abstract void cotizar();
    
}
