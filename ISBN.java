import java.util.*;
public class ISBN
{
    public static void main()
    {
        int g=0,t=10,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A ISBN NUMBER");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int l=s.length();
        if(l<10||l>10)
        {
            System.out.println("ILLEGAL ISBN");
            System.exit(0);
        }
        else
        {
            int a=b=n;
            while(a!=0)
            { 
                int p= a%10;
                g=g+p*t;
                t--;
                a=a/10;
            }
            
            if(g%11==0)
            System.out.println("LEGAL ISBN");
            else
            System.out.println("INVALID ISBN");
        }
    }
        
}
