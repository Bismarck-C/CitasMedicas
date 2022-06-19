package com.una.citasmedicas.AdministracionPaciente.Controller;

import com.una.citasmedicas.AdministracionPaciente.Model.PacienteContainer;
import com.una.citasmedicas.AdministracionPaciente.Model.PacienteEntity;

public class PacienteController implements PacienteInterface {

    PacienteContainer objContainer;

    public PacienteController() throws Exception {
        objContainer = new PacienteContainer();
    }

    @Override
    public String add(String[] data) {
        String Respuesta = "error";
        try {
            if (objContainer.exist(data[0])) {
                Respuesta = "La cedula ingreasada YA se encuentra registrada";
            } else {
                PacienteEntity newObj = new PacienteEntity(data);
                objContainer.add(newObj);
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
            if (objContainer.exist(cedula)) {
                objContainer.delete(cedula);
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

        String[] ObjEntity = new String[9];

        try {
            PacienteEntity paciente = objContainer.buscar(id);
            if (paciente != null) {

                ObjEntity[0] = String.valueOf(paciente.getCedula());
                ObjEntity[1] = String.valueOf(paciente.getNombre());
                ObjEntity[2] = String.valueOf(paciente.getApellidos());
                ObjEntity[3] = String.valueOf(paciente.getTelefono());
                ObjEntity[4] = String.valueOf(paciente.getCorreo());
                ObjEntity[5] = String.valueOf(paciente.getDireccion());
                ObjEntity[6] = String.valueOf(paciente.getFechaNacimiento());
                ObjEntity[7] = String.valueOf(paciente.getPersonaContacto());
                ObjEntity[8] = String.valueOf(paciente.getNumeroContacto());

            } else {
                ObjEntity = null;
            }
        } catch (Exception ex) {
            ObjEntity = null;
            ex.printStackTrace();
        }
        return ObjEntity;
    }

    @Override
    public String modificar(String[] data, String cedula) {
        String respuesta = "Error";
        try {
            if (objContainer.modificar(data, cedula)) {
                respuesta = "Se modifico";
            } else {
                respuesta = "Cedula ingresada no se encuentra agregada";
            }
        } catch (Exception ex) {
            respuesta = "Se ha producido un error, contacte al administrador del sistema";
            ex.printStackTrace();

        }
        return respuesta;
    }

}
