import java.util.*;
public class selectionsort
{
    public static void main()
    {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        for(int i=0; i<a.length; i++)
        a[i]=sc.nextInt();
        for(int i=0; i<a.length; i++)
        {   
            int m=i;
                for(int j=i+1; j<a.length; j++)
                { if(a[m]>a[j])
                    m=j;
                }
             temp=a[m];
             a[m]=a[i];
             a[i]=temp;
    }
        for(int k=0; k<a.length; k++)
        {
            System.out.println(a[k]);
        }
    }
}
