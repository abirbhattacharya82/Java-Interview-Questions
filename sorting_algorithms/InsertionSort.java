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
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    void insertionSort()
    {
        for(int i=1;i<n;i++)
        {
            int key=a[i];
            int j=i-1;
            while((j>=0)&&(a[j]>key))
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Datas");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        display();
        insertionSort();
        display();
    }
}
public class InsertionSort
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