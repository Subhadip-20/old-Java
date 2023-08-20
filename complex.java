import java.util.*;
public class complex
{
   double x,y;
   complex(double real, double imag)
   {
       x=real;
       y=imag;
   }
   complex plus(complex b)
   {
        complex z=new complex(0,0);
        
       z.x=b.x+x;
       z.y=b.y+y;
       return z;
   }
   complex times(complex b)
   {
       complex z=new complex(0,0);
       z.x=(b.x*x)+(b.y*y);
       z.y=(b.x*y)+(b.y*x);
       
       return z;
   }
   double abs()
   {
       double g=Math.sqrt((x*x)+(y*y));
       return g;
   }
   double Re()
   {return x;}
   double Im()
   {return y;}
   String tostring()
   {
       String g=Double.toString(x)+" +i"+Double.toString(y);
       return g;
   }
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the real and imaginary part of the complex number");
       double a=sc.nextDouble();
       double b=sc.nextDouble();
       complex ob=new complex(a,b);
       System.out.println("Enter the real and imaginary part of the second complex number");
       double g=sc.nextDouble();
       double h=sc.nextDouble();
       complex ob1=new complex(g,h);
       complex ob3=new complex(0,0);
       ob3=ob.plus(ob1);
       String k=ob3.tostring();
       System.out.println("Add="+k);
       ob3=ob.times(ob1);
        String l=ob3.tostring();
        System.out.println("multiplication="+l);
        double e=ob.abs();
        System.out.println("absolute part of 1st complex number"+e);
        double f=ob1.abs();
        System.out.println("absolute part of 2nd complex number"+f);
       
       double c=ob.Re();
       System.out.println("real part of 1st complex number"+c);
       double d=ob.Im();
       System.out.println("imaginary part of 1st complex number"+d);
       double i=ob1.Re();
       System.out.println("real part of 2nd complex number"+i);
       double j=ob1.Im();
       System.out.println("imaginary part of 2nd complex number"+j);
   }
}
