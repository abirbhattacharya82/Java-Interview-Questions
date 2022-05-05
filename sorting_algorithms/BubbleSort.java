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
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    void bubbleSort()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Datas in the Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        display();
        bubbleSort();
        display();
    }
}
public class BubbleSort 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int x=sc.nextInt();
        Solution obj=new Solution(x);
        obj.func();
    }
}
