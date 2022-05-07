interface Area
{
    public void area(int a, int b);
}
class Solution implements Area
{
    public void area(int a, int b)
    {
        int x=2*(a+b);
        System.out.println(x);
    }
}
public class MainTwo 
{
    public static void main(String args[])
    {
        Solution obj=new Solution();
        obj.area(1, 2);
    }
}