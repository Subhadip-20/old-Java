import java.util.*;
public class deci_to_binnary
{
    public static void main()
    {
       
        int n=0;
        String g="";
       for(int i=0;i<100;i++)
       {
           n=i;
           g="";
        while(n!=0)
        {
            int r= n%2;
            g=r+""+g;
            n/=2;
        }
         System.out.println("Eqivalent binary of " +i+" = "+g);
       }
    }
}