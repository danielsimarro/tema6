/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej9;

/**
 *
 * @author NitroPc
 */
public abstract class Vehiculo {

    private int bastidor;

    public final void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public abstract int getVelocidad();
}

//Esta clase puede ser descendente siempre que se implemente el metodo getvelocidad
//en todas sus subclases


//Se puede sobescribir unicamente el metodo getvelocidad ya que es el unico
//Abstracto
