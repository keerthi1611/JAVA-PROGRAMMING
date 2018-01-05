import java.io.*;
import java.util.*;
class sample
{
public static void main(String args[])
{
    String Str;
        int v = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        String str;
       str=sc.nextLine();
       Character c;
       n=str.length();
        for (int i = 0; i <n; i++) {
            c = str.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c ==
                    'o' || c == 'u') {
                v++;
            }
        }
        System.out.println("No of vowels:"+v);
        
    }
}
