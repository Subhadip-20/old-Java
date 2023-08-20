import java.util.*;
import static java.lang.System.out;
public class insert
{
    public static void main()
    {  
        int temp=0,j,flag=0,count=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        out.println("ENTER THE NUMBER OF THE ARRAY");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        for(int i=1;i<a.length;i++)
        {
            temp=a[i];
            j=i-1;
            while(j>=0&&a[j]>temp)
            {
                // count++;
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        //System.out.println("count= "+count);
        for(int i=0 ; i<a.length;i++)
        System.out.print(a[i]+" ,");
    }
}
