/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author NitroPc
 */
public class Main {
   
    private static ArrayList <Electrodomestico> listaElectredomesticos = new ArrayList<Electrodomestico>();
    
    public static void main(String[] args) {
        
        listaElectredomesticos.add(new Frigorifico(200.43,6.4,"Samsung"));
        listaElectredomesticos.add(new Frigorifico(152.32,7.8,"Rahi"));
        listaElectredomesticos.add(new Microondas(48.3,8.5,"Lg"));
        listaElectredomesticos.add(new Microondas(64.3,10.3,"Chollo"));
        listaElectredomesticos.add(new CampanaExtractora(83.2,5.2,"Ballay"));
        listaElectredomesticos.add(new CampanaExtractora(52.36,3.4,"Roca"));
    
        ArrayList <Electrodomestico> lista = new ArrayList<Electrodomestico>();
        
        for(Electrodomestico e: listaElectredomesticos){
            
            if(e instanceof MuestraInformacion){
                lista.add(e);
            }
            
           
        }
        
        for(Electrodomestico e: lista){
            
            if(e instanceof MuestraInformacion){
                ((MuestraInformacion) e).muestra();
            }
            
        }
        
        ArrayList <Frigorifico> listaFrigorificos = new ArrayList<Frigorifico>();
        
        listaFrigorificos.add(new Frigorifico(200.43,6.4,"Samsung"));
        listaFrigorificos.add(new Frigorifico(15.32,7.8,"Rahi"));
        listaFrigorificos.add(new Frigorifico(52.32,6.8,"Hole"));
        
        Collections.sort(listaFrigorificos);
        for(Frigorifico frigo : listaFrigorificos){
            System.out.println(frigo.toString());
        }
        
    }
}
