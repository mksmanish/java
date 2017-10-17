import java.net.*;
import java.io.*;
class exchangemessageserver
{
   public static void main(String arg[])
   {
      try
      {
        ServerSocket  server=new ServerSocket(2000);
        Socket s=server.accept();

        System.out.println("server connected");
        
        DataOutputStream dos= new DataOutputStream(s.getOutputStream());
        dos.writeUTF("welcome to  manish server");
      } catch(Exception e) { }
   }
}