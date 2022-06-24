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

        String[] vector = new String[9];

        try {
            if (objContainer.exist(id)) {
                PacienteEntity paciente = objContainer.buscar(id);
                if (paciente != null) {

                    vector[0] = "Cedula: " + String.valueOf(paciente.getCedula());
                    vector[1] = "Nombre: " + String.valueOf(paciente.getNombre());
                    vector[2] = "apellidos: " + String.valueOf(paciente.getApellidos());
                    vector[3] = "Numero telefonico: " + String.valueOf(paciente.getTelefono());
                    vector[4] = "Correo Electronico: " + String.valueOf(paciente.getCorreo());
                    vector[5] = "Dirrecion de domicilio: " + String.valueOf(paciente.getDireccion());
                    vector[6] = "Fecha de nacimiento: " + String.valueOf(paciente.getFechaNacimiento());
                    vector[7] = "Persona en caso de emergecia: " + String.valueOf(paciente.getPersonaContacto());
                    vector[8] = "Numero en caso de emergencia: " + String.valueOf(paciente.getNumeroContacto());

                } else {
                    vector = null;
                }
            }
        } catch (Exception ex) {
            vector = null;
            ex.printStackTrace();
        }
        return vector;
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

    @Override
    public String retornarnumCitas(String cedula) {
        String respuesta = "Error";
        try {
            if (objContainer.exist(cedula)) {
                short numero = objContainer.retornarnumCitas(cedula);
                respuesta = String.valueOf(numero);
            } else {
                respuesta = "Cedula ingresada no se encuentra agregada";
            }

        } catch (Exception ex) {
            respuesta = "Se ha producido un error, contacte al administrador del sistema";
            ex.printStackTrace();
        }
        return respuesta;
    }

    @Override
    public String SumarUnaCita(String cedula) {
        String respuesta = "Error";

        try {
            if (objContainer.exist(cedula)) {
                objContainer.SumarUnaCita(cedula);
                respuesta = "Se agrego una cita";
            } else {
                respuesta = "Cedula ingresada no se encuentra agregada";
            }
        } catch (Exception ex) {
            respuesta = "Se ha producido un error, contacte al administrador del sistema";

        }
        return respuesta;
    }

}
