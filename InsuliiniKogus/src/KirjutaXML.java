import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javafx.collections.ObservableList;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * N�itena on kasutatud Mkyong.com koodu http://www.mkyong.com/java/how-to-create-xml-file-in-java-dom/
 */


public class KirjutaXML {

    public static void write(ObservableList<Person> data) {

        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements
            Document doc = docBuilder.newDocument();


            Element rootElement = doc.createElement("Toidutabel");
            doc.appendChild(rootElement);


            for (int i = 0; i <data.size(); i++) {
                // staff elements
                Element staff = doc.createElement("Toit");
                rootElement.appendChild(staff);

                String a = "" + i;
                // set attribute to staff element
                Attr attr = doc.createAttribute("id");
                attr.setValue(a);
                staff.setAttributeNode(attr);

                // shorten way
                // staff.setAttribute("id", "1");

                // firstname elements
                Element toit = doc.createElement("Toiduliik");
                toit.appendChild(doc.createTextNode(data.get(i).getToit()));
                staff.appendChild(toit);

                Element kogus = doc.createElement("Kogus");
                kogus.appendChild(doc.createTextNode(data.get(i).getKogus()));
                staff.appendChild(kogus);

                Element yhik = doc.createElement("Yhik");
                yhik.appendChild(doc.createTextNode(data.get(i).getYhik()));
                staff.appendChild(yhik);
            }


            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            //StreamResult result =  new StreamResult(System.out);
            StreamResult result = new StreamResult(new File("file2.xml"));
             transformer.transform(source, result);
            //System.out.println("File saved!");
        }

        catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}