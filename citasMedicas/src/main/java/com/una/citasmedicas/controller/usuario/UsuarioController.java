/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.controller.usuario;

import com.una.citasmedicas.administracion.Usuario;
import com.una.citasmedicas.administracion.UsuarioContainer;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eithel
 */
public class UsuarioController implements UsuarioInterface, LoginInterface {

    private UsuarioContainer usuarioContainer;
    public UsuarioController(){
        try{
        usuarioContainer = new UsuarioContainer();
        }catch(Exception e){
        
        }
        
    }

    @Override
    public String agregar(String[] data) {
        String response = "El usuario no se ha creado";
       
        if (!usuarioContainer.exist(data[5])) {

            
                Usuario usuario = new Usuario(data);
            try {
                if (usuarioContainer.add(usuario)) {

                    response = "se agrego un usuario correctamente";

                } else {
                    response = "Error! Al ingresar el usuario";

                }
            } catch (Exception ex) {
                Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return response;
    }
    
    @Override
    public String[] getByUser(String user) {
        if (usuarioContainer.exist(user)) {

            Usuario usuario = usuarioContainer.find(user);

            String[] data = {usuario.getCedula(),usuario.getNombreCompleto(),usuario.getApellido(),
                usuario.getTelefono(),usuario.getEmail()};
            return data;
        }
        return null;

    }

    @Override
    public String modificar(String user, String[] data) {
        String response = "No se encontro un usuario igual";

        if (UsuarioContainer.exist(user)) {
            UsuarioContainer.find(user).setCedula(data[0]);
            UsuarioContainer.find(user).setNombreCompleto(data[1]);
            UsuarioContainer.find(user).setApellido(data[2]);
            UsuarioContainer.find(user).setTelefono(data[3]);
            UsuarioContainer.find(user).setEmail(data[4]);
     
                    
            response = "Se ha modificado los datos correctamente!";

        }
        return response;

    }

    @Override
    public String eliminar(String user) {

        String response = "Se encuentra registrado el usuario";
        if (usuarioContainer.exist(user) == true) {
            try {
                usuarioContainer.delete(user);
            } catch (Exception ex) {
                Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            }
            response = "Eliminado correctamente";
        } else {
            response = "Error! intente nuevamente";
        }

        return response;
    }

    @Override
    public void mostrar() {
        UsuarioContainer.mostrar();
    }
    
    public Map<String, Usuario> obtenerUsuario(){
    try{
        if(!usuarioContainer.listar().isEmpty()){
          return usuarioContainer.listar();
        }
    }catch(Exception ex){
        ex.getMessage();
    }
    return null;
    }

    @Override
    public boolean login(String usuario, String contrasena) {
        
        return usuario.equals(usuarioContainer.find(usuario).getNombreUsuario()) &&  contrasena.equals(usuarioContainer.find(usuario).getPassword());
    }
}
