/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej11;

/**
 *
 * @author NitroPc
 */
public class Rectangulo extends Figura {

    public Rectangulo(double base, double altura) {
        super();
    }

    @Override
    public double calcularArea() {
        double areaRectangulo = (getAltura()*getBase());
        return areaRectangulo;
    }
    

}
