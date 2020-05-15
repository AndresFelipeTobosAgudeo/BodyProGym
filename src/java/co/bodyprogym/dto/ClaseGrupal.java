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
public class ClaseGrupal {
    
    private String nombre;
    private int id;	 
    private Date fecha;
    private String instructor;
    private int capacidad;	 
    private String objetivo;	 
    private String horario;
    private float costo;
    private String lugar;
    private Deportista deportista;

    public ClaseGrupal(String nombre, int id, Date fecha, String instructor, int capacidad, String objetivo, String horario, float costo, String lugar, Deportista deportista) {
        this.nombre = nombre;
        this.id = id;
        this.fecha = fecha;
        this.instructor = instructor;
        this.capacidad = capacidad;
        this.objetivo = objetivo;
        this.horario = horario;
        this.costo = costo;
        this.lugar = lugar;
        this.deportista = deportista;
    }

    
    public ClaseGrupal() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Deportista getDeportista() {
        return deportista;
    }

    public void setDeportista(Deportista deportista) {
        this.deportista = deportista;
    }
    
    
    
    
}
