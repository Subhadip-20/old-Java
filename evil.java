import java.util.*;
public class evil
{
    public static void mian()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER THE NUMBER:");
       int n=sc.nextInt();
       String g="";int k=0;
       while(n!=0)
       {
           if(n%2==1)
           {g=1+g;
               k++;}
           else
           g=0+g;
           n/=2;
           
       }
       System.out.println("BINNARY EQUIVALENT:   "+g);
       System.out.println("NUMBER OF 1's :   "+k);
       if(k%2==0)
       System.out.println("EVIL NUMBER");
       else
       System.out.println("NOT A EVIL NUMBER");
       
    }
}
