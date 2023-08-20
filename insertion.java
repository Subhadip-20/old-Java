import java.util.*;
public class insertion
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[1000000];
        int n[]={1,2,3,4,5,6,7,8,9};
        for(int i=0; i<n.length; i++)
        a[i]=n[i];
        System.out.println("ENTER THE NUMBER TO BE INSERTED");
        int m=sc.nextInt();
        System.out.println("ENTER THE INDEX NUMBER OF THE ELEMENT");
        int k=sc.nextInt();
        for(int i= n.length; i>k; i--)
        a[i]=a[i-1];
        a[k]=m;
        for(int i=0; i<=n.length; i++)
        System.out.print(a[i]);
    }
        
        
}
