package com.una.citasmedicas.AdministracionPaciente.Controller;

import com.una.citasmedicas.AdministracionPaciente.Model.PacienteContainer;
import com.una.citasmedicas.AdministracionPaciente.Model.PacienteEntity;
import com.una.citasmedicas.model.controller.medico.MedicoController;
import com.una.citasmedicas.model.medico.Medico;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteController implements PacienteInterface {

    PacienteContainer objContainer;

    public PacienteController() throws Exception {
        objContainer = new PacienteContainer();
    }

    @Override
    public String add(String[] data) {  //agregar un paciente al container
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
    public String delete(String cedula) {  //Elimina el nodo
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
    public PacienteEntity buscar(String cedula) {
            String respuesta = "Error";
        try {
            if(objContainer.exist(cedula)){
                return objContainer.buscar(cedula);              
            }else{
             return null;
            }
        } catch (Exception ex) {
           respuesta = "Se ha producido un error, contacte al administrador del sistema";
            ex.printStackTrace();
        }
        return null;

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

    @Override
    public String[][] getAll() {
        try{
            ArrayList<PacienteEntity> list=objContainer.getAll();
            String[][] data=new String[list.size()][9];
            for(int i=0;i<list.size();i++){
                PacienteEntity aux=list.get(i);
                data[i][0]=String.valueOf(aux.getCedula());
                data[i][1]=aux.getNombre();
                data[i][2]=aux.getApellidos();
                data[i][3]=aux.getTelefono();
                data[i][4]=aux.getCorreo();
                data[i][5]=aux.getDireccion();
                data[i][6]=aux.getFechaNacimiento();
                data[i][7]=aux.getPersonaContacto();
                data[i][8]=aux.getNumeroContacto();
              
            }
            return data;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;            
        }
    }

}
