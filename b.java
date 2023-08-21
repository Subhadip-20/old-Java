import java.util.*;
public class b
{
    public static void main()
    {
        int s=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[500];
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        a[i]=i+1;
        for(int i=1;i<n;i++)
        { s=0; String g="";
            
            for(int j =i;j<=n;j++)
            {s+=j;
                g=g+""+j;
                if (s==n)
                break;
                else if (s<n)
                continue;
                
               
        }
        if (s==n)
        System.out.println(g+",");
        sc.close();
    }}
    

}