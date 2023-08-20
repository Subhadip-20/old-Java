import java.util.*;
public class rec
{
   
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
       
        System.out.print("enter the value of a");
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the value of b");
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<2;i++)
        {
           
            for (int j=0;j<2;j++)
            {
                int c=0;
                for(int k=0;k<2;k++)
                {
                    c+=a[i][k]*b[k][j];
                }
                System.out.print(c+"     ");
            }
            System.out.println();
        }
    }
    
}