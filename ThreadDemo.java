class Threadx extends Thread
{
   public void run()
   {
    System.out.println("Even numbers between 1 to 20 :");
     for(int i=1;i<=20;i++)
     {
       if(i%2==0)
       {
         System.out.println(i);
       }
     }
   }
}

class Thready extends Thread
{
   public void run()
   {
      System.out.println("Odd numbers between 1 to 20 :");
     for(int i=1;i<=20;i++)
     {
       if(i%2!=0)
       {
         System.out.println(i);
       }
     }
   }
}

public class ThreadDemo
{
   public static void main(String args[])
   {
     Threadx obj1=new Threadx();
     Thready obj2=new Thready();
      obj1.start();
      obj2.start();
   }
}