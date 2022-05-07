import java.util.*;
public class MainOne 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of m and n");
        int m=sc.nextInt();
        int n=sc.nextInt();

        try
        {
            double d=m/n;
            System.out.println(d);
        }
        catch(Exception e)
        {
            System.out.println("Exception Caught");
        }
    }    
}
