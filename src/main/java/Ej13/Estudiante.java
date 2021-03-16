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
public class Estudiante extends Persona{
    
    //Atributos de la clase estudiente
    private String IdEstudiante;

    public Estudiante(String nombre, String apellidos, char Nif, Direccion direccion) {
        super(nombre, apellidos, Nif, direccion);
    }
    

    @Override
    public void identificate() {
        System.out.println("Es un estudiante");
    }

    public String getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(String IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "IdEstudiante=" + IdEstudiante + '}';
    }
    
    
    
}
