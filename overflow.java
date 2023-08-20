import java.util.*;
public class overflow
{
    static int area(int a)
    {
        return(a*a);
    }
    static int area(int a,int b)
    {
        return(a*b);
    }
    static double area(double r)
    {
        return (Math.PI*r*r);
    }
    public static void main()
    {
        
        System.out.println("the area of square is "+ area(5));
        System.out.println("the area of rectangle is "+ area(3,4));
        System.out.println("the area of circle is "+ area(5.0));
        
        
    }
}
