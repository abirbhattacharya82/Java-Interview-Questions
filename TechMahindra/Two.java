import java.util.*;
public class Two
{
    public static int countOddEvenDifference(int n, int a[])
    {
        int x=0;
        int y=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                x++;
                continue;
            }
            y++;
        }
        int s=y-x;
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=countOddEvenDifference(n,a);
        System.out.println(x);
    }
}