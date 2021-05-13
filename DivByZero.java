//program for exception handling using try and catch block

public class DivByZero
{
	public static void main(String args[])
	{
		int x=0;
		int y=35;
		int z;
		try
		{
			z=y/x;
			System.out.println("Value of z:"+z);

		}
		catch (ArithmeticException e)
		{
			System.out.println("Sorry...You can't divide by Zero!!");

		}

	}
}
