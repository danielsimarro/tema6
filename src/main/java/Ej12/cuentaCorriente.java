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
public class cuentaCorriente extends Cuenta{
    
    private final double interes = 1.5;
    private double saldoMin;

    public cuentaCorriente(double saldoMin, Persona cliente) {
        super(cliente);
        this.saldoMin = saldoMin;
    }

    

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return "cuentaCorriente{" + "interes=" + interes + ", saldoMin=" + saldoMin + '}';
    }

    @Override
    public void actualizarSaldo(double saldo) {
        if(this.getSaldo()>1000){
            this.setSaldo(saldo +(saldoMin*interes));
        }else{
            this.setSaldo(saldo+(saldo+interes));
        }
    }

    @Override
    public void retirar(double saldo) {
        double saldoRetirar = this.getSaldo() - saldo;
        if(saldoRetirar>=this.saldoMin){
            this.setSaldo(saldoRetirar);
        }
    }
    
    
    
}
