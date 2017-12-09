package org.unitec.proyectoescuela;

import java.util.Date;
import javax.persistence.Id;

public class Curso {
    
    @Id
    private String id;
    
    private String nombre;
    private String duracion;
    private Date fechaInicio;
    private Date fechaTermino;
    private String horarios;
    private Integer alumnosInscritos;
    private Float costo;

    public Curso() {
    }

    public Curso(String id) {
        this.id = id;
    }

    public Curso(String nombre, String duracion, Date fechaInicio, Date fechaTermino, String horarios, Integer alumnosInscritos, Float costo) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.horarios = horarios;
        this.alumnosInscritos = alumnosInscritos;
        this.costo = costo;
    }

    public Curso(String id, String nombre, String duracion, Date fechaInicio, Date fechaTermino, String horarios, Integer alumnosInscritos, Float costo) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.horarios = horarios;
        this.alumnosInscritos = alumnosInscritos;
        this.costo = costo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public Integer getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void setAlumnosInscritos(Integer alumnosInscritos) {
        this.alumnosInscritos = alumnosInscritos;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    
}
