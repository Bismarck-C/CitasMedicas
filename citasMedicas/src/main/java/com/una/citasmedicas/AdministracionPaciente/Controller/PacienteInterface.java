package com.una.citasmedicas.AdministracionPaciente.Controller;

import com.una.citasmedicas.AdministracionPaciente.Model.PacienteEntity;

public interface PacienteInterface {

    public String add(String[] data);

    public String delete(String cedula);

    public PacienteEntity buscar(String cedula);

    public String modificar(String[] data, String cedula);

    public String retornarnumCitas(String cedula);

    public String SumarUnaCita(String cedula);
    
    public String[][] getAll();

}
