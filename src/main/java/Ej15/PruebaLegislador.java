/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej15;

import java.util.ArrayList;

/**
 *
 * @author NitroPc
 */
public class PruebaLegislador {

    public static void main(String[] args) {

        ArrayList<Legislador> lista = new ArrayList<>();
        lista.add(new Senador(100,"Malaga","Podemos","Fernando","Costa")); 
        lista.add(new Diputado(24,"Granada","PP","Alvberto","Cuevas"));
        for (Legislador l : lista) {
            System.out.println("Es un " + l.getCamara());
        }
    }
}
