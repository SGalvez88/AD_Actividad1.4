
package actividad1.pkg4;


import classes.DatosPersonales;
import classes.DatosPublicos;
import classes.Persona;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Actividad14 {

    public static void main(String[] args) {

        Persona persona = creacionPersona();
        System.out.println(persona.getDatosPersonales().toString());
        System.out.println(persona.getDatosPublicos().toString());
        File file = new File("src\\resources\\personas.xml");
        
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        
        try {
            
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            
            DOMImplementation dOMImplementation = documentBuilder.getDOMImplementation();
            
            Document document = dOMImplementation.createDocument(null, "personas", null);
            
            document.setXmlVersion("1.0");
            
            Element elementoPersona = document.createElement("persona");
            document.getDocumentElement().appendChild(elementoPersona);
            
            Element elementoDatosPersonales = document.createElement("datosPersonales");
            elementoPersona.appendChild(elementoDatosPersonales);
            
            Element elementoId = document.createElement("id");
            elementoDatosPersonales.appendChild(elementoId);
            
            Text textId = document.createTextNode(String.valueOf(persona.getDatosPersonales().getId()));
            elementoId.appendChild(textId);
            
            Element elementoApellido = document.createElement("apellido");
            elementoDatosPersonales.appendChild(elementoApellido);
            
            Text textApellido = document.createTextNode(persona.getDatosPersonales().getApellido());
            elementoApellido.appendChild(textApellido);
                        
            Element elementDatosPublicos = document.createElement("datosPublicos");
            elementoPersona.appendChild(elementDatosPublicos);
            
            Element elementoDepartamento = document.createElement("dep");
            elementDatosPublicos.appendChild(elementoDepartamento);
            
            Text textDepartamento = document.createTextNode(persona.getDatosPublicos().getDep());
            elementoDepartamento.appendChild(textDepartamento);
            
            Element elementoSalario = document.createElement("salario");
            elementDatosPublicos.appendChild(elementoSalario);
            
            Text textSalario = document.createTextNode(String.valueOf(persona.getDatosPublicos().getSalario()));
            elementoSalario.appendChild(textSalario);
                       
            Source source = new DOMSource(document);
            
            Result result = new StreamResult(file);
            
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            System.out.println("ok");
                         
            
        } catch (Exception exception) {
            exception.getMessage();
        }
         
    }

    public static Persona creacionPersona() {
        DatosPersonales datosPersonales = new DatosPersonales(10, "Gálvez");
        DatosPublicos datosPublicos = new DatosPublicos("INF", 3500);

        Persona persona = new Persona(datosPersonales, datosPublicos);
        return persona;
    }
}