package com.una.citasmedicas.AdministracionPaciente.Model;

import com.una.citasmedicas.model.XmlAdapter;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PacienteContainer extends XmlAdapter {

    public PacienteContainer() throws Exception {
        super("Pacientes");
    }

    public void add(PacienteEntity objPaciente) throws Exception {
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

    public boolean delete(String cedula) throws IOException, SAXException, ParserConfigurationException {
   
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();

            NodeList items = doc.getElementsByTagName("Paciente");
            for (int i = 0; i < items.getLength(); i++) {
                Element element = (Element) items.item(i);
                
                if (items.item(0).getTextContent().equalsIgnoreCase(cedula)) {
                    // borrar elemento
                    element.getParentNode().removeChild(element);
                    return true;
                }
            }
        return false;
       
    }

    public boolean modificar(String[] data, String cedula) throws Exception {

        boolean band = false;

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(this.url);
        NodeList Pacientes = document.getElementsByTagName("Paciente");

        for (int i = 0; i < Pacientes.getLength(); i++) {
            Node paciente = Pacientes.item(i);

            String currentId = paciente.getFirstChild().getTextContent();
            if (currentId.equals(cedula)) {
                band = true;
                NodeList props = paciente.getChildNodes();
                int index = 1;
                for (String dataText : data) {
                    props.item(index).setTextContent(dataText);
                    index++;

                }
            }
        }

        // Save XML to file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(new DOMSource(document), new StreamResult(this.url));

        return band;
    }
}
