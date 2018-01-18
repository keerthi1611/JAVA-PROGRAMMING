package Count_digit;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,rem=0,i=0,temp=0,n;
		int a[]=new int[10000];
		for(i=0;i<=9999;i++)
		{
			
			a[i]=i;
		}
		//for(i=0;i<10;i++)
			//System.out.print(a[i]);
		for(i=0;i<=9999;i++)
		{
			n=a[i];
			sum=0;
			while(n!=0)
			{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			}//while
			if(sum!=8)
				System.out.print(a[i]+"\n");
		}//for
		}//class
		
	}//main

