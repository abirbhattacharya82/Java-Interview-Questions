import java.util.*;
public class MainSix 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        System.out.println("Enter n numbers");
        double sum=0.0;
        for(int i=0;i<n;i++)
        {
            sum=sum+sc.nextInt();
        }
        double avg=sum/n;
        System.out.println("Average=> "+avg);
    }
}
