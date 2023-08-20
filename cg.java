import java.util.*;
public class cg
{
    static int count(int d,int m,int y)
    {
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if (y%4==0)
        a[1]=29;
        int d1;int dn=0;
        for(int i=1;i<y;i++)
        {
            if(i%4==0)
            dn+=366;
            else 
            dn+=365;
        }
        for(int i=0;i<m-1;i++)
        dn+=a[i];
        dn+=d;
        return dn;
    }
    public static void main()
    {
        int  p,q;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first date");
        String s1=sc.nextLine();
        System.out.println("Enter the second date");
        String s2=sc.nextLine();
        p=s1.indexOf("/");
        q=s1.lastIndexOf("/");
        int d1,d2,m1,m2,y1,y2;
        d1=Integer.parseInt(s1.substring(0,p));
        m1=Integer.parseInt(s1.substring(p+1,q));
        y1=Integer.parseInt(s1.substring(q+1));
        p=s2.indexOf("/");
        q=s2.lastIndexOf("/");
        d2=Integer.parseInt(s2.substring(0,p));
        m2=Integer.parseInt(s2.substring(p+1,q));
        y2=Integer.parseInt(s2.substring(q+1));
        System.out.println(d1);
        System.out.println(m1);
        System.out.println(y1);
        System.out.println(d2);
        System.out.println(m2);
        System.out.println(y2);
        System.out.println();
        int l=count(d1,m1,y1);
        int m=count(d2,m2,y2);
        System.out.println(l);
        System.out.println(m);
        System.out.println("Difference in date = "+Math.abs(l-m));
    }
    
}