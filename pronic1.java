import java.util.*;
public class pronic1
{public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF TERMS");
    int n = sc.nextInt();
    for(int i=0; i<=n;i++)
    System.out.println(i*(i+1));
}
}
