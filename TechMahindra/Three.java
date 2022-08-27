import java.util.*;
public class Three 
{
    public static int findTotalCurtains(int a[], int n)
    {
        int s=0;
        for(int i=0;i<n;i++)
        {
            s=s+a[i]/12;
        }
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
        System.out.println(findTotalCurtains(a,n));
    }
}
