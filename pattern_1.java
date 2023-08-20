
public class pattern_1
{
    public static void main()
    {
        int a,b,c,i,j,k,p=0,q=2,w=4;
        System.out.println("THE PATTERN : ");
        for(i=5;i>=1;i--)
        {
            for(j=0; j<=p; j++)
            {
                System.out.print(" ");
            }
            
            for(k=i; k>=1; k--)
            {
                System.out.print(k);
            }
            
            System.out.println();
            p++;
        }
        
        for(a=1;a<=4;a++)
        {
            for(b=w; b>=1; b--)
            {
                System.out.print(" ");
            }
            
            for(c=q; c>=1; c--)
            {
                System.out.print(c);
            }
            
            System.out.println();
            q++;
            w--;
        }
    }
}
