/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.model.medico;

import com.una.citasmedicas.model.XmlAdapter;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author villa
 */
public class MedicoContainer extends XmlAdapter {
    public MedicoContainer() throws Exception{
        super("medicos");
    }
    public void add(Medico medico)throws Exception{
        DocumentBuilder builder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc=builder.parse(this.url);
        doc.getDocumentElement().normalize(); ///Dar permisos al documento para ser modificado
        /*A partir de acá, creamos elementos y los agregamos al documento*/
        Element medic=doc.createElement("medico");
        Element id=doc.createElement("id");
        Element name=doc.createElement("nombre");
        Element apellidos=doc.createElement("apellidos");
        Element telefono=doc.createElement("telefono");//
        Element correo=doc.createElement("correo");
        Element direccion=doc.createElement("direccion");
        Element fechaNacimiento=doc.createElement("fechaNacimiento");
        Element especialidad=doc.createElement("especialidad");
       
      
        
        id.appendChild(doc.createTextNode(String.valueOf(medico.getCedula())));
        name.appendChild(doc.createTextNode(medico.getNombre()));
        apellidos.appendChild(doc.createTextNode(medico.getApellidos()));
        telefono.appendChild(doc.createTextNode(medico.getTelefono()));//creo los nodos
        correo.appendChild(doc.createTextNode(medico.getCorreo()));
        direccion.appendChild(doc.createTextNode(medico.getDireccion()));
        fechaNacimiento.appendChild(doc.createTextNode(medico.getFechaNacimiento()));
        especialidad.appendChild(doc.createTextNode(medico.getEspecialidad()));
        
        
        medic.appendChild(id);
        medic.appendChild(name);
        medic.appendChild(apellidos);
        medic.appendChild(telefono);
        medic.appendChild(correo);
        medic.appendChild(direccion);
        medic.appendChild(fechaNacimiento);
        medic.appendChild(especialidad);
        NodeList root=doc.getElementsByTagName("medicos");
        root.item(0).appendChild(medic);
        
       
        
        this.generateXml(doc);        
    }
    public boolean exist(String id)throws Exception{
        DocumentBuilder builder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc=builder.parse(this.url);
        doc.getDocumentElement().normalize();
        NodeList medicos=doc.getDocumentElement().getElementsByTagName("medico");
        for(int i=0;i<medicos.getLength();i++){
            if(medicos.item(i).getChildNodes().item(0).getTextContent().equals(id)){
                return true;
            }
        }
        
        return false;
    }

     public Medico find(String id)throws Exception{
        DocumentBuilder builder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc=builder.parse(this.url);
        doc.getDocumentElement().normalize();
        NodeList medicos=doc.getDocumentElement().getElementsByTagName("medico");
        for(int i=0;i<medicos.getLength();i++){
            if(medicos.item(i).getChildNodes().item(0).getTextContent().equals(id)){
                Medico medico=new Medico();
                medico.setCedula(medicos.item(i).getChildNodes().item(0).getTextContent());
                medico.setNombre(medicos.item(i).getChildNodes().item(1).getTextContent());
                medico.setApellidos(medicos.item(i).getChildNodes().item(2).getTextContent());
                medico.setTelefono(medicos.item(i).getChildNodes().item(3).getTextContent());
                medico.setCorreo(medicos.item(i).getChildNodes().item(4).getTextContent());
                medico.setDireccion(medicos.item(i).getChildNodes().item(5).getTextContent()); 
                medico.setFechaNacimiento(medicos.item(i).getChildNodes().item(6).getTextContent());
                medico.setEspecialidad(medicos.item(i).getChildNodes().item(7).getTextContent());
                
                
                return medico;
            }
        }
        return null;
    }

    public ArrayList<Medico> getAll() throws Exception{
        DocumentBuilder builder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc=builder.parse(this.url);
        doc.getDocumentElement().normalize();
        ArrayList<Medico> list=new ArrayList<>();
        NodeList medicos=doc.getDocumentElement().getElementsByTagName("categoria");
        for(int i=0;i<medicos.getLength();i++){
            Medico medico=new Medico();
            medico.setCedula(medicos.item(i).getChildNodes().item(0).getTextContent());
            medico.setNombre(medicos.item(i).getChildNodes().item(1).getTextContent());
            medico.setApellidos(medicos.item(i).getChildNodes().item(2).getTextContent());
            medico.setTelefono(medicos.item(i).getChildNodes().item(3).getTextContent());
            medico.setCorreo(medicos.item(i).getChildNodes().item(4).getTextContent());
            medico.setDireccion(medicos.item(i).getChildNodes().item(5).getTextContent());
            medico.setFechaNacimiento(medicos.item(i).getChildNodes().item(6).getTextContent());
            medico.setEspecialidad(medicos.item(i).getChildNodes().item(7).getTextContent());
            
            
            list.add(medico);
        }
        return list;        
    }
    public boolean modificar(String cedula,String[] data) throws SAXException, ParserConfigurationException, IOException, Exception{
        boolean band = false;
       
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(this.url);
        NodeList medicNodes = document.getElementsByTagName("medico");
        for (int i = 1; i < medicNodes.getLength(); i++) {
            Node medic = medicNodes.item(i);
            String currentId = medic.getFirstChild().getTextContent();
            if(currentId.equals(cedula)) {
                band = true;
                NodeList props = medic.getChildNodes();
                int index = 1;
                for(String dataText : data) {
                    props.item(index).setTextContent(dataText);
                    index++;
                }
            }
        }

        // Save XML to file
        this.generateXml(document);
        
       
            
        return band;
        
    }
    public boolean eliminar(String id) throws SAXException, ParserConfigurationException, IOException, TransformerConfigurationException, Exception{
       
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(this.url);
        document.getDocumentElement().normalize();
        NodeList medicNodes = document.getDocumentElement().getElementsByTagName("medico");
        
          
            for (int i = 0; i < medicNodes.getLength(); i++) {
                // elejir un elemento especifico 
                if (medicNodes.item(i).getChildNodes().item(0).getTextContent().equals(id)) {
                   Node aux = medicNodes.item(i);
                   aux.getParentNode().removeChild(aux);
                   this.generateXml(document);
                   return true;
                  
                  
                   
                }
            }
      
         return false;
        
        
    }
    
}
