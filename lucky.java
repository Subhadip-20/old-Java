import java.util.*;
public class lucky
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number within 50");
        int n= sc.nextInt();
        int a[]=new int[n+1];int j=2,k=3;
        for(int i=0;i<=n;i++)
            a[i]=i;
        while(j<a.length)
        {
            for(int i=0;i<a.length;i++)
            {
                if(i%j==0)
                a[i]=0;
            }
            j+=k;
            k++;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            System.out.print(a[i]+",");
        }
    }
}