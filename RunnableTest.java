/*  Program Using Runnable Interface */

class X implements Runnable    //Step 1:
{
	public void run()		  //Step 2:	
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("ThreadX : " +i);
		}	
		System.out.println("End of ThreadX");
	}
	
}
public class RunnableTest
{
	public static void main(String[] args) 
	{
		X x1=new X();
		Thread threadx=new Thread(x1);  //Step 3:
		threadx.start();				//Step 4:
		System.out.println("End of main Thread");
	}
}

