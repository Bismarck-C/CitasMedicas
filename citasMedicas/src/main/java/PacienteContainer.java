package com.una.citasmedicas.AdministracionPaciente.Model;

import com.una.citasmedicas.model.XmlAdapter;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PacienteContainer extends XmlAdapter {

    // private static Map<String, PacienteEntity> Vector = new HashMap<>();
    public PacienteContainer() throws Exception {
        super("Pacientes");
    }

    public void add(PacienteEntity objPaciente) throws ParserConfigurationException, SAXException, IOException, Exception {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();  //nueva instacia del builder
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();
        
        
        Element obj = doc.createElement("Paciente");
        Element cedula = doc.createElement("cedula");
        Element nombre = doc.createElement("nombre");
        Element apellidos = doc.createElement("apellidos");
        Element telefono = doc.createElement("telefono");
        Element correo = doc.createElement("correo");
        Element direccion = doc.createElement("direccion");
        Element fechaNacimiento = doc.createElement("fechaNacimiento");
        Element nombreContacto = doc.createElement("nombreContacto");
        Element telefonoContacto = doc.createElement("telefonoContacto");

        cedula.appendChild(doc.createTextNode(String.valueOf(objPaciente.getCedula())));
        nombre.appendChild(doc.createTextNode(objPaciente.getNombre()));
        apellidos.appendChild(doc.createTextNode(String.valueOf(objPaciente.getApellidos())));
        telefono.appendChild(doc.createTextNode(objPaciente.getTelefono()));
        correo.appendChild(doc.createTextNode(String.valueOf(objPaciente.getCorreo())));
        direccion.appendChild(doc.createTextNode(objPaciente.getDireccion()));
        fechaNacimiento.appendChild(doc.createTextNode(String.valueOf(objPaciente.getFechaNacimiento())));
        nombreContacto.appendChild(doc.createTextNode(objPaciente.getPersonaContacto()));
        telefonoContacto.appendChild(doc.createTextNode(objPaciente.getNumeroContacto()));

        obj.appendChild(cedula);
        obj.appendChild(nombre);
        obj.appendChild(apellidos);
        obj.appendChild(telefono);
        obj.appendChild(correo);
        obj.appendChild(direccion);
        obj.appendChild(fechaNacimiento);
        obj.appendChild(nombreContacto);
        obj.appendChild(telefonoContacto);

        NodeList root = doc.getElementsByTagName("Pacientes");
        root.item(0).appendChild(obj);

        this.generateXml(doc);
    }

    public boolean exist(String cedula) throws Exception {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();
        NodeList pacientes = doc.getDocumentElement().getElementsByTagName("Paciente");
        for (int i = 0; i < pacientes.getLength(); i++) {
            if (pacientes.item(i).getChildNodes().item(0).getTextContent().equals(cedula)) {
                return true;
            }
        }

        return false;
    }

    public PacienteEntity buscar(String cedula) throws Exception {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();
        NodeList pacientes = doc.getDocumentElement().getElementsByTagName("Paciente");
        for (int i = 0; i < pacientes.getLength(); i++) {
            if (pacientes.item(i).getChildNodes().item(0).getTextContent().equals(cedula)) {
                
                PacienteEntity Obj = new PacienteEntity();
                
                Obj.setCedula(pacientes.item(i).getChildNodes().item(0).getTextContent());
                Obj.setNombre(pacientes.item(i).getChildNodes().item(1).getTextContent());
                Obj.setApellidos(pacientes.item(i).getChildNodes().item(2).getTextContent());
                Obj.setTelefono(pacientes.item(i).getChildNodes().item(3).getTextContent());
                Obj.setCorreo(pacientes.item(i).getChildNodes().item(4).getTextContent());
                Obj.setDireccion(pacientes.item(i).getChildNodes().item(5).getTextContent());
                Obj.setFechaNacimiento(pacientes.item(i).getChildNodes().item(6).getTextContent());
                Obj.setPersonaContacto(pacientes.item(i).getChildNodes().item(7).getTextContent());
                Obj.setNumeroContacto(pacientes.item(i).getChildNodes().item(8).getTextContent());
                
                return Obj;
            }
        }
        return null;
    }

    public boolean delete(String cedula) throws Exception {
        
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();
        NodeList pacientes = doc.getDocumentElement().getElementsByTagName("Pacientes");
        for (int i = 0; i < pacientes.getLength(); i++) {
            if (pacientes.item(i).getChildNodes().item(0).getTextContent().equals(cedula)) {
               pacientes.item(i).removeChild( pacientes.item(i));
               return true;
     
            }
        }
        return false;
    }

    public boolean modificar(String[] data) throws Exception {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();
        NodeList pacientes = doc.getDocumentElement().getElementsByTagName("Paciente");
        
        for (int i = 0; i < pacientes.getLength(); i++) {
            if (pacientes.item(i).getChildNodes().item(0).getTextContent().equals(data[0])) {
                
                pacientes.item(i).getChildNodes().item(1).setNodeValue(data[1]);
                pacientes.item(i).getChildNodes().item(2).setNodeValue(data[2]);
                pacientes.item(i).getChildNodes().item(3).setNodeValue(data[3]);
                pacientes.item(i).getChildNodes().item(4).setNodeValue(data[4]);
                pacientes.item(i).getChildNodes().item(5).setNodeValue(data[5]);
                pacientes.item(i).getChildNodes().item(6).setNodeValue(data[6]);
                pacientes.item(i).getChildNodes().item(7).setNodeValue(data[7]);
                pacientes.item(i).getChildNodes().item(8).setNodeValue(data[8]);
                 
                return true;
            }
        }
        return false;
    }
}
