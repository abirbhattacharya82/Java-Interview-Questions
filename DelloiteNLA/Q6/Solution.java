/*
Consider the three matrices of size MxN. Out of the three, the last matrix will have only symbol (+,-,*,/) and the other two have integers. The program must return an MxN matrix which is computed by using the symbols available in the symbol matrix. Arithmetic operations between two number are always performed between the corresponding element only, i.e,
result[i,j]=A[i,j](operation)B[i,j]

Input:
2 2

1 2
4 5

5 5
7 6

+ -
* /
Output:
6 -3
28 0
*/
import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        char c[][]=new char[m][n];

        int d[][]=new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=sc.next().charAt(0);
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(c[i][j]=='+')
                {
                    d[i][j]=a[i][j]+b[i][j];
                }
                else if(c[i][j]=='/')
                {
                    d[i][j]=a[i][j]/b[i][j];
                }
                else if(c[i][j]=='*')
                {
                    d[i][j]=a[i][j]*b[i][j];
                }
                else if(c[i][j]=='-')
                {
                    d[i][j]=a[i][j]-b[i][j];
                }
            }
        }

        System.out.println("Output");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
    }
}