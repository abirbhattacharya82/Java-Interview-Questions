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
        boolean f=false;
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                f=true;
                System.out.println("Found at position "+(i+1));
                break;
            }
        }
        if(f==false)
        {
            System.out.println("Data is not present");
        }
    }
}
public class LinearSearch
{
    public static void main(String args[])
    {
        Solution obj=new Solution();
        obj.func();
    }
}