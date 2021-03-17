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
public class CampanaExtractora extends  Electrodomestico{
    
    private double dB;

    public CampanaExtractora(double dB, double consumo, String modelo) {
        super(consumo, modelo);
        this.dB = dB;
    }

    public double getdB() {
        return dB;
    }

    public void setdB(double dB) {
        this.dB = dB;
    }

    @Override
    public String toString() {
        return super.toString() + "CampanaExtractora{" + "dB=" + dB + '}';
    }
    
    
}
