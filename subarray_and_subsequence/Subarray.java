import java.util.*;
class Solution
{
    int n;
    int a[];
    Solution(int x)
    {
        n=x;
        a=new int[n];
    }
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Datas");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        subarray();
    }
    void subarray()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
public class Subarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total Size of the Array");
        int x=sc.nextInt();
        Solution obj=new Solution(x);
        obj.func();
    }
}