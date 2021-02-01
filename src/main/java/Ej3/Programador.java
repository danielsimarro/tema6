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
public class Programador extends Empleado {
    
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Programador(Categoria categoria, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    public Programador() {
        super();
        this.categoria = Categoria.Analista;
    }

    @Override
    public String toString() {
        String atributosEmpleado = super.toString();
        return atributosEmpleado + "Programador{" + "categoria=" + categoria + '}';
    }
    
    
    
}
