import java.util.*;
public class telllcall
{
    int phno,n;
    double amt;
    String name;
    
    telllcall(int x,String y, int k)
    {
        phno=x;
        n=k;
        amt=0;
        name=y;
     }
    void compute()
    {
        if(n>=1&&n<101)
        {
            amt=500;
        }
        if(n>=101&&n<201)
        {
            amt=500+(n-100)*1;
        }
        if(n>=201&&n<301)
        {
            amt=500+100+(n-200)*1.2;
        }
        if(n>=301)
        {
            amt=500+100+100*1.2+(n-300)*1.5;
        }
    }
    void display()
    {
        System.out.println("Phone number\t\tName\t\tTotal Call\t\tAmount");
        System.out.println(phno+"\t\t"+name+"\t\t"+n+"\t\t"+amt);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String z=sc.nextLine();
        System.out.println("Enter the phone number");
        int a=sc.nextInt();
        System.out.println("Enter the total number of call");
        int y=sc.nextInt();
        
        telllcall ob=new telllcall(a,z,y);
        ob.compute();
        ob.display();
    }
}
