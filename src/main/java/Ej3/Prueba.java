/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

/**
 *
 * @author NitroPc
 */
public class Prueba {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Manuel","283920N",22);
        Persona p2 = new Persona("Juan","6656784S",45);
        
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado(1250, "Jimmy","3873896H",18);
        
        Programador pr1 = new Programador();
        Programador pr2 = new Programador(Categoria.Analista,5200,"Estefania","9574904J",38);
        
        System.out.println("El nombre del programador es: " + pr1.getNombre());
        
        System.out.println(p1.toString());
        
        System.out.println(e1.toString());
        
        System.out.println(pr2.toString());
    }
}
