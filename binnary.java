import java.util.*;
public class binnary
{
    public static void main()
    { int f=0;
            Scanner sc=new Scanner(System.in);
            int a[] = {1,2,3,4,5,6,7,8,9,10};
            System.out.println("ENTER THE NUMBER TO BE SEARCHED");
            int n=sc.nextInt();
            int p=0,m=a.length-1,s=0;
            while(p<m)
            {s=(p+m)/2;
                if(a[s]==n)
                { f=1;
                    break;
                }
                if(a[s]<n)
                {p=s+1;}
                if(a[s]>n)
                {m=s-1;}
            }
            if(f==1)
            System.out.println("number found");
            else
            System.out.println("number not found");
            sc.close();
}
}