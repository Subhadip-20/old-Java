import java.util.*;
public class factorial
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        int s=1;
        for(int i=1; i<=n; i++)
        s=s*i;
        System.out.println(s);
    }

}

