/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.controller.usuario;

import com.una.citasmedicas.administracion.Usuario;
import com.una.citasmedicas.administracion.UsuarioContainer;

/**
 *
 * @author Eithel
 */
public class UsuarioController implements UsuarioInterface {

    @Override
    public String agregar(String[] data) {
         String response = "El usuario no se ha creado";
        if(UsuarioContainer.exist(data[7])){
         response = "El usuario ya existe";
        
        }else{
            Usuario usuario =new Usuario(data);
            if(UsuarioContainer.add(usuario)){
              response="Error al ingresar el usaurio ";
           }else{
             response="se agrego un usuario correctamente";
            }
        }
  
        return response;
    }

    @Override
    public String modificar(String usuario, String[] data) {
        String response = "No se encontro un usuario igual ";
        
        if(UsuarioContainer.exist(usuario)){
            UsuarioContainer.get(usuario).update(data);
            response = "Se ha modificado los datos correctamente!";
            
        }
        return response;
        
    }

    @Override
    public String eliminar(String usuario) {
        String response = "Error no se a borrado el objeto. ";
        
        if(UsuarioContainer.delete(usuario)){
           response = "Se borro el usuario correctamente";
           
       }
        
        return response;
    }

    @Override
    public void mostrar() {
        UsuarioContainer.mostrar();
    }
    
}
