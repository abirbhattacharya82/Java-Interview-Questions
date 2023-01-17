/*
Consider a string STR of lowercase alphabets. Write a program to find the resultant number which is formed by performing the below given steps on STR
Step 1: For each letter ch of STR, if ch is a vowel the resultant binary string b must be concatenated with '0' else it is '1' and return the string b.
Step 2: Print d where d is the decimal equivalent of binary string b
*/

import java.util.*;
public class Solution
{
    public static int convertDecimal(String s)
    {
        int x=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                x=x+(int)Math.pow(2,i);
            }
        }
        return x;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String z="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                z='0'+z;
            }
            else
            {
                z='1'+z;
            }
        }
        System.out.println(convertDecimal(z));
    }
}