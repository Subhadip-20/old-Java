import java.util.*;
public class p
{
    public static void main()
    {
        int i,j,k,m,p=4;
        System.out.println("");
        m=4;
        for(i=1; i<4; i++)
        {
            for(j=1; j<=m; j++)
            {
                System.out.print(" ");
            }
            for(k=1; k<=i; k++)
            {
                System.out.print(k+" ");
            }
            for(k=i-1; k>=1; k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
            m--;
        }
        m=1;
         for(i=4; i>=1; i--)
        {
            for(j=1; j<=m; j++)
            {
                System.out.print(" ");
            }
            for(k=1; k<=i; k++)
            {
                System.out.print(k+" ");
            }
            for(k=i-1; k>=1; k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
            m++;
        }
        
    }
 }