import java.util.*;
public class circular
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
       double n=sc.nextDouble();
        String g=Double.toString(n);
        int l=g.length();
        l-=2;
        System.out.println(l);
        String q="";
        int t=0;
        for(int i=1;i<=l;i++)
        {
            int k=0;
            for(int j=1;j<=(int)n;j++)
            {
                if((int)n%j==0)
                {k++;
                }
            }
            if(k==2)
            {t++;
            }
            
            double z=(int)n%Math.pow(10,l-1);
   
            double y=(int)n/Math.pow(10,l-1);
            
            n=(int)(z*10)+y;
           
        }
        if(t==l)
        {
            System.out.println("CIRCULAR PRIME");
        }
        else
        System.out.println("NOT CIRCULAR PRIME");
    }
}
