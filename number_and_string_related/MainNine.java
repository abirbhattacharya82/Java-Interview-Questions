public class MainNine 
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};

        int m=a.length;
        int n=b.length;
        int o=m+n;
        
        int c[]=new int[o];

        int p=0; // a
        int q=0; // b
        int r=0; // c

        while(p<m && q<n)
        {
            if(a[p]<b[q])
            {
                c[r]=a[p];
                p++;
            }
            else
            {
                c[r]=b[q];
                q++;
            }
            r++;
        }

        if(p==m)
        {
            while(q<n)
            {
                c[r]=b[q];
                q++;
                r++;
            }
        }
        else
        {
            while(p<m)
            {
                c[r]=a[p];
                p++;
                r++;
            }
        }

        for(int i=0;i<o;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}