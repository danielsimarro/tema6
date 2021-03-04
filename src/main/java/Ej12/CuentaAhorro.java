/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12;

/**
 *
 * @author daniel
 */
public class CuentaAhorro extends Cuenta{
    
    private double interes;
    private double comisionAnual;

    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public void actualizarSaldo(double saldo) {
        double saldoActualizado = (saldo + (saldo*interes)-comisionAnual);
        if(saldoActualizado>=0){
            this.setSaldo(saldoActualizado);
        }
    }

    @Override
    public void retirar(double saldo) {
        double saldoDisponible = this.getSaldo()-saldo;
        if(saldoDisponible>=this.getSaldo()){
            this.setSaldo(saldoDisponible);
                 
        }
    }
    
    
}
