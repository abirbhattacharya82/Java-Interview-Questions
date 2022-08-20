import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                a=a+Integer.parseInt(s.charAt(i)+"");
            }
            else
            {
                b=b+Integer.parseInt(s.charAt(i)+"");
            }
        } 
        int diff=Math.abs(a-b);
        System.out.println(diff);
    }
}