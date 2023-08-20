import java.util.*;
public class AMEND
{
    int N;
    AMEND()
    {
        N=0;
    }
    void fnAcquire()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        N=sc.nextInt();
        sc.close();
    }
    void fnConvert()
    {
        
        String k="";String a=Integer.toString(N);
        String g[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        for(int i=0;i<a.length();i++)
        {
            int b=N%10;
            for(int j=1;j<g.length;j++)
        {
            if(b==j)
            {
                k=g[j-1]+" "+k;
            }
        }
            N=N/10;
        }
        System.out.print(k);
    }
   public static void main(String args[])
   {
    AMEND ob=new AMEND();
       ob.fnAcquire();
       ob.fnConvert();
       ob.fnConvert();
    }
}
