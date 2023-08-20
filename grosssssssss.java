import java.util.*;
public class grosssssssss
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE BASIC PAY");
        double b=sc.nextDouble();
        
        double da,hra,pf,epf,cta,gross,net;
        da=(8*b)/100;
        hra =(b*12)/100;
        pf=(8.33*b)/100;
        epf=(1.67*b)/100;
        cta=(8*b)/100;
        gross=b+da+hra+cta;
        net=gross-(pf+epf);
        System.out.println("GROSS SALARY"+gross);
        System.out.println("NET SALARY"+net);
    }
     }

