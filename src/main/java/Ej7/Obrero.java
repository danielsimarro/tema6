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
public class Obrero extends Trabajador {
    
    //Atributos de obrero
    private String rango;
    private int salario;
    
    //Constructor de obrero
    public Obrero(String rango, int salario, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.rango = rango;
        this.salario = salario;
    }

    //Metodos get y set
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    //Metodo propio 
    public void salarioObrero(){
        System.out.println("El obrero " + this.getNombre() + " tiene un salario de " + this.salario);
    }
    
    @Override
    // Método sobrescrito
    public void cotizar() {
        System.out.println("El obrero esta cotizando");
    }
    
}
