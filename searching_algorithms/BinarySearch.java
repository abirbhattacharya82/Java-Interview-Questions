import java.util.*;
class Solution
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Datas");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Data to be searched");
        int x=sc.nextInt();

        int l=0;
        int u=n;
        int mid=(l+u)/2;
        while(l<u)
        {
            if(a[mid]==x)
            {
                System.out.println("Found At Position "+(mid+1));
                break;
            }
            else if(a[mid]>x)
            {
                u=mid-1;
            }
            else
            {
                l=mid+1;
            }
            mid=(l+u)/2;
        }
        if(l>=u)
        {
            System.out.println("Data is Not present");
        }
    }
}
public class BinarySearch 
{
    public static void main(String args[])
    {
        Solution obj=new Solution();
        obj.func();
    }
}
