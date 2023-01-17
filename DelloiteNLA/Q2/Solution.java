/*
Write down binary representation of the numbers within the range m to n excluding them such that the binary representation doesn't contain any consecutive 1s.
Input: 5 11
Output:
1000
1001
1010
*/

import java.util.*;
public class Solution
{
    public static String convertBinary(int x)
    {
        String z="";
        while(x>0)
        {
            int rem=x%2;
            z=rem+z;
            x=x/2;
        }
        return z;
    }
    public static boolean check(String z)
    {
        boolean f=true;
        for(int i=0;i<z.length()-1;i++)
        {
            if(z.charAt(i)=='1' && z.charAt(i+1)=='1')
            {
                f=false;
                return f;
            }
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m+1;i<n;i++)
        {
            String binary_rep=convertBinary(i);
            if(check(binary_rep))
                System.out.println(Integer.parseInt(binary_rep));
        }
    }
}