
package com.una.citasmedicas.model;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.SAXException;

///XML Extensible Markup Language  HTML Lenguaje de Marcas de Hipertexto
    //XHTML Lenguaje de Marcas de Hipertexto Extensible (JAVA)
public class XmlAdapter {  
    protected String url;
    public static Document document;
            
    
    public XmlAdapter(String entityName) throws Exception{
        this.url=entityName+".xml";
        if(!(new File(this.url).exists())){
            createXml(entityName);
        }
    }
    protected void createXml(String root) throws Exception{
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance(); //Clase Singleton Clase de unica instancia
        DocumentBuilder builder=factory.newDocumentBuilder();
        DOMImplementation dom=builder.getDOMImplementation();
        Document doc=dom.createDocument(null, "xml", null);
        doc.setXmlVersion("1.0");
        doc.getDocumentElement().appendChild(doc.createElement(root));
        generateXml(doc);
    }
    protected void generateXml(Document doc) throws Exception{
        Result file=new StreamResult(new File(this.url));
        Source source=new DOMSource(doc); 
        Transformer transformer=TransformerFactory.newInstance().newTransformer();
        transformer.transform(source, file);
    }
 
            
}
