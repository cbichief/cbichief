import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;


public class DOMParser {

    public static void main(String[] args) {
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setValidating(true);
			dbf.setIgnoringElementContentWhitespace(true);
                        DocumentBuilder db = dbf.newDocumentBuilder();
                        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Enter xml to parse");
                        String fname=br.readLine();
			
			Document doc = db.parse(new File(fname));
			Node ele = doc.getDocumentElement();
			System.out.println("Root element: " + ele.getNodeName());
			NodeList nl = ele.getChildNodes();
			
			for(int i=0; i<nl.getLength(); i++){
				Node n = nl.item(i);
                                if(n.getNodeType()== Node.ELEMENT_NODE)
                                { 
				System.out.println(n.getNodeName());
				NodeList nl2 = n.getChildNodes();
				for( int j=0; j<nl2.getLength(); j++)
				{
					 Node n2 = nl2.item(j);
					 if(n2.getNodeType()== Node.ELEMENT_NODE)
                                         { 
					System.out.println(n2.getNodeName() + " " + n2.getTextContent());
                                         }
                                }		
				}

			}

		} catch(Exception e){
			System.out.println(e);
		}
    }
}