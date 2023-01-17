/*
Kitty who is the kindergarden went to a mall on his holiday. He saw a game where n number are displayed on the screen for 5 seconds. Later the number pad is provided to someone to type in the number of times a most repeated number existed on the screen.
So design a program that scans the list of number available on the screen and print the number that need to type in so that they win.
*/
import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int inp=sc.nextInt();
            if(a.indexOf(inp)==-1)
            {
                a.add(inp);
                count.put(inp,1);
            }
            else
            {
                int s=count.get(inp)+1;
                count.put(inp,s);
            }
        }
        int max=count.get(a.get(0));
        for(int i=1;i<a.size();i++)
        {
            if(count.get(a.get(i))>max)
            {
                max=count.get(a.get(i));
            }
        }
        System.out.println(max);
    }
}