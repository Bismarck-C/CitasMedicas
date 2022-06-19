package com.una.citasmedicas.model;
/**
 *
 * @author villa
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private String direccion;
    private String fechaNacimiento;

    
    public String ToString(){
        String retornar ="Cedula: "+ this.cedula+"nombre: "+this.nombre+"\n"+"Apellidos: "+this.apellidos+"Telefono: "+this.telefono+"\n"+
                "Correo: "+this.correo+ "Direccion: "+ this.direccion+"Fecha de Nacimiento: "+this.fechaNacimiento;
        return retornar;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

