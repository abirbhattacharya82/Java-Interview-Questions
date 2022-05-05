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
    void printSubsequences(int index, ArrayList<Integer> path) 
    {
        if (index == n) 
        {
            if (path.size() > 0)
                System.out.println(path);
        } 
        else 
        {
            printSubsequences(index + 1, path);
            path.add(a[index]);
            printSubsequences(index + 1, path);
            path.remove(path.size() - 1);
        }
        return;
    }
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Datas in the Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> path=new ArrayList<>();
        printSubsequences(0, path);
    }
}
public class Subsequence 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int x=sc.nextInt();
        Solution obj=new Solution(x);
        obj.func();
    }
}
