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
    void selectionSort()
    {
        for(int i=0;i<n;i++)
        {
            int min=a[i];
            int pos=i;
            for(int j=i+1;j<n;j++)
            {
                if(min>a[j])
                {
                    min=a[j];
                    pos=j;
                }
            }
            int t=a[i];
            a[i]=a[pos];
            a[pos]=t;
        }
    }
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Datas in the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        display();
        selectionSort();
        display();
    }
}
public class SelectionSort 
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
