import java.net.*;
class manishclient
{
   public static void main(String arg[])
   {
      try
      {
        Socket s=new Socket("127.0.0.1",3000);
        System.out.println(" client connected");
      } catch(Exception e) { }
   }
}
     