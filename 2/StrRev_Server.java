import java.rmi.*;
import java.net.*;
public class StrRev_Server
{
    public static void main(String args[])
    {
        try
        {
        StrRev_Impli strimpli=new StrRev_Impli();
        Naming.rebind("RmiReverse",strimpli);
        }
        catch(Exception ex){}
    }
}