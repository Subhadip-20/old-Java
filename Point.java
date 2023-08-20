import  java.util.*;
class Point 
{
    double x1,x2,x3,x4,y1,y2,y3,y4;
    
    Point()
    {
        x1=x2=x3=x4=y1=y2=y3=y4=0;
    }
    void acceptPoint()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pont of all 4 x coordinate");
        x1=sc.nextDouble();
        x2=sc.nextDouble();
        x3=sc.nextDouble();
        x4=sc.nextDouble();
        System.out.println("Enter the pont of all 4 y coordinate");
        y1=sc.nextDouble();
        y2=sc.nextDouble();
        y3=sc.nextDouble();
        y4=sc.nextDouble();
    }
    void display()
    {
        System.out.println("value of x1 = "+x1);
        System.out.println("value of x2 = "+x2);
        System.out.println("value of x3 = "+x3);
        System.out.println("value of x4 = "+x4);
        System.out.println("value of y1 = "+y1);
        System.out.println("value of y2 = "+y2);
        System.out.println("value of y3 = "+y3);
        System.out.println("value of y4 = "+y4);
    }
}
class Slope extends Point
{
    double m1,m2;
    void findSlope()
    {
        super.acceptPoint();
        m1=(y2-y1)/(x2-x1);
        m2=(y4-y3)/(x4-x3);
    }
    void display()
    {
        System.out.println("value of slope m1 = "+m1);
        System.out.println("value of slope m2 = "+m2);
    }
    void check()
    {
        if(m1==m2)
        {System.out.println("parallel");}
        else if((m1*m2)==-1)
        System.out.println("perpendicular");
        else System.out.println("tera beka line");
        System.out.println("hello guys chai peelo");
    }
}