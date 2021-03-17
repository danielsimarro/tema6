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
public class Microondas extends  Electrodomestico implements MuestraInformacion, Comparable<Microondas>{
    
    private double w;

    public Microondas(double w, double consumo, String modelo) {
        super(consumo, modelo);
        this.w = w;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return super.toString() + "Miroondas{" + "w=" + w + '}';
    }

    
    
    @Override
    public void muestra() {
        System.out.println("Los vatios del microonadas son de " + w);
    }

    @Override
    public int compareTo(Microondas m) {
        return (int) (this.getW() - m.getW());
    }
    
    
}
