import java.util.*;
public class bin_to_deci
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER BINNARY NUMBER");
        double n=sc.nextDouble();
        int c=0;
        double d=0,r;
        while(n!=0)
        {
            r=n%10;
            d+=r*Math.pow(2,c);
            c++;
            n/=10;
        }
        System.out.println("EQUIVALENT DECIMAL        "+(int)d);
    }
    
}
