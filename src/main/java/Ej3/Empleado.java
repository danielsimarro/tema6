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
public class Empleado extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public Empleado() {
        super();
        this.salario = 1000;
    }

    @Override
    public String toString() {
        String atributosPersonas = super.toString();
        return atributosPersonas + "Empleado{" + "salario=" + salario + '}';
    }
    
    public void aumentarSalario(double aumento){
        this.salario+= aumento;
    }

    
    
    
}
