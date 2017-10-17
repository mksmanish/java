import java.net.*;
import java.io.*;
class machineportscanner
{
   public static void main(String arg[])
   {
      
       int i;
       Socket s;
       for(i=0;i<65536;i++)
       {
             try
              {
                 s=new Socket(arg[0],i);
                 System.out.println("port open are: "+i);
              }catch(Exception e) 
                {

                }
        }
     }
}