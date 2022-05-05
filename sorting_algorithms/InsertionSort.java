import java.util.*;
class Solution
{
    void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    int[] insertionsort(int a[])
    {
        int n=a.length;
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
        return a;
    }
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
        display(a);
        a=insertionsort(a);
        display(a);
    }
}
public class InsertionSort
{
    public static void main(String args[])
    {
        Solution obj=new Solution();
        obj.func();
    }
}