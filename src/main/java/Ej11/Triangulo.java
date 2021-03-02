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
public class Triangulo extends Figura{
    
    public Triangulo(double base, double altura) {
        super(base,altura);
    }
    
    @Override
    public double calcularArea() {
        double areaTriangulo  = (getAltura()*getBase())/2;
        return areaTriangulo;
    }
}
