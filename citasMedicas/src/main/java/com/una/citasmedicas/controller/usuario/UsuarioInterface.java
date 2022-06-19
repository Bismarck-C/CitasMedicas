/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.citasmedicas.controller.usuario;

/**
 *
 * @author Eithel
 */
public interface UsuarioInterface {
    public String agregar(String []data);
    public String modificar(String usuario,String[] data);
    public String eliminar(String usuario);
    public void mostrar();
}
