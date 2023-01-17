import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a="";
        String b="";
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                a=a+s.charAt(i);
            }
            else
            {
                b=b+s.charAt(i);
            }
        }
        String c="";
        c=a+b;
        System.out.println(c);
    }
}