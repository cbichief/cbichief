import java.rmi.*;
public interface circle extends Remote
{
 public double area(double r)throws RemoteException;
 public double circum(double r)throws RemoteException;
}