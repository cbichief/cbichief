import java.rmi.*;
import javax.net.*;
public class RmiServer
{
 public static void main(String args[])
 {
  try
{
 calculations c=new calculations();
 Naming.rebind("RmiServer",c);
}
catch(Exception e)
{
 System.out.println(e);
}
}
}