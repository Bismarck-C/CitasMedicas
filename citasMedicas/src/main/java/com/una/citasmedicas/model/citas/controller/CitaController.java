/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.model.citas.controller;

import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteController;
import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteInterface;
import com.una.citasmedicas.model.citas.Cita;
import com.una.citasmedicas.model.citas.CitaContainer;
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
    public String[][] citas() throws Exception {
        ArrayList<Cita> array = cCita.mostrarCita();
        
        String[][] matriz = new String[array.size()][5];
        
        for (int i = 0; i < array.size(); i++) {
            Cita auxiliar = array.get(i);
            matriz[i][0] = auxiliar.getNumCitas();
            matriz[i][1] = auxiliar.getIdMedico();
            matriz[i][2] = auxiliar.getIdPaciente();
            matriz[i][3] = auxiliar.getHora();
            matriz[i][4] = auxiliar.getFecha();
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
    public String[][] buscarCitasPaciente(String cedula) throws Exception{
    int contador = 0;
        PacienteInterface paciente = new PacienteController();
        String[][] matrizCitas = this.citas();
        Integer numCitas = Integer.parseInt(paciente.retornarnumCitas(cedula));
        String[][] citasPacientes = new String[numCitas][5];
        for(String[] matriz : matrizCitas){
            if (matriz[2].equals(paciente.buscar(cedula).getCedula())) {
                citasPacientes[contador][0] = matriz[0];
                citasPacientes[contador][1] = matriz[1];
                citasPacientes[contador][2] = matriz[3];
                citasPacientes[contador][3]=  matriz[4];
                contador++;
            }
        }
        return citasPacientes;
    }

    @Override
    public boolean verificarFechasyHorasyCedula(String cedula,String fecha, String hora) throws Exception {
          ArrayList<Cita> matriz = cCita.mostrarCita();

        for (int i = 0; i < matriz.size(); i++) {
            Cita obj = matriz.get(i);
              if (fecha.equals(obj.getFecha())) {
                if (obj.getHora().equals(hora)) {
                    if(obj.getIdMedico().equals(cedula)){
                        return true;
                    
                    }
                    
                }
            }
            
        }
        
          
        
        return false;
    }

}
