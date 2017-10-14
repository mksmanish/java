import java.util.*;
import java.io.*;
import java.net.*;
public class GClient
{
  public static void main(String[] args) throws Exception
  {
     Socket sock = new Socket("127.0.0.1",9876);
     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
                              // sending to client (pwrite object)
     OutputStream ostream = sock.getOutputStream(); 
     PrintWriter pwrite = new PrintWriter(ostream, true);
 
                          
     InputStream istream = sock.getInputStream();
     BufferedReader rR = new BufferedReader(new InputStreamReader(istream));
      System.out.println("hello client here, i am snding message");
     System.out.println("Start the chitchat, type and press enter key");
     String str;
     String rM, sM;               
     while(true)
     {
        sM = keyRead.readLine();  // keyboard reading
        pwrite.println(sM);       // sending to server
        pwrite.flush();                    // flush the data
        if((rM = rR.readLine()) != null) //receive from server
        {
            System.out.println("Client :-"); 
            System.out.println(rM); // displaying at DOS prompt
        }         
      }               
    }                    
}     