import java.util.*;
class Solution
{
    int a[];
    int n;
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
    void swap(int i, int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    int partition(int l, int u)
    {
        int pivot=a[u];

        int i=l-1;
        int j=i+1;
        while(j<u)
        {
            if(a[j]<pivot)
            {
                i++;
                swap(i,j);
            }
            j++;
        }
        i++;
        swap(i,u);
        return i;
    }
    void quickSort(int l, int u)
    {
        if(l<u)
        {
            int p=partition(l,u);
            quickSort(l, p-1);
            quickSort(p+1,u);
        }
    }
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Datas in the Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        display();
        quickSort(0,n-1);
        display();
    }
}
public class QuickSort
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