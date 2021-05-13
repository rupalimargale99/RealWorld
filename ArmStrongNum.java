import java.util.*;
public class ArmstrongNum
{
 public static void main(String args[])
 {
    int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	 num=sc.nextInt();
	int temp=num;
	int r,sum=0;
	while(num>0)
	{
	  r=num%10;
	  num=num/10;
	  sum=sum+r*r*r;
	  }
	  if(temp==sum)
	  System.out.println(temp+" is an Armstron number");
	  else
	  System.out.println(temp+" is not an Armstrong numbe");
	  }
	  }