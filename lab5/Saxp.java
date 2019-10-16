import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
public class Saxp extends DefaultHandler
{
	public static int c;
	protected String el;
	protected boolean flag;
	public static void main(String[] a)
	{
		c=0;
		try
		{
			SAXParserFactory sfact=SAXParserFactory.newInstance();
			sfact.setValidating(true);
			SAXParser buildsax=sfact.newSAXParser();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("SAXParser:enter xml file to parse");
			String bk1=br.readLine();
			// bk1=a[0];
			Saxp evt=new Saxp();
			buildsax.parse(new File(bk1),evt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void startElement(String uri,String localnm,String qnm,Attributes attr)
	{
		if(c<2)
		{
			c++;
			flag=true;
		}
	el=qnm;
	System.out.println(" "+el+":");
	}
	public void characters(char[] cha,int start,int length)
	{
		String val=new String(cha,start,length);
		System.out.println(val+" ");
	}
	public void endElement(String uri,String localnm,String qnm)
	{
		el=null;
	}
	
}