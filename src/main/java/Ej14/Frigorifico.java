/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej14;

/**
 *
 * @author NitroPc
 */
public class Frigorifico extends Electrodomestico implements MuestraInformacion, Comparable<Frigorifico>{
    
    private double capacidadLitros ;

    public Frigorifico(double capacidadLitros, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidadLitros = capacidadLitros;
    }

    public double getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(double capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    @Override
    public String toString() {
        return super.toString() + "Frigorifico{" + "capacidadLitros=" + capacidadLitros + '}';
    }

    
    
    @Override
    public void muestra() {
        System.out.println("La capacidad del frigorifico es de " + capacidadLitros);
    }

    @Override
    public int compareTo(Frigorifico f) {
        return (int) (this.getCapacidadLitros() - (f.getCapacidadLitros()));
    }
    
    
}
