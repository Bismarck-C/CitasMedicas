/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.model.controller.medico;

import com.una.citasmedicas.model.medico.Medico;
import com.una.citasmedicas.model.medico.MedicoContainer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author villa
 */

public class MedicoController implements MedicoInterface {
    
    MedicoContainer medicoC;
    public MedicoController() throws Exception{
        medicoC=new MedicoContainer();
    }
     
     @Override
     public String add(String[] data) {
         String response="El elemento ya fue registrados previamente";
        try{
            if(!medicoC.exist(data[0])){
                Medico medico=new Medico(data);
                
                medicoC.add(medico);
                response="Guardado exitosamente!";
            }
        }catch(Exception ex){
            response="Se ha producido un error, contacte al administrador del sistema";
            ex.printStackTrace();
        }        
        return response;
    }
    @Override
      public String find(String id) {
          String response = "No se encontro el medico";
        try {
            if(medicoC.exist(id)){
                return medicoC.find(id).toString();
                
            }else{
             return response;
            }
        } catch (Exception ex) {
            Logger.getLogger(MedicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    @Override
      public String[][] getAll(){
        try{
            ArrayList<Medico> list=medicoC.getAll();
            String[][] data=new String[list.size()][8];
            for(int i=0;i<list.size();i++){
                Medico aux=list.get(i);
                data[i][0]=String.valueOf(aux.getCedula());
                data[i][1]=aux.getNombre();
                data[i][2]=aux.getApellidos();
                data[i][3]=aux.getTelefono();
                data[i][4]=aux.getCorreo();
                data[i][5]=aux.getDireccion();
                data[i][6]=aux.getFechaNacimiento();
                data[i][7]=aux.getEspecialidad();
            }
            return data;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;            
        }
      }
        
     @Override
     public String modificar(String id, String[] data) {
        String response = "No se encontro una cedula igual ";
        
        try {
            if(medicoC.modificar(id, data)){
                
                response = "Se ha modificado los datos correctamente!";
                
            }
        } catch (Exception ex) {
            Logger.getLogger(MedicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
      
    }
    

    @Override
    public String delete(String id) {
        String response = "No se encontro el medico!";
        try {
            if(medicoC.eliminar(id)){
                
                response = "Se ha eliminado los datos correctamente!";
                
            }
        } catch (Exception ex) {
            Logger.getLogger(MedicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
      
    }

   
    
}
