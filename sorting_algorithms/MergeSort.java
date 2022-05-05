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
    void merge(int x, int y, int z)
    {
        int m=y-x+1;
        int n=z-y;
        int p[]=new int[m];
        int q[]=new int[n];

        int i=0;// for a
        int j=0;// for p
        int k=0;// for q

        for(j=0;j<m;j++)
        {
            p[j]=a[j];
        }
        i=m;
        for(k=0;k<n;k++)
        {
            q[k]=a[i];
            i++;
        }
        k=0;
        j=0;
        i=0;

        while(j<m && k<n)
        {
            if(p[j]<q[k])
            {
                a[i]=p[j];
                j++;
            }
            else
            {
                a[i]=q[k];
                k++;
            }
            i++;
        }

        if(j==m)
        {
            while(k<n)
            {
                a[i]=q[k];
                i++;
                k++;
            }
        }
        else
        {
            while(j<m)
            {
                a[i]=p[j];
                i++;
                j++;
            }
        }
    }
    void mergeSort(int l, int u)
    {
        int mid=(l+u)/2;
        if(l<u)
        {
            mergeSort(mid+1, u);
            mergeSort(l, mid);
            merge(l,mid,u);
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
        mergeSort(0,n-1);
        display();
    }
}
public class MergeSort 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        Solution obj=new Solution(n);
        obj.func();
    }
}
