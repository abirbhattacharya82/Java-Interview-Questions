class A
{
    public void display()
    {
        System.out.println("Inside A");
    }
}
class B extends A
{
    public void display()
    {
        System.out.println("Inside B");
    }
}
public class MainThree 
{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();

        a.display();
        b.display();
    }
}
