import java.util.*;
public class prime
{
    public static void main()
    { int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n= sc.nextInt();
        for(int i=1; i<=n ; i++)
        { if (n%i==0 )
            {count++;}
        }
        if(count==2)
        System.out.println("PRIME NUMBER");
        else
        System.out.println("NOT A PRIME NUMBER");
    }
}

