import java.util.*;
public class MainThree 
{
    public static int factorialByRecursion(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*factorialByRecursion(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int p=factorialByRecursion(n);
        System.out.println(p);
    }
}
