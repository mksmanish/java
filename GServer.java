
import java.io.*;
import java.net.*;
public class GServer
{
  public static void main(String[] args) throws Exception
  {
      ServerSocket sersock = new ServerSocket(9876);
      System.out.println("this is server side");
      System.out.println("now server is ready to recive message form client");
      Socket sock = sersock.accept( );                          
      BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
	                      // sending to client (pwrite object)
      OutputStream ostream = sock.getOutputStream(); 
      PrintWriter pwrite = new PrintWriter(ostream, true);
 
                              // receiving from server 
      InputStream istream = sock.getInputStream();
      BufferedReader rR = new BufferedReader(new InputStreamReader(istream));
 
      String rM, sM;               
      while(true)
      {
        if((rM = rR.readLine()) != null)  
        {
          
           System.out.println(rM);         
        }         
        sM = keyRead.readLine(); 
        pwrite.println(sM);             
        pwrite.flush();
      }               
    }                    
} //code for server   
//compile the GServer as javac GServer.java
//and then java GServer to start 
