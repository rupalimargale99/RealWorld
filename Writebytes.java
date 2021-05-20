//Writing a byte to a file

import java.io.*;
class Writebytes
{
     public static void main(String args[])
     {
       byte cities[]={'D','E','L','H','I','P','U','N','E','\n'};
           
          FileOutputStream outfile=null;
         try
         {
           outfile=new FileOutputStream("D:\\cities.txt");
            outfile.write(cities);
            outfile.close();
          }
          catch(IOException e)
          {
            System.out.println(e);
            System.exit(-1);
          }
       }
}
