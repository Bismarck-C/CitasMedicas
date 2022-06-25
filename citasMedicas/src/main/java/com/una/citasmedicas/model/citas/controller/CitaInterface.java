/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.citasmedicas.model.citas.controller;

/**
 *
 * @author Eithel
 */
public interface CitaInterface {
    public String agregar(String[] data);
    public String[][] citas()throws Exception;
    public String[][] buscarCitasPaciente(String cedula) throws Exception;
    public boolean verificarFechasyHorasyCedula(String cedula,String fecha, String hora)throws Exception;
    
    
}
