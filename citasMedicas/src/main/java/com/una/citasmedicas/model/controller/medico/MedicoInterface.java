/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.citasmedicas.model.controller.medico;

/**
 *
 * @author villa
 */
public interface MedicoInterface {
    public String add(String[] data);
    public String modificar(String id,String[] data);
    public String find(String id);
    public String[][] getAll();
    public String delete(String id);
}
