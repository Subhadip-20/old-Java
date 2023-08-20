import java.util.*;
public class twin_prime
{
    public static void main()
    {
        int m,n,count=0,counte=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 2 NUMBER");
        m=sc.nextInt();
        n=sc.nextInt();
        if(Math.abs(m-n)==2)
        {
            for (int i=1; i<=m; i++)
            {
                if(m%i==0)
                count++;
            }
            for (int i=1; i<=n; i++)
            {
                if(n%i==0)
                counte++;
            }
            if(count==2&&counte==2)
            System.out.println("TWIN PRIME");
            else
            System.out.println("NOT A TWIN PRIME");
        }
        else
        System.out.println("NOT TWIN PRIME");
    }
}
