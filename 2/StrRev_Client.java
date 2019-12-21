import java.io.*;
import java.rmi.*;
import java.net.*;
public class StrRev_Client

{
    public static void main(String args[])
    {
        try
        {
            String url="rmi://127.0.0.1/RmiReverse";
            StrRev strf=(StrRev)Naming.lookup(url);

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter String to reverse : ");
            String str=br.readLine();
            System.out.println("Reverse of entered string is "+strf.reverse(str));
        }
        catch(Exception ex){}
    }
}