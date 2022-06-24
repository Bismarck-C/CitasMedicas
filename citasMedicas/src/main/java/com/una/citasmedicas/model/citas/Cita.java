/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.model.citas;

import com.una.citasmedicas.AdministracionPaciente.Model.PacienteEntity;
import com.una.citasmedicas.model.medico.Medico;

/**
 *
 * @author villa
 */
public class Cita {
    private Integer numCitas;
    private Medico doctor;
    private PacienteEntity paciente;
    private String fecha;
    private String hora;

    public Cita(Integer numCitas, Medico doctor, PacienteEntity paciente,String fecha, String hora) {
        this.numCitas = numCitas;
        this.doctor = doctor;
        this.paciente = paciente;
        this.hora = hora;
        this.fecha = fecha;
    }

    /**
     * @return the numCitas
     */
    public Integer getNumCitas() {
        return numCitas;
    }

    /**
     * @param numCitas the numCitas to set
     */
    public void setNumCitas(Integer numCitas) {
        this.numCitas = numCitas;
    }

    /**
     * @return the doctor
     */
    public Medico getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(Medico doctor) {
        this.doctor = doctor;
    }

    /**
     * @return the paciente
     */
    public PacienteEntity getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
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
    
    
    
    
}
