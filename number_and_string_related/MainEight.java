public class MainEight 
{
    public static void main(String args[])
    {
        int a=1;
        int b=2;
        System.out.println("Before Swapping a=>"+a+" and b=>"+b);
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("After Swapping a=>"+a+" and b=>"+b);
    }
}
