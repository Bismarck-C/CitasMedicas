
package com.una.citasmedicas.model.citas;

import com.una.citasmedicas.model.XmlAdapter;
import java.util.ArrayList;
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
    
    public boolean agregar(Cita cita) throws Exception{
    
        DocumentBuilder builder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc=builder.parse(this.url);
        doc.getDocumentElement().normalize();
   
        // Cita
        
        Element citas = doc.createElement("Cita");
        Element numCita = doc.createElement("Numerodecita");
        Element idMedic = doc.createElement("idMedico");
        Element idPaciente = doc.createElement("idPaciente");
        Element hora = doc.createElement("Hora");
        Element fecha = doc.createElement("Fecha");
        
        
        numCita.appendChild(doc.createTextNode(String.valueOf(cita.getNumCitas())));
        idMedic.appendChild(doc.createTextNode(cita.getIdMedico()));
        idPaciente.appendChild(doc.createTextNode(cita.getIdPaciente()));
        hora.appendChild(doc.createTextNode(cita.getHora()));
        fecha.appendChild(doc.createTextNode(cita.getFecha()));
        
        
        citas.appendChild(numCita);
        citas.appendChild(idMedic);
        citas.appendChild(idPaciente);
        citas.appendChild(hora);
        citas.appendChild(fecha);
        
        
        
        NodeList root = doc.getElementsByTagName("Citas");
        root.item(0).appendChild(citas);
  
        this.generateXml(doc);
        
       return true;
    }
    
    public ArrayList<Cita> mostrarCita() throws Exception{
      ArrayList<Cita> array = new ArrayList<>();
      
        DocumentBuilder builder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc=builder.parse(this.url);
        doc.getDocumentElement().normalize();
        
        String[] data = new String[5];
        
        NodeList nodo = doc.getElementsByTagName("Cita");
        for (int i = 0; i < nodo.getLength(); i++) {
            
            data[0] = nodo.item(i).getChildNodes().item(0).getTextContent();
            data[1] = nodo.item(i).getChildNodes().item(1).getTextContent();
            data[2] = nodo.item(i).getChildNodes().item(2).getTextContent();
            data[3] = nodo.item(i).getChildNodes().item(3).getTextContent();
            data[4] = nodo.item(i).getChildNodes().item(4).getTextContent();

            Cita cita = new Cita(data);

            array.add(cita);
        }
        return array;
    }
           
}
