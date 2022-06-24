
package com.una.citasmedicas.model.citas;

import com.una.citasmedicas.model.XmlAdapter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author Eithel
 */
public class CitaContainer extends XmlAdapter{
    
    public CitaContainer() throws Exception {
        super("Citas");
    }
    
    
    public boolean add(Citas cita) throws Exception{
    
        DocumentBuilder builder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc=builder.parse(this.url);
        doc.getDocumentElement().normalize();
    
        // Cita
        Element citas = doc.createElement("Cita");
        Element numCita = doc.createElement("Numerodecita");
        Element hora = doc.createElement("Hora");
        Element fecha = doc.createElement("Fecha");
        
        
        numCita.appendChild(doc.createTextNode(String.valueOf(cita.getNumCitas())));
        hora.appendChild(doc.createTextNode(cita.getHora()));
        fecha.appendChild(doc.createTextNode(cita.getFecha()));
        
        
        citas.appendChild(numCita);
        citas.appendChild(hora);
        citas.appendChild(fecha);
        
        
        /*
        NodeList ramas = doc.getElementsByTagName("Citas");
        ramas.item(0).appendChild(citas);
        
  
        //Paciente
        Element pacien = doc.createElement("Paciente");
        Element id = doc.createElement("Cedula");
        Element nom = doc.createElement("Nombre");
        Element apelli = doc.createElement("Apellido");
        Element tele = doc.createElement("Telefono");
        Element correo = doc.createElement("Correo");
        Element direc = doc.createElement("Direccion");
        Element naci = doc.createElement("Fechadenacimiento");
        Element persona = doc.createElement("Contactodepersona");
        Element numero = doc.createElement("Numerodeemergencia");
         
        
       id.appendChild(doc.createTextNode(String.valueOf(cita.getPaciente().getCedula())));
       nom.appendChild(doc.createTextNode(cita.getPaciente().getNombre()));
       apelli.appendChild(doc.createTextNode(cita.getPaciente().getApellidos()));
       tele.appendChild(doc.createTextNode(cita.getPaciente().getTelefono()));
       correo.appendChild(doc.createTextNode(cita.getPaciente().getCorreo()));
       direc.appendChild(doc.createTextNode(cita.getPaciente().getDireccion()));
       naci.appendChild(doc.createTextNode(cita.getPaciente().getFechaNacimiento()));
       persona.appendChild(doc.createTextNode(cita.getPaciente().getPersonaContacto()));
       numero.appendChild(doc.createTextNode(cita.getPaciente().getNumeroContacto()));
       
       
       pacien.appendChild(id);
       pacien.appendChild(nom);
       pacien.appendChild(apelli);
       pacien.appendChild(tele);
       pacien.appendChild(correo);
       pacien.appendChild(direc);
       pacien.appendChild(naci);
       pacien.appendChild(persona);
       pacien.appendChild(numero);
       
       NodeList root = doc.getElementsByTagName("Paciente");
       root.item(1).appendChild(pacien);
       

        // Medico root 
        Element medic=doc.createElement("medico");
        Element ced=doc.createElement("Id");
        Element name=doc.createElement("nombre");
        Element apellidos=doc.createElement("apellidos");
        Element telefono=doc.createElement("telefono");
        Element email=doc.createElement("correo");
        Element direccion=doc.createElement("direccion");
        Element fechaNacimiento=doc.createElement("fechaNacimiento");
        Element especialidad=doc.createElement("especialidad");
       
      
        
        ced.appendChild(doc.createTextNode(String.valueOf(cita.getMedico().getCedula())));
        name.appendChild(doc.createTextNode(cita.getMedico().getNombre()));
        apellidos.appendChild(doc.createTextNode(cita.getMedico().getApellidos()));
        telefono.appendChild(doc.createTextNode(cita.getMedico().getTelefono()));//creo los nodos
        email.appendChild(doc.createTextNode(cita.getMedico().getCorreo()));
        direccion.appendChild(doc.createTextNode(cita.getMedico().getDireccion()));
        fechaNacimiento.appendChild(doc.createTextNode(cita.getMedico().getFechaNacimiento()));
        especialidad.appendChild(doc.createTextNode(cita.getMedico().getEspecialidad()));
        
       
        medic.appendChild(ced);
        medic.appendChild(name);
        medic.appendChild(apellidos);
        medic.appendChild(telefono);
        medic.appendChild(email);
        medic.appendChild(direccion);
        medic.appendChild(fechaNacimiento);
        medic.appendChild(especialidad);
        
        */
        NodeList rama=doc.getElementsByTagName("Citas");
        rama.item(0).appendChild(citas);
       
        
        this.generateXml(doc);
        
       return true;
    }
}
