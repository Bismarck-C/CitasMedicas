package com.una.citasmedicas.AdministracionPaciente.Controller;

import com.una.citasmedicas.AdministracionPaciente.Model.PacienteContainer;
import com.una.citasmedicas.AdministracionPaciente.Model.PacienteEntity;

public class PacienteController implements PacienteInterface {

    PacienteContainer obj;

    public PacienteController() throws Exception {
        obj = new PacienteContainer();
    }

    @Override
    public String add(String[] data) {
        String Respuesta = "error";
        try {
            if (obj.exist(data[0])) {
                Respuesta = "La cedula ingreasada YA se encuentra registrada";
            } else {
                PacienteEntity newObj = new PacienteEntity(data);
                obj.add(newObj);
                Respuesta = "Paciente agregado";
            }
        } catch (Exception ex) {
            Respuesta = "Se ha producido un error, contacte al administrador del sistema";
            ex.printStackTrace();
        }
        return Respuesta;
    }

    @Override
    public String delete(String cedula) {
        String respuesta = "Error";
        try {
            
            if (obj.exist(cedula)) {
                obj.delete(cedula);
                respuesta = "Paciente eliminado";
            } else {
                respuesta = "La cedula ingreasada no se encuentra registrada";
            }
        } catch (Exception ex) {
               respuesta = "Se ha producido un error, contacte al administrador del sistema";
            ex.printStackTrace();
        }
        return respuesta;
    }

    @Override
    public String[] buscar(String id) {

        String[] PacienteEntity = new String[9];

        try {
            PacienteEntity paciente = obj.buscar(id);
            if (paciente != null) {

                PacienteEntity[0] = String.valueOf(paciente.getCedula());
                PacienteEntity[1] = String.valueOf(paciente.getNombre());
                PacienteEntity[2] = String.valueOf(paciente.getApellidos());
                PacienteEntity[3] = String.valueOf(paciente.getTelefono());
                PacienteEntity[4] = String.valueOf(paciente.getCorreo());
                PacienteEntity[5] = String.valueOf(paciente.getDireccion());
                PacienteEntity[6] = String.valueOf(paciente.getFechaNacimiento());
                PacienteEntity[7] = String.valueOf(paciente.getPersonaContacto());
                PacienteEntity[8] = String.valueOf(paciente.getNumeroContacto());

            } else {
                PacienteEntity = null;
            }
        } catch (Exception ex) {
            PacienteEntity = null;
            ex.printStackTrace();
        }
        return PacienteEntity;
    }

    @Override
    public String modificar(String[] data) {
        String respuesta = "error";
        try {
            if (obj.modificar(data)) {
                respuesta = "Se modifico";
            } else {
                respuesta = "cedula ingresada no se encuentra agregada";
            }
        } catch (Exception ex) {
           respuesta = "Se ha producido un error, contacte al administrador del sistema";
            ex.printStackTrace();
        }
        return respuesta;
    }

}
