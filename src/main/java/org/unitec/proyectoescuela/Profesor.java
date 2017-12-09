package org.unitec.proyectoescuela;

import javax.persistence.Id;

public class Profesor {
 
    @Id
    private String id;
    
    private String nombre;
    private String curso;
    private String departamento;

    public Profesor() {
    }

    public Profesor(String id) {
        this.id = id;
    }

    public Profesor(String nombre, String curso, String departamento) {
        this.nombre = nombre;
        this.curso = curso;
        this.departamento = departamento;
    }

    public Profesor(String id, String nombre, String curso, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.departamento = departamento;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
