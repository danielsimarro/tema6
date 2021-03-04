/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12;

import java.util.Random;
import java.util.Set;

/**
 *
 * @author daniel
 */
public abstract class Cuenta {
    
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {
        this.numeroCuenta = numeroAleatorio();
        this.saldo = 0;
        this.cliente = cliente;
    }


    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    
    public abstract void actualizarSaldo(double saldo);
    
    public abstract void retirar(double saldo);
    
    private String numeroAleatorio(){
        
    String cuenta = "";
     
     Random aleatorio = new Random();
     for(int i = 0; i<20;i++){
         if(i<4){
             cuenta += (char)(aleatorio.nextInt(91)+65);
         }else{
             cuenta += aleatorio.nextInt(10);
         }
     }
    
     return cuenta;
    }
}
