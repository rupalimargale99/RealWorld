//Program for a reading a byte from a file

import java.io.*;
class Readbytes
{
    public static void main(String args[])
    {    
        FileInputStream infile=null;
        int b=0;
        
       try
       {

           infile=new FileInputStream("D:\\abcd.txt");
          //int b;
          while((b=infile.read())!=-1)
          {
              System.out.print((char)b);
          }
         infile.close();
       }

        catch(Exception e)
        {
              System.out.println(e);    
         }
    }
}