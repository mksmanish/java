import java.net.*;
class manishserver
{
   public static void main(String arg[])
   {
      try
      {
        ServerSocket  server=new ServerSocket(3000);
        Socket s=server.accept();

        System.out.println("server connected");
      } catch(Exception e) { }
   }
}