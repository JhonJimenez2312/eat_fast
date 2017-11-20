package com.example.admin.eat_fast;

/**
 * Created by Admin on 19/11/2017.
 */

public class Usuario {

    private String id;
    private String cedula;
    private String nombre;
    private String apellido;
    private int sexo;
    private String tipo;


    public Usuario(String id, String cedula, String nombre, String apellido, int sexo, String tipo) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void guardar(){
        Datos.guardarPersona(this);
    }

    public void modificar(){Datos.actualizar(this);}

    public void eliminar(){Datos.eliminar(this);}
}
