/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.administracion;

import com.una.citasmedicas.model.Persona;

/**
 *
 * @author Eithel
 */
public class Usuario extends Persona {
    private String nombreUsuario;
    private String password;

   public Usuario(String[] data) {
        super();
        this.setCedula(data[0]);
        this.setNombre(data[1]);
        this.setApellidos(data[2]);
        this.setTelefono(data[3]);
        this.setCorreo(data[4]);
        this.setDireccion(data[5]);
        this.setFechaNacimiento(data[6]);
        this.nombreUsuario = data[7];
        this.password = data[8];
        
   }
    public Usuario(){
        super();
        
    }

   

     public boolean update(String[] data){
         
        
        this.setNombre(data[0]);
        this.setApellidos(data[1]);
        this.setTelefono(data[2]);
        this.setCorreo(data[3]);
        this.setDireccion(data[4]);
        this.setFechaNacimiento(data[5]);
         
        
        
        return true;
    }
     
    @Override
     public String toString(){
       
        System.out.println("====================================");
        System.out.println("||        Usuario: "+this.getNombreUsuario());
        System.out.println("||        Cedula: "+this.getCedula());
        System.out.println("||        Nombre:"+this.getNombre());
        System.out.println("||        Apellido: "+this.getApellidos());
        System.out.println("||        Telefono:"+this.getTelefono());
        System.out.println("||        Email: "+this.getCorreo());
        System.out.println("||        Direccion: "+this.getDireccion());
        System.out.println("||        Fecha de nacimiento: "+this.getFechaNacimiento());
        System.out.println("====================================");
        
        return null;
     }

    /**
     * @return the NombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param NombreUsuario the NombreUsuario to set
     */
    public void setNombreUsuario(String NombreUsuario) {
        this.nombreUsuario = NombreUsuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
