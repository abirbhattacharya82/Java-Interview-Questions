import java.util.*;
public class MainTwo 
{
    public static int sumFibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return sumFibonacci(n-1)+sumFibonacci(n-2)+1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of n");
        int n=sc.nextInt();
        System.out.println(sumFibonacci(n-1));
    }
}
