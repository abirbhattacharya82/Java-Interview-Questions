import java.util.*;
public class MainFive 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()!=s2.length())
            System.out.println("Not Anagrams");
        else
        {
            ArrayList<Character> a1=new ArrayList<>();
            ArrayList<Character> a2=new ArrayList<>();

            for(int i=0;i<s1.length();i++)
            {
                a1.add(s1.charAt(i));
                a2.add(s2.charAt(i));
            }

            Collections.sort(a1);
            Collections.sort(a2);

            boolean f=true;
            for(int i=0;i<a1.size();i++)
            {
                if(a1.get(i)!=a2.get(i))
                {
                    f=false;
                    break;
                }
            }
            if(f)
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
    }
}
