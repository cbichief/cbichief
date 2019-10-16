import HelloApp.*;           
import org.omg.CosNaming.*;  
import org.omg.CORBA.*;      


public class HelloClient
{ 
  public static void main(String args[])
  {
    try{
      
      
      ORB orb = ORB.init(args, null);
      
     
	  org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
      NamingContext ncRef = NamingContextHelper.narrow(objRef);
      
      // Resolve the object reference in naming
      NameComponent nc = new NameComponent("Hello", "");
      NameComponent path[] = {nc};
      Hello helloRef = HelloHelper.narrow(ncRef.resolve(path));
      
      // Call the Hello server object and print results
      String hello = helloRef.sayHello();
      System.out.println(hello);
          
    } catch(Exception e) {
        System.out.println("ERROR : " + e);
        e.printStackTrace(System.out);
      }  
  }
}




