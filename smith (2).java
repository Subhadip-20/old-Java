import java.util.*;
public class smith
{
    public static void main()
    {
        int k=0,l=0,f=0,sum=0,s=0;int a[]=new int[1000];int z=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        int y=n;
        
         for(int j=2;j<=n;j++)
         {k=0;
         for(int i=1;i<=j;i++) 
         
         { 
             if(j%i==0)
            {
                k++;
            }
             if(k==2)
        {
            
            a[f]=j;
            f++;
            n=n/i;
        
        
    }
   }
    }
    for(int d=0;d<f;d++)
    {
        int q=a[d];
        String w=Integer.toString(q);
        int b=w.length();
        if(b>1)
        {
            int c=b;
            while(c>0)
            {
                int h=c%10;
                sum+=h;
                c=c/10;
            }
        }
        else
        {
            sum=sum+q;
        }
        
    }
    while(y!=0)
    {
        z=y%10;
        s+=z;
        y=y/10;
    }
    if(s==sum)
    {
        System.out.println("SMITH NUMBER");
        
    }
    else
    {System.out.println("NOT SMITH");
    }

 
}
}