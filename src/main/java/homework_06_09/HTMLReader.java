/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_06_09;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Orlando
 */
public class HTMLReader {
    // private File file;
    private DocumentBuilderFactory dbf;
    private DocumentBuilder db;
    private Document doc;
    private DivLists divList = new DivLists();
    private int _length=0;
    
    
    public HTMLReader (){
        
         try {
             dbf   = DocumentBuilderFactory.newInstance();
             try {
                 db    = dbf.newDocumentBuilder();
             } catch (ParserConfigurationException ex) {
                 Logger.getLogger(HTMLReader.class.getName()).log(Level.SEVERE, null, ex);
             }
             doc   = db.parse(new URL("https://www.jofogas.hu/magyarorszag?q=hyundai%20ioniq").openStream());
             NodeList divLists = (NodeList) doc.getElementById("jfgsb_q_placeholder_label");
             Element  divProp = (Element) divLists.item(0);
            // System.out.println(divLists);
            // System.out.println(divProp);
             if(divProp.getElementsByTagName("span").item(0)!=null){
                 if(divProp.getElementsByTagName("span").item(0).getChildNodes().item(0) != null){
                     divList.setSzoveg(divProp.getElementsByTagName("span").item(0).getChildNodes().item(0).getNodeValue());
                 }
             }
             NodeList items = ((Element) divLists.item(0)).getElementsByTagName("span");
             this._length = items.getLength();
             for(int i=0; i < this._length; i++){
                 Span mySpan = new Span();
                 
                 if(((Element)items.item(i)).getElementsByTagName("description").item(0) != null){
                     if(((Element)items.item(i)).getElementsByTagName("description").item(0).getChildNodes().item(0) != null) {
                         mySpan.setDescription(((Element)items.item(i)).getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue());
                     }   }
                 
             }
         } catch (SAXException ex) {
             Logger.getLogger(HTMLReader.class.getName()).log(Level.SEVERE, null, ex);
         } catch (MalformedURLException ex) {
             Logger.getLogger(HTMLReader.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(HTMLReader.class.getName()).log(Level.SEVERE, null, ex);
         }
         
   
    
}

    public static void main(String[] args) {
        HTMLReader html = new HTMLReader();
        System.out.println(html.divList);
       
        
        }
    }



