public abstract class MainOne 
{
    public static boolean isArmstrong(int x)
    {
        int z=x;
        int s=0;
        while(x>0)
        {
            int y=x%10;
            s=s+(y*y*y);
            x=x/10;
        }
        if(z==s)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        for(int i=0;i<=999;i++)
        {
            if(isArmstrong(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
}
