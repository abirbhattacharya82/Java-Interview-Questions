import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int dist=10;
        int x=0;
        int y=0;
        char ch='R';
        for(int i=1;i<=n;i++)
        {
            if(ch=='R')
            {
                x=x+dist;
                ch='U';
            }
            else if(ch=='U')
            {
                y=y+dist;
                ch='L';
            }
            else if(ch=='L')
            {
                x=x-dist;
                ch='D';
            }
            else if(ch=='D')
            {
                y=y-dist;
                ch='A';
            }
            else if(ch=='A')
            {
                x=x+dist;
                ch='R';
            }
            dist=dist+10;
        }
        System.out.println(x+","+y);
    }
}