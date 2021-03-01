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
public class Diputado extends Legislador{
    
    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String Apellidos) {
        super(provincia, partidoPolitico, nombre, Apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        String atributoDiputado = super.toString();
        return atributoDiputado + "\nDiputado{" + "numeroAsiento=" + numeroAsiento + '}';
    }

    @Override
    public String getCamara() {
        String diputado = "Diputado";
        return diputado;
    }
    
    
    
}
