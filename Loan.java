import java.util.*;
public class Loan
{
    int time;
    double rate , principal,interest,amt;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal and the time");
        principal=sc.nextDouble();
        time=sc.nextInt();
        if(time<5)
        rate=15;
        if(time>=5&&time<10)
        rate=12;
        if(time>10)
        rate=10;
    }
    void calculate()
    {
        interest=(principal*rate*time)/100;
        amt=principal+interest;
    }
    void display()
    {
        System.out.println("interest = "+interest+" amount = "+amt);
    }
    public static void main()
    {
        Loan ob=new Loan();
        ob.getdata();
        ob.calculate();
        ob.display();
    }
}
