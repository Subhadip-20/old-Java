import java.util.*;
public class merge_and_sort
{
    public static void mian()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE FIRST ARRAY");
        int m=sc.nextInt();
        System.out.println("ENTER THE SIZE OF THE SECOND ARRAY");
        int n=sc.nextInt();
        String a[]=new String[m];
        String b[]=new String[n];
        String c[]=new String[m+n];
        System.out.println("ENTER THE NAMES IN FIRST ARRAY");
        for(int i=0;i<m;i++)
        {
            a[i]=sc.next();
            c[i]=a[i];
        }
        System.out.println("ENTER THE NAMES IN SECOND ARRAY");
        for(int i=0;i<n;i++)
        {
            b[i]=sc.next();
            c[m+i]=b[i];
        }
        System.out.println();
        System.out.println("AFTER MERGING, BUT WITHOUT SORTING....");
        System.out.println();
        for(int i=0;i<(m+n);i++)
        System.out.println(c[i]);
        System.out.println();
        System.out.println("AFTER MERGING AND SORTING");
        System.out.println();
        for(int i=0;i<(m+n)-1;i++)
        {
            int min=i;String k="";
            for(int j=i+1;j<(m+n);j++)
            {
                if(c[j].compareTo(c[min])<0)
                {
                    min=j;
                }
            }
            k=c[i];
            c[i]=c[min];
            c[min]=k;
        }
        for(int i=0;i<(m+n);i++)
        System.out.println(c[i]);
        System.out.println();
        System.out.println("END OF PROG");
    }
}
