package org.unitec.proyectoescuela;

import javax.persistence.Id;

public class Alumno {
    
    @Id
    private String id;
    
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private Integer edad;
    private String email;
    private String direccion;
    private String tipoPago;

    public Alumno() {
    }

    public Alumno(String id) {
        this.id = id;
    }

    public Alumno(String nombre, String apPaterno, String apMaterno, Integer edad, String email, String direccion, String tipoPago) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
        this.tipoPago = tipoPago;
    }

    public Alumno(String id, String nombre, String apPaterno, String apMaterno, Integer edad, String email, String direccion, String tipoPago) {
        this.id = id;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
        this.tipoPago = tipoPago;
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

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
}
