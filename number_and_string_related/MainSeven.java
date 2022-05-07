import java.util.*;
public class MainSeven 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String");
        String s1=sc.nextLine()+" ";
        System.out.println("Enter the Second String");
        String s2=sc.nextLine();

        String result="";

        String word="";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch==' ')
            {
                if(word.equalsIgnoreCase(s2))
                {
                    result=result+' ';
                }
                else
                {
                    result=result+word+' ';
                }
                word="";
            }
            else
            {
                word=word+ch;
            }
        }
        System.out.println(result.trim());
    }
}
