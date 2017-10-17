import java.net.*;
import java.io.*;
class exchangemessageclient
{
   public static void main(String arg[])
   {
      try
      {
        Socket s=new Socket("127.0.0.1",2000);
        System.out.println(" client connected");
      
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String msg=dis.readUTF();
        System.out.println(msg);
      } catch(Exception e) { }
   }
}
     