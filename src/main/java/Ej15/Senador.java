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
public class Senador extends Legislador{
    
    private double completamente;

    public Senador(double completamente, String provincia, String partidoPolitico, String nombre, String Apellidos) {
        super(provincia, partidoPolitico, nombre, Apellidos);
        this.completamente = completamente;
    }

    public double getCompletamente() {
        return completamente;
    }

    public void setCompletamente(double completamente) {
        this.completamente = completamente;
    }

    @Override
    public String toString() {
        String atributoSenador = super.toString();
        return atributoSenador + "\nSenador{" + "completamente=" + completamente + '}';
    }
    
    @Override
    public String getCamara() {
        String senador = "Senador";
        return senador;
    }
    
    
}
