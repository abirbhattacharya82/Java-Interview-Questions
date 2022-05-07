import java.util.*;
class Solution
{
    double add(int x, double y)
    {
        return (x+y);
    }
    int add(int x, int y)
    {
        return (x+y);
    }
    int add(int x, int y, int z)
    {
        return (x+y+z);
    }
}
public class MainOne 
{
    public static void main(String args[])
    {
        Solution obj=new Solution();
        System.out.println(obj.add(1,2.0));
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
    }
}
