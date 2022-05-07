import java.util.*;
public class MainFour 
{
    public static String reverse(String s)
    {
        String t="";
        for(int i=s.length()-1;i>=0;i--)
        {
            t=t+s.charAt(i);
        }
        return t;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();

        if(s.equalsIgnoreCase(reverse(s)))
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");
    }
}
