/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej15;

/**
 *
 * @author NitroPc
 */
public class Persona {
    
    private String nombre;
    private String Apellidos;

    public Persona(String nombre, String Apellidos) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    
}
