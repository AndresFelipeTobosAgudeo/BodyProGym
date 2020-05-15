/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.bodyprogym.dto;

import java.util.Date;

/**
 *
 * @author anfel
 */
public class Deportista {
    
    private String nombreCompleto;
    private int edad;
    private int peso;
    private float Estatura;
    private float imc;
    private String tipoPlan;
    private Date fechaIngreso;
    private Date fechaCortePago;
    private int valorPlan;
    private int comprasRealizadas;
    private String cedulaYcaracEsp;

    public Deportista(String nombreCompleto, int edad, int peso, float Estatura, float imc, String tipoPlan, Date fechaIngreso, Date fechaCortePago, int valorPlan, int comprasRealizadas, String cedulaYcaracEsp) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.peso = peso;
        this.Estatura = Estatura;
        this.imc = imc;
        this.tipoPlan = tipoPlan;
        this.fechaIngreso = fechaIngreso;
        this.fechaCortePago = fechaCortePago;
        this.valorPlan = valorPlan;
        this.comprasRealizadas = comprasRealizadas;
        this.cedulaYcaracEsp = cedulaYcaracEsp;
    }

    
    public Deportista() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return Estatura;
    }

    public void setEstatura(float Estatura) {
        this.Estatura = Estatura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaCortePago() {
        return fechaCortePago;
    }

    public void setFechaCortePago(Date fechaCortePago) {
        this.fechaCortePago = fechaCortePago;
    }

    public int getValorPlan() {
        return valorPlan;
    }

    public void setValorPlan(int valorPlan) {
        this.valorPlan = valorPlan;
    }

    public int getComprasRealizadas() {
        return comprasRealizadas;
    }

    public void setComprasRealizadas(int comprasRealizadas) {
        this.comprasRealizadas = comprasRealizadas;
    }

    public String getCedulaYcaracEsp() {
        return cedulaYcaracEsp;
    }

    public void setCedulaYcaracEsp(String cedulaYcaracEsp) {
        this.cedulaYcaracEsp = cedulaYcaracEsp;
    }

                             
    
}
