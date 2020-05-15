/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.bodyprogym.dto;

/**
 *
 * @author anfel
 */
public class Asistente {
    
    private String nombreCompleto;
    private String cedulaYcaracEsp;

    public Asistente(String NombreCompleto, String CedulaYcaracEsp) {
        this.nombreCompleto = NombreCompleto;
        this.cedulaYcaracEsp = CedulaYcaracEsp;
    }

    public Asistente() {
    
    }
   
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.nombreCompleto = NombreCompleto;
    }

    public String getCedulaYcaracEsp() {
        return cedulaYcaracEsp;
    }

    public void setCedulaYcaracEsp(String CedulaYcaracEsp) {
        this.cedulaYcaracEsp = CedulaYcaracEsp;
    }
    
    
}
