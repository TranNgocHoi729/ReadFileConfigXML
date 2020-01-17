/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnxml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class LearnXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Document doc = readFileXml("src\\learnxml\\chap1.xml");
        String name = doc.getElementsByTagName("city").item(0).getTextContent();
        System.out.println(name);
        
        
    }
    public static Document readFileXml(String fileXml){
		Document document = null;
		File file = new File(fileXml);
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder;
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			document = documentBuilder.parse(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return document;
	}
}
