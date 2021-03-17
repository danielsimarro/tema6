/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej13;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Arraylist {
    
    private static ArrayList <Persona> listaPersona = new ArrayList<Persona>();
    
    public static void main(String[] args) {
        
        Direccion d1 = new Direccion("Angeles","Malaga","29670","España");
        Direccion d2 = new Direccion("Pajarito","Huelva","29650","España");
        Direccion d3 = new Direccion("Leones","Jaen","25421","España");
        Direccion d4 = new Direccion("Garrrones","Granada","26531","España");
        
        Estudiante e1 = new Estudiante ("52641","Marco","Nieto","79147331F",d1);
        Estudiante e2 = new Estudiante ("56451","Elena","Lozano","526478547T",d3);
        
        Profesor p1 =  new Profesor ("Matematicas","Manuel","Alvarez","56854785L",d4);
        Profesor p2 =  new Profesor ("Lengua","Alex","Lopez","65247854P",d2);
        
        listaPersona.add(e1);
        listaPersona.add(e2);
        listaPersona.add(p1);
        listaPersona.add(p2);
        
        for(Persona p: listaPersona){
            
            p.identificate();
            
            if(p instanceof Estudiante){
                System.out.println(((Estudiante) p).getIdEstudiante());
            }
            
            if(p instanceof Profesor){
                System.out.println(((Profesor) p).getEspecialidad());
            }
        }
    }
    //No puedes crear una persona ya que es una clase abstracta
}
