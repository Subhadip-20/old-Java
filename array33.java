import java.util.*;
public class array33
{
    public static void main(String args[])
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int s=sc.nextInt();
        System.out.println("ENTER THE ELEMENTS");
        int l[]=new int[s/2];
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        if (s%2==0)
        {
            for(int i=0, j=s-1;i<s/2;i++,j--)
            {
               l[i]=a[i]+a[j];
            }
            for(int i=0;i<(s/2)-1;i++)
            {
                if(l[i]==l[i+1])
                {
                    c++;
                    System.out.println("true");
                   
                }
                
            }
        }
        if(s%2==1)
        {
            for(int i=s;i>(s/2);i--)
            {
                a[i]=a[i-1];
            }
             for(int i=0, j=s-1;i<s/2;i++,j--)
            {
               l[i]=a[i]+a[j];
            }
            for(int i=0;i<(s/2)-1;i++)
            {
                if(l[i]==l[i+1])
                {
                    c++;
                     System.out.println("true");
                    
                }
               
            }
        }
        if(c-2==l.length)
        System.out.println("PEUDOARITHMETIC");
         if(c-2<l.length)
        System.out.println("NOT PEUDOARITHMETIC");
        if(c-2>l.length)
        System.out.println("NOT ATT ALL PEUDOARITHMETIC");
    }
}