import java.util.*;
public class overload
{ 
double volume(double r)
{ double v = (4/3)*(22/7)*r*r*r;
return v;
}
double volume(double h, double r)
{
double g = (22/7)*r*r*h;
return g;
}
double volume(double l, double b, double h)
{ double f = l*b*h;
return f;
}
    public static void main()
    { Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF RADIUS, HEIGT, LENGTH, BREADTH");
       double r=sc.nextDouble();
       double h=sc.nextDouble();
       double l=sc.nextDouble();
       double b=sc.nextDouble();
        overload ob=new overload();
        double k=ob.volume(r);
        double d=ob.volume(h,r);
        double m=ob.volume(l,b,h);
        System.out.println("VOLUME OF SPHERE       "+k);
        System.out.println("VOLUME OF CYLINDER     "+d);
        System.out.println("VOLUME OF CUBOID       "+m);
       
}
}
