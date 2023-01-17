/*
I was looking for sentence that contain all english alphabets character at least once in them the sentence help me building my NLP program to check how the user pronounce each and every character.
I have got million of sentence can you help me with a program that accept n sentence and print 1 if they all are compatible with NLP system else print 0.
*/
import java.util.*;
public class Solution
{
    public static void main(String argsp[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            String a=sc.nextLine().toLowerCase();
            ArrayList<Character> ch=new ArrayList<>();
            for(int j=0;j<a.length();j++)
            {
                if((a.charAt(j)>='a' && a.charAt(j)<='z'))
                {
                    if(ch.indexOf(a.charAt(j))!=-1)
                    {
                        continue;
                    }
                    else
                    {
                        ch.add(a.charAt(j));
                    }
                }
            }
            if(ch.size()==26)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}