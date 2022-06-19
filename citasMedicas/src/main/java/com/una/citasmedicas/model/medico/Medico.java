/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.model.medico;

import com.una.citasmedicas.model.Persona;

/**
 *
 * @author villa
 */
public class Medico extends Persona {
    private String especialidad;
    
    public Medico(){
        super();
    
    }
    
    public Medico(String[] data){
    super();
       this.setCedula(data[0]);
       this.setNombre(data[1]);
       this.setApellidos(data[2]);
       this.setTelefono(data[3]);
       this.setCorreo(data[4]);
       this.setDireccion(data[5]);
       this.setFechaNacimiento(data[6]);
       this.especialidad = data[7];
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String toString(){
       String s ="Cedula: "+this.getCedula()+"\n"+"nombre: "+this.getNombre()+"\n"+"Apellidos: "+this.getApellidos()+"\n"+"Telefono: "+this.getTelefono()+"\n"+
                "Correo: "+this.getCorreo()+"\n"+ "Direccion: "+ this.getDireccion()+"\n"+"Fecha de Nacimiento: "+this.getFechaNacimiento()+"\n"+"Especialidad: "+this.getEspecialidad();
        return s;
    
    
    }
    /*public boolean modificar(String[] data){
       this.setNombre(data[1]);
       this.setApellidos(data[2]);
       this.setDireccion(data[3]);
       this.setCorreo(data[4]);
       this.setTelefono(data[5]);
       this.setEspecialidad(data[6]);
       return true;
    
    }*/
    
}
