import java.io.*;
import java.util.*;
class sample
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int i,n;
   
    
    String str;
     String str1;
    
   str=sc.nextLine();
    n=str.length();
   
   str1=str.replaceAll("[AEIOUaeiou]","");
  
   
   System.out.println(str1);
    
}
}
