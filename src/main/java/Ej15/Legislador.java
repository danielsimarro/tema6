/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej15;

/**
 *
 * @author NitroPc
 */
public abstract class Legislador extends Persona{
    
    private String provincia;
    private String partidoPolitico;

    public Legislador(String provincia, String partidoPolitico, String nombre, String Apellidos) {
        super(nombre, Apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }
    
    

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        String atributosPersona = super.toString();
        return atributosPersona + "\nLegislador{" + "provincia=" + provincia + ", partidoPolitico=" + partidoPolitico + '}';
    }
    
    public abstract String getCamara();
    
}
