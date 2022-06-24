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
    public String[][] Citas()throws Exception;
    public String nombrePaciente(String id)throws Exception;
    public String nombreMedico(String id)throws Exception;
    
    
    
}
