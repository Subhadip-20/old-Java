import java.util.*;
public class TailRecursion
{
    public static void tail(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            System.out.println(n);
        }
        tail(n-1);
    }
    public static void main()
    {
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        k=sc.nextInt();
        System.out.println("NUMBER IN REVERSE ORDER");
        tail(k);
    }
    
}
