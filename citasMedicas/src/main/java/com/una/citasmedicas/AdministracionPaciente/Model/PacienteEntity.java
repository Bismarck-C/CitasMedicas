package com.una.citasmedicas.AdministracionPaciente.Model;
import com.una.citasmedicas.model.Persona;

public class PacienteEntity extends Persona {

    private String personaContacto;
    private String numeroContacto;
    private short numeroCitas;

    public PacienteEntity() {
        super();
    }
    
    public PacienteEntity(String[] data) {
        super();
        
        this.setCedula(data[0]);
        this.setNombre(data[1]);
        this.setApellidos(data[2]);
        this.setTelefono(data[3]);
        this.setCorreo(data[4]);
        this.setDireccion(data[5]);
        this.setFechaNacimiento(data[6]);         
        this.personaContacto = data[7];
        this.numeroContacto = data[8];
        this.numeroCitas = 0;
    }
 
    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public short getNumeroCitas() {
        return numeroCitas;
    }

    public void setNumeroCitas(short numeroCitas) {
        this.numeroCitas = numeroCitas;
    }
    
}
