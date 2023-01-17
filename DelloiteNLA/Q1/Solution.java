/*
Find the indexes in which a digit is provided from an alphanumeic number.
Input: ABC65D19HY09
Output: 34671011
*/
import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            int a=(int)s.charAt(i);
            if(a>=48 && a<=57)
            {
                ans=ans+i;
            }
        }
        System.out.println(ans);
    }
}