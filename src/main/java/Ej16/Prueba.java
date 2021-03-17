/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author NitroPc
 */
public class Prueba {
    
    //Atributo de la lista
    private static ArrayList <Robot>  listaRobot= new ArrayList <Robot> ();
    
    public static void main(String[] args) {
        
        //Creamos la lista con 20 robot
        for(int i = 0; i<20;i++){
            listaRobot.add(new Robot());
        }
        
        //Creacion del comprarator que es el procedimiento que utilizara para ordenar 
        Comparator<Robot> criterioPorcentaje = (r1,r2)->r1.getPorcentajeVida() - (r2.getPorcentajeVida());
        
        System.out.println("Ordenado de menor a mayor: ");
        Collections.sort(listaRobot,criterioPorcentaje);
        listaRobot.forEach(System.out::println);
        
        System.out.println("---------------------------");
        System.out.println("Oredenado de mayor a menor");
        Collections.sort(listaRobot,criterioPorcentaje.reversed());
        listaRobot.forEach(System.out::println);
        
        ArrayList <Robot>  listaRobotMasCincuenta= new ArrayList <Robot> (masCincuenta(listaRobot));
        System.out.println("-----------------------------");
        System.out.println("Lista con mas del 50% de vida: "); 
        listaRobotMasCincuenta.forEach(System.out::println);
        
        System.out.println("------------------------------");
        System.out.println("Ordenar la lista por numero de serie:");
        Collections.sort(listaRobot);
        listaRobot.forEach(System.out::println);
        
        Robot r2 = new Robot();
        
        listaRobot.add(r2);
        
        System.out.println("El Robot r2 se encuentra en la posición " + buscarRobot(r2));
        
    }
    
    //Metodo que devuelve una lista de robots que tienene mas del 50% 
    public static ArrayList<Robot> masCincuenta(ArrayList<Robot> r){
        
        ArrayList <Robot>  lista= new ArrayList <Robot> ();
        
        for(int i = 0;i<r.size();i++){
            if(r.get(i).getPorcentajeVida()>50){
                lista.add(r.get(i));
            }
        }
        
        return lista;
    }
    
    //Metodo para buscar un cliente en la lista
    public static int buscarRobot(Robot r){
        return Collections.binarySearch(listaRobot, r, (r1, r2) -> (Integer) r1.getNumeroSerie().compareTo(r2.getNumeroSerie()));
    }
}
