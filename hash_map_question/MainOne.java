import java.util.*;
public class MainOne
{
    public static int count(Character a, String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(a==s.charAt(i))
            {
                c++;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(h.get(x)==null && x!=' ')
                h.put(x,count(x,s));
        }
        System.out.println(h);
    }
}