package com.una.citasmedicas;


import com.una.citasmedicas.AdministracionPaciente.Controller.PacienteController;
import com.una.citasmedicas.view.FrmLogin;



public class CitasMedicas {
 
    public static void main(String[] args) throws Exception {

        
        //new FrmLogin().setVisible(true);
        
       PacienteController instance = new PacienteController();
        String id = "208310449";
      
        System.out.println(instance.delete(id));
    
    }
}

