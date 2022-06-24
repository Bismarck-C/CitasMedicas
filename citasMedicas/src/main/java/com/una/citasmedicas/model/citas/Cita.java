/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.model.citas;



/**
 *
 * @author villa
 */
public class Cita {
    private String numCitas;
    private String idMedico;
    private String idPaciente;
    private String hora;   
    private String fecha;

    public Cita(String[] data) {
        this.numCitas=data[0];
        this.idMedico=data[1]; 
        this.idPaciente=data[2];
        this.hora=data[3];
        this.fecha=data[4];
    }

    /**
     * @return the numCitas
     */
    public String getNumCitas() {
        return numCitas;
    }

    /**
     * @param numCitas the numCitas to set
     */
    public void setNumCitas(String numCitas) {
        this.numCitas = numCitas;
    }


    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the idMedico
     */
    public String getIdMedico() {
        return idMedico;
    }

    /**
     * @param idMedico the idMedico to set
     */
    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    /**
     * @return the idPaciente
     */
    public String getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }
    
    
    
    
}
