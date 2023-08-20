import java.util.*;
public class Lcm_Hcf_Fraction
{
  static  int n,d;
  static   void Lcm()
    { double gcd=1.0,lcm=1.0;
       for(int i=1; i <= (n*d); ++i)
       {
           if(n%i==0 && d%i==0)
                gcd = i;
        }
        lcm=(n*d)/gcd;
        System.out.println("The lcm ");
        
    }
  static  void hcf()
    {double gcd=1.0;
       for(int i=1; i <= (n*d); ++i)
       {
           if(n%i==0 && d%i==0)
           gcd = i;
        }
    }
  static  void nummdeno()
    {
        double gcd=1.0;
       for(int i=1; i <= (n*d); ++i)
       {
           if(n%i==0 && d%i==0)
           gcd = i;
        }
        System.out.println(n/gcd);
        System.out.println("----------");
        System.out.println(d/gcd);
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER THE NEUMERATOR");
        n=sc.nextInt();
        System.out.println("ENTER THE DENOMERATOR");
        d=sc.nextInt();
        Lcm_Hcf_Fraction ob=new Lcm_Hcf_Fraction();
        
        ob.hcf();
        ob.Lcm();
        ob.nummdeno();
    }
}
