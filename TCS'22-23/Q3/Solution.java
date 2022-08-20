import java.util.*;
public class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<>();
        a.add("break");
        a.add("case");
        a.add("continue");
        a.add("default");
        a.add("defer");
        a.add("else");
        a.add("for");
        a.add("func");
        a.add("goto");
        a.add("if");
        a.add("map");
        a.add("range");
        a.add("return");
        a.add("struct");
        a.add("type");
        a.add("var");

        String s=sc.nextLine();
        String t=s.toLowerCase();
        if(a.indexOf(t)!=-1)
        {
            System.out.println(s+" is a keyword");
        }
        else
        {
            System.out.println(s+" is not a keyword");
        }
    }    
}
