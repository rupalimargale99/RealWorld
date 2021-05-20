//program for copying character from one file into another file

import java.io.*;
class copyFile
{
   public static void main(String args[])
   {
     File inf=new File("D:\\abc.txt");
     File outf=new File("D:\\xyz.txt");
     FileReader ints=null;
     FileWriter outs=null;
     try
     {
         ints=new FileReader(inf);
         outs=new FileWriter(outf);
        int ch;
      
       while((ch=ints.read())!=-1)
       {
         outs.write(ch);
       }
     }
    catch(IOException e)
    {
       System.out.println(e);
       System.exit(-1);
    }
      finally
      {
         try
         {
            ints.close();
            outs.close();
          }
         catch(IOException e)
          {
         }
       }
    }
}