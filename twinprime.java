import java.util.*;
public class twinprime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE IST BOUND");
        int a=sc.nextInt();
        System.out.println("ENTER THE UPPER BOUND");
        int b=sc.nextInt();
        for(int i=a;i<=b-2;i++)
        {
            int k=i,l=i+2,n=0,m=0;
            for(int j=1;j<=k;j++)
            if(k%j==0)
            {
                n++;
        }
        for(int j=1;j<=l;j++)
            if(l%j==0)
            {
                m++;
        }
        if(n==2&&m==2)
        System.out.println("("+k+","+l+")");
        
    }
 }
}
