import java.util.*;
public class One
{
    public static int findTotalSum(int a[], int x)
    {
        int s=0;
        for(int i=x-1;i<a.length-1;i++)
        {
            int y=Math.abs(a[i]-a[i+1]);
            s=s+y;
        }
        return s;
    }
    public static void main(String rgs[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int z=findTotalSum(a,x);
        System.out.println(z);
    }
}