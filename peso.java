import java.util.*;
public class peso
{
    int arp[],n;
    peso(int x)
    {
        n=x;
        arp=new int[n];
    }
    void fnfill()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        
        for(int i=0;i<n;i++)
        {
            arp[i]=sc.nextInt();
        }
    }
   void fnshow()
    {
        System.out.println("Original array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arp[i]+",");
        }
        int k=n-1;
        System.out.println();
        System.out.println("Pairs");
        for(int i=0;i<=(n/2);i++)
        {
            if(n%2==0)      
            {
                System.out.println("("+arp[i]+","+arp[k]+")");
                k--;
                if (i==(n/2)-1)
                break;
            }
            else
            {
                if(i==(n/2)+1)
                System.out.println("("+arp[i]+","+arp[i]+")");
                System.out.println("("+arp[i]+","+arp[k]+")");
                k--;
            }
        }
    }
    boolean fnIsPseudo()
    {
        boolean f=false;
        int k=n-1;int sum=arp[0]+arp[n-1];
        l:for(int i=0;i<(n/2);i++)
        {
            
            if(n%2!=0)
            {
                if(i==n/2)
                {
                    if(arp[i]*2==sum)
                        f=true;
                      else
                      {
                    
                          f=false;
                          break l;
                       }   
                }
                else
                {
                   if(arp[i]+arp[k]==sum)
                        f=true;
                      else
                      {
                    
                          f=false;
                          break l;
                       }
                      
                }
                k--;
            }
            else
            {
                if(arp[i]+arp[k]==sum)
                f=true;
                else
                {
                    f=false;
                    break l;
                }
                k--;
            }
        }
        return f;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int p=sc.nextInt();
       peso ob=new peso(p);
       ob.fnfill();
       ob.fnshow();
       boolean k=ob.fnIsPseudo();
       if(k==true)
       {
           System.out.println("PSEUDO ARITHMETIC");
       }
       else
       System.out.println("NON-PSEUDO ARITHMETIC");
    }
}
