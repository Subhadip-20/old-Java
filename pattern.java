public class pattern
{
    public static void main()
    {
        int i,j,k,p=0,q=5,m;
        System.out.println("THE PATTERN : ");
        for(i=0;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(p);
                p++;
            }
            System.out.println();
        }
        for(k=3;k>=1;k--)
        {
            for(m=1;m<=k;m++)
            {
                System.out.print(q);
                q--;
            }
            System.out.println();
        }
    }
}
