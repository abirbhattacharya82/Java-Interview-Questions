import java.util.*;
public class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;
        int y=1;
        int f=1;
        for(int i=3;i<=n;i++)
        {
            if(i%2==0)
            {
                y=y*3;
                f=y;
            }
            else
            {
                x=x*2;
                f=x;
            }
        }
        System.out.println(f);
    }
}
