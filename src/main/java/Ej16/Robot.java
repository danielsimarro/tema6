/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej16;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author NitroPc
 */
public class Robot implements Comparable<Robot>{

    //Atributos de la clase robot
    private int numeroSerie;
    private int porcentajeVida;

    //Atributos para controlar la clas
    private static ArrayList<Integer> listaSerie = new ArrayList<>();
    private static Random random = new Random();

    //Constructor de la clase Robot
    public Robot() {
        this.numeroSerie = numeroSerie();
        this.porcentajeVida = valoresAleatorios();
    }

    //Getters y setter
    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(int porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    ///Metodo que genera valores aleatorios entre 1 - 100
    private int valoresAleatorios() {

        return random.nextInt(100 - 1 + 1) + 1;
    }

    //Metodo que genera un numero aleatorio para el numero de Serie
    private int numeroSerie() {

        boolean duplicado;
        int numero;

        do {
            numero = random.nextInt(1000 - 1 + 1) + 1;

            duplicado = comprobarDubplicado(numero);

            if (duplicado == false) {
                listaSerie.add(numero);
            }

        } while (duplicado == true);

        return numero;
    }

    //Metodo que comprueba que el valor no este repetido
    private boolean comprobarDubplicado(int numero) {

        boolean valor = false;

        if (!listaSerie.isEmpty()) {

            for (int i = 0; i < listaSerie.size(); i++) {
                if (numero == listaSerie.get(i)) {
                    valor = true;

                }
            }

        }

        return valor;
    }

    //To String
    @Override
    public String toString() {
        return "Numero de serie= " + numeroSerie + ", Porcentaje de vida= " + porcentajeVida;
    }

    @Override
    public int compareTo(Robot r) {
        return this.getNumeroSerie() - r.getNumeroSerie();
    }

   
}
