package com.una.citasmedicas.AdministracionPaciente.Controller;

public interface PacienteInterface {

    public String add(String[] data);

    public String delete(String cedula);

   public String[] buscar(String id);

    public String modificar(String[] data);

}
