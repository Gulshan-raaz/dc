import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class StrRev_Impli extends UnicastRemoteObject implements StrRev
{
    public StrRev_Impli() throws RemoteException
    {}

    public String reverse(String str) throws RemoteException
    {
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
            str1=str1+str.charAt(i);
        return (str1);
    }
}