package com.una.citasmedicas.AdministracionPaciente.Model;

import com.una.citasmedicas.model.XmlAdapter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PacienteContainer extends XmlAdapter {

    public PacienteContainer() throws Exception {
        super("Pacientes");
    }

    public void add(PacienteEntity objPaciente) throws Exception {  // Metodo agregar para incluir datos de objeto creado en el controller

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();  
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();

        Element obj = doc.createElement("Paciente");

        Element numero = doc.createElement("numerocitas");//
        Element cedula = doc.createElement("cedula");
        Element nombre = doc.createElement("nombre");
        Element apellidos = doc.createElement("apellidos");
        Element telefono = doc.createElement("telefono");
        Element correo = doc.createElement("correo");
        Element direccion = doc.createElement("direccion");
        Element fechaNacimiento = doc.createElement("fechaNacimiento");
        Element nombreContacto = doc.createElement("nombreContacto");
        Element telefonoContacto = doc.createElement("telefonoContacto");
        
       

        numero.appendChild(doc.createTextNode(String.valueOf(objPaciente.getNumeroCitas())));//
        cedula.appendChild(doc.createTextNode(String.valueOf(objPaciente.getCedula())));
        nombre.appendChild(doc.createTextNode(objPaciente.getNombre()));
        apellidos.appendChild(doc.createTextNode(String.valueOf(objPaciente.getApellidos())));
        telefono.appendChild(doc.createTextNode(objPaciente.getTelefono()));
        correo.appendChild(doc.createTextNode(String.valueOf(objPaciente.getCorreo())));
        direccion.appendChild(doc.createTextNode(objPaciente.getDireccion()));
        fechaNacimiento.appendChild(doc.createTextNode(String.valueOf(objPaciente.getFechaNacimiento())));
        nombreContacto.appendChild(doc.createTextNode(objPaciente.getPersonaContacto()));
        telefonoContacto.appendChild(doc.createTextNode(objPaciente.getNumeroContacto()));

        obj.appendChild(numero);//
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

    public boolean exist(String cedula) throws Exception { // valida que la cedula ingresada exista
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();
        NodeList pacientes = doc.getDocumentElement().getElementsByTagName("Paciente");
        for (int i = 0; i < pacientes.getLength(); i++) {
            if (pacientes.item(i).getChildNodes().item(1).getTextContent().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

   /* public boolean maximo(String cedula) throws Exception {  // verificacion de que el paciente con la cedula ingresada en su numero de citas sean 5 
        if (exist(cedula)) {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(this.url);
            doc.getDocumentElement().normalize();

            NodeList citas = doc.getDocumentElement().getElementsByTagName("Paciente");

            for (int i = 0; i < citas.getLength(); i++) {
                if (citas.item(i).getChildNodes().item(1).getTextContent().equals(cedula)) {
                    if (citas.item(i).getChildNodes().item(0).getTextContent().equals(String.valueOf(5))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
*/
    public PacienteEntity buscar(String cedula) throws Exception { // busca en los nodos el paciente con la cedula ingresada y la retorna

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();
        NodeList pacientes = doc.getDocumentElement().getElementsByTagName("Paciente");

        for (int i = 0; i < pacientes.getLength(); i++) {
            if (pacientes.item(i).getChildNodes().item(1).getTextContent().equals(cedula)) {

                PacienteEntity Obj = new PacienteEntity();

                Obj.setCedula(pacientes.item(i).getChildNodes().item(1).getTextContent());
                Obj.setNombre(pacientes.item(i).getChildNodes().item(2).getTextContent());
                Obj.setApellidos(pacientes.item(i).getChildNodes().item(3).getTextContent());
                Obj.setTelefono(pacientes.item(i).getChildNodes().item(4).getTextContent());
                Obj.setCorreo(pacientes.item(i).getChildNodes().item(5).getTextContent());
                Obj.setDireccion(pacientes.item(i).getChildNodes().item(6).getTextContent());
                Obj.setFechaNacimiento(pacientes.item(i).getChildNodes().item(7).getTextContent());
                Obj.setPersonaContacto(pacientes.item(i).getChildNodes().item(8).getTextContent());
                Obj.setNumeroContacto(pacientes.item(i).getChildNodes().item(9).getTextContent());

                return Obj;
            }
        }
        return null;
    }

    public boolean delete(String cedula) throws Exception {  // elimina el nodo en espesifico donde se encuentre la cedula que se ingreso

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();
        NodeList pacientes = doc.getDocumentElement().getElementsByTagName("Paciente");

        for (int i = 0; i < pacientes.getLength(); i++) {

            if (pacientes.item(i).getChildNodes().item(1).getTextContent().equals(cedula)) {

                Node aux = pacientes.item(i);
                aux.getParentNode().removeChild(aux);
                this.generateXml(doc);
                return true;
            }
        }
        return false;
    }

    public boolean SumarUnaCita(String cedula) throws Exception {  // se le suma uno ala cantidad de citas que se tiene al paciente con la cedula ingresada 
        boolean bandera = false;

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(this.url);
        NodeList cantidadCitas = document.getElementsByTagName("Paciente");

        for (int i = 0; i < cantidadCitas.getLength(); i++) {
            Node cita = cantidadCitas.item(i);
            String cantidad = cita.getChildNodes().item(0).getTextContent();
            short cantidadN = Short.parseShort(cantidad);
            if (cita.getChildNodes().item(1).getTextContent().equals(cedula)) {
                if (cantidadN == 5) {
                    bandera = false;
                }
                if ((cantidadN == 0) && (cantidadN <= 4)) {
                    cantidadN++;
                    cantidad = String.valueOf(cantidadN);
                    NodeList sumar = cita.getChildNodes();
                    sumar.item(0).setTextContent(cantidad);
                    bandera = true;
                }
                if ((cantidadN < 0) && (cantidadN > 5)) {

                    bandera = false;
                }
            }
        }
        this.generateXml(document);
        return bandera;
    }

    public boolean modificar(String[] data, String cedula) throws Exception { // modifica los valores que tenga el nodo de la cedula que el usuario quiera

        boolean band = false;

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(this.url);
        NodeList Pacientes = document.getElementsByTagName("Paciente");

        for (int i = 0; i < Pacientes.getLength(); i++) {
            Node paciente = Pacientes.item(i);

            String currentId = paciente.getChildNodes().item(1).getTextContent();
            if (currentId.equals(cedula)) {
                band = true;
                NodeList props = paciente.getChildNodes();
                int index = 2;
                for (String dataText : data) {
                    props.item(index).setTextContent(dataText);
                    index++;

                }
            }
        }

        this.generateXml(document);

        return band;
    }

    public short retornarnumCitas(String cedula) throws Exception {       // retorna la cantidad de citas que tiene guardado el nodo con la cedula que se 

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(this.url);
        doc.getDocumentElement().normalize();

        NodeList Paciente = doc.getDocumentElement().getElementsByTagName("Paciente");

        for (int i = 0; i < Paciente.getLength(); i++) {
            if (Paciente.item(i).getChildNodes().item(1).getTextContent().equals(cedula)) {
                short numeroretornar;
                String numero = Paciente.item(i).getChildNodes().item(0).getTextContent();
                numeroretornar = Short.parseShort(numero);
                return numeroretornar;
            }
        }
        return 0;
    }
}
