import java.util.*;
public class deleting
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[1000];
        int n[]={1,2,3,4,5,6,7,8,9};
        for (int i=0; i<n.length; i++)
        {
            a[i]=n[i];
            System.out.print(n[i]);
        }
        System.out.println("ENTER THE INDEX NUMBER TO BE DELETED");
        int m=sc.nextInt();
        for(int i=m; i<n.length; i++)
        a[i]=a[i+1];
        a[n.length-1]=0;
        for(int i=0; i<n.length-1; i++)
        System.out.println(a[i]);
    }
}
