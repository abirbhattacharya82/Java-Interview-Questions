import java.util.*;
public class Solution
{
    public static String convert_vow(String x)
    {
        String a="";
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u'||x.charAt(i)=='A'||x.charAt(i)=='E'||x.charAt(i)=='I'||x.charAt(i)=='O'||x.charAt(i)=='U')
            {
                a=a+'*';
            }
            else
            {
                a=a+x.charAt(i);
            }
        }
        return a;
    }
    public static String convert_con(String x)
    {
        String a="";
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)!='a'&& x.charAt(i)!='e'&& x.charAt(i)!='i'&& x.charAt(i)!='o' && x.charAt(i)!='u'&& x.charAt(i)!='A'&& x.charAt(i)!='E' && x.charAt(i)!='I' && x.charAt(i)!='O'&& x.charAt(i)!='U')
            {
                a=a+'@';
            }
            else
            {
                a=a+x.charAt(i);
            }
        }
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();

        String x=convert_vow(a);
        String y=convert_con(b);
        String z=c.toUpperCase();

        String ans=x+y+z;
        System.out.println(ans);
    }
}