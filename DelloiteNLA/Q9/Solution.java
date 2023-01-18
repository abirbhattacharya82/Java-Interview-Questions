/*
Given the equation {f(x,y)=x^2+5*x*y+3*(y^2)} identify x and y which satisfy the following conditions:
1) x and y must be co-primes
2) On substituting x and y in the equation the value must be less than n
3) The result of the equation must be a perfect square
*/

import java.util.*;
public class Solution
{
    public static boolean coprime(int x, int y)
    {
        int divisor=0;
        int dividend=0;
        if(x>y)
        {
            dividend=x;
            divisor=y;
        }
        else
        {
            dividend=y;
            divisor=x;
        }
        while(dividend%divisor>0)
        {
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        if(divisor==1)
            return true;
        else
            return false;
    }
    public static int eqValue(int x, int y)
    {
        int f=(x*x)+(5*x*y)+(3*(y*y));
        return f;
    }
    public static boolean perfect(int z)
    {
        String s=""+Math.sqrt(z);
        // System.out.println(s);
        long a=Long.parseLong(s.substring(s.indexOf('.')+1));
        if(a==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int x=1;x<=n;x++)
        {
            for(int y=1;y<=n;y++)
            {
                if(coprime(x,y))
                {
                    System.out.println("("+x+","+y+")");
                    int z=eqValue(x,y);
                    if(z<n)
                    {
                        System.out.println("("+x+","+y+")");
                        if(perfect(z))
                        {
                            c++;
                            System.out.println("("+x+","+y+")");
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }
}