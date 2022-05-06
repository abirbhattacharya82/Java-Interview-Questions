import java.util.*;
public class MainOne
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();

        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z'))
                h.add(s.charAt(i));
        }
        System.out.println(h);
    }
}