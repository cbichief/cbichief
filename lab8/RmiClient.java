import java.rmi.*;
import javax.net.*;
public class RmiClient
{
 public static void main(String args[])
 {
  try
{
String url="rmi://127.0.0.1/RmiServer";
circle rob(circle)Naming.lookup(url);
System.out.println("area of circle" +rob.area(10));
System.out.println("circumference of circle is" +rob.circum(10));
}
catch(Exception e)
{
 System.out.println(e);
}
}
} 