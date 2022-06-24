/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.model.citas.controller;

import com.una.citasmedicas.AdministracionPaciente.Model.PacienteContainer;
import com.una.citasmedicas.model.citas.Cita;
import com.una.citasmedicas.model.citas.CitaContainer;
import com.una.citasmedicas.model.medico.MedicoContainer;
import java.util.ArrayList;

/**
 *
 * @author Eithel
 */
public class CitaController implements CitaInterface{
    CitaContainer cCita;
    public CitaController() throws Exception{
        cCita = new CitaContainer();
    }
    
    
    @Override
    public String[][] Citas() throws Exception {
        ArrayList<Cita> array = cCita.mostrarCita();
        
        String[][] matriz = new String[array.size()][5];
        
        for (int i = 0; i < array.size(); i++) {
            Cita auxiliar = array.get(i);
            
            matriz[i][0] = auxiliar.getNumCitas();
            matriz[i][1] = nombreMedico(auxiliar.getIdMedico());
            matriz[i][2] = nombrePaciente(auxiliar.getIdPaciente());
            matriz[i][3] = auxiliar.getFecha();
            matriz[i][4] = auxiliar.getHora();
        }
        return matriz;   
    }
    @Override
    public String agregar(String[] data) {
        String response="El elemento ya fue registrados previamente";
        try{
            if(!cCita.exist(data[0])){
                Cita cita = new Cita(data);
                cCita.agregar(cita);
                response="Guardado exitosamente!";
            }

        }catch(Exception ex){
            response="Se ha producido un error, contacte al administrador del sistema";
            ex.printStackTrace();
        }
        return response;
    }
    @Override
    public String nombrePaciente(String id) throws Exception {
        PacienteContainer cPaciente = new PacienteContainer();
        return cPaciente.buscar(id).getNombre();
    }

    @Override
    public String nombreMedico(String id)throws Exception {
        MedicoContainer cMedic = new MedicoContainer();
        return cMedic.find(id).getNombre();

    }

}
