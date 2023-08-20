import java.util.*;
public class ANGLE
{
    int d,m;
    ANGLE(int j , int k)
    {
        d=j;
        m=k;
    }
    void fnDisplay()
    {
        System.out.println(d+"degrees : "+m+" minutes");
    }
    ANGLE fnAddAngle(ANGLE A, ANGLE B)
    {
        int x=A.d+A.m;
        int y=B.d+B.m;
        
        if(y>60)
        {
            y=y%60;
            ++x;
        }
        B.d=x;
        B.m=y;
       return B;
    }
    public static void main(String args[])
    {
        int x,y,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the degree 1");
        x=sc.nextInt();
        System.out.println("Enter the minute 1");
        y=sc.nextInt();
        ANGLE ob1=new ANGLE(x,y);
        System.out.println("Enter the degree 2");
        a=sc.nextInt();
        System.out.println("Enter the minute 2");
        b=sc.nextInt();
        ANGLE ob2=new ANGLE(a,b);
        ob2= ob2.fnAddAngle(ob1,ob2);
        ob2.fnDisplay();  
    }
}
