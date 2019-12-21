import java.rmi.*;
public interface StrRev extends Remote
{
    public String reverse(String str) throws RemoteException;
}
