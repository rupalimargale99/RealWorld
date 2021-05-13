public class Multi_catch
{
	public static void main(String[] args) 
	{
		int a[]={5,10};
		int b=5;
		
		try
		{
			int x=(a[2]/(b-a[1])); 			
		}
		catch (ArithmeticException e)
		{
			System.out.println("DIVISION BY ZERO");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index is out of bounds error .");			
		}
		catch (ArrayStoreException e)
		{
			System.out.println("Wrong data type...");
		}

		int y=a[1]/(a[0]+b);
		System.out.println("Y = "+y);

	}
}