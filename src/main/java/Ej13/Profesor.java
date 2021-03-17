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
public class Profesor extends Persona{
    
    //Atributos de la clase Profesor
    private String especialidad;

    public Profesor(String especialidad, String nombre, String apellidos, String Nif, Direccion direccion) {
        super(nombre, apellidos, Nif, direccion);
        this.especialidad = especialidad;
    }

    
    @Override
    public void identificate() {
        System.out.println("Es un profesor");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + '}';
    }
    
    
}
