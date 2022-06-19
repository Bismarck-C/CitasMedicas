/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.administracion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Eithel
 */
public class UsuarioContainer {
     private static Map<String,Usuario> cUser=new HashMap<>();
    public static boolean exist(String usuario){
        if(cUser.containsKey(usuario)){
            return true;
        }
        return false;
    }
    public static boolean add(Usuario user){
        if(exist(user.getNombreUsuario())){
            return true;
        }else{
            cUser.put(user.getNombreUsuario(), user);
            return false;
        }
    }
    public static Usuario find(String usuario){
        if(exist(usuario)){
            return cUser.get(usuario);
        }
        return null;
    }
    
    public static boolean delete(String usuario){
          if(exist(usuario)){
              cUser.remove(usuario);
              return true; 
          } else {
             return false; 
         }
    }
    
    public static Usuario get(String usuario){
        if(exist(usuario)){
            return cUser.get(usuario);
        }
        return null;
    }
        
    public static void mostrar(){
        cUser.values().toString();
  
    }
}
