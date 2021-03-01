/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

import java.util.ArrayList;

/**
 *
 * @author NitroPc
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        //Creacion de la lista
        ArrayList<Trabajador> listaTrabajador = new ArrayList<>();
        
        //Creación de objetos
        Trabajador c1 = new Camarero("Camarero postres", "Juan", "Gutierrez", "525335242u");
        Trabajador c2 = new Camarero("Camarero de entrantes", "Alba", "Lopez", "534634343a");
        Trabajador o1 = new Obrero ("Peon",1200, "Alex", "Simarro", "7464316153f");
        Trabajador o2 = new Obrero ("Capataz",1800, "Monica", "Nieto", "516213564h");
        
        //Añadir objeto a la lista
        listaTrabajador.add(c1);
        listaTrabajador.add(c2);
        listaTrabajador.add(o1);
        listaTrabajador.add(o2);
        
        //Inicializar metodo cotizar
        
        for (Trabajador trabaja : listaTrabajador){
            trabaja.cotizar();
        }
    }
}
