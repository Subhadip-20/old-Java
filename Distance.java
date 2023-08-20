import java.util.*;
class Distance extends Piont
{
    double midx,midy;
    Scanner sc=new Scanner (System.in);
    
    void readPiont()
    {
       
        System.out.println("Enter the pont of all 2 x coordinate");
        x1=sc.nextDouble();
        x2=sc.nextDouble();
        System.out.println("Enter the pont of all 2 y coordinate");
        y1=sc.nextDouble();
        y2=sc.nextDouble();
    }
    void FindDistance()
    {
       dis=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
       
       
        
        
    }
    void FindMidPoint()
    {
        
        midx=(x1+x2)/2;
        midy=(y1+y2)/2;
        
    }
    void Show()
    {
        System.out.println("distance = "+dis);
        System.out.println("midpoint of x = "+midx);
        System.out.println("midpoint of y = "+midy);
    }
    public  void main()
    {
        Distance ob=new Distance();
        super.Show();     
        ob.readPiont();
        ob.FindMidPoint();
        ob.Show();
        
    }
}
abstract class Piont
{
   double x1,x2,y1,y2,dis;
   Piont()
   {
       x1=x2=y1=y2=0;
       
   }
   abstract void readPiont();
   abstract void FindDistance();
   void Show()
   {
       System.out.println("value of x1,y1,x2,y2");
   }
   
}
