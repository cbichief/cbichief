import java.rmi.*;
import java.rmi.server.*;
public class calculations extends UnicastRemoteObject implements circle
{
 public class calculations()throws RemoteException
 {
 }
 public double area(double r)throws RemoteException
 {
  return Math.PI*r*r;
 }
 public double circum(double r)throws RemoteException
 {
  return 2*Math.PI*r;
 }
}