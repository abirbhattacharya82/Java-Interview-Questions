/*
John worked as a technical expert for a mobile company where he analyses if mobile are infected by virus the complete information of each mobile is coded in the form of a string. A mobile is infected by a virus if string is a special string.
A string is called a special string is called if all characters at alternate position starting from index 0 are same.
Print 1 if the phones are not infected and 0 if they are infected.
*/
import java.util.*;
public class Solution
{
    public static boolean check(String z)
    {
        if(z.length()==2)
        {
            return true;
        }
        else
        {
            boolean flag=false;
            char ch=z.charAt(0);
            for(int i=2;i<z.length();i=i+2)
            {
                if(ch!=z.charAt(i))
                {
                    flag=true;
                    return flag;
                }
            }
            return flag;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            String str=sc.nextLine();
            if(check(str))
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("1");
            }
        }
    }
}