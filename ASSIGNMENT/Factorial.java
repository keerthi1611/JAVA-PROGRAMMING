import java.util.Scanner;


public class Factorial {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,fact=1;
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("1");
			
		}
		
		else if(n==0)
		{
			System.out.println("1");
		}
		else
		{
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
	}


}
