import java.util.*;
public class ddpattern
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int r=sc.nextInt();
        int k=r-1,l=0;
        char ch[][]=new char[r][r];
        System.out.println("ENTER 3 CHARACTERS");
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        char c=sc.next().charAt(0);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                if((j==i)||(i+j==r-1))
                {
                    ch[i][j]=a;
                }
                else if(j<i)
                {
                    if(j+i<r-1)
                    ch[i][j]=b;
                    else 
                    ch[i][j]=c;
                }
                else if(j>i)
                {
                    
                    if(j+i>r-1)
                    ch[i][j]=b;
                    else
                    ch[i][j]=c;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(ch[i][j]);
            }
            
            System.out.println();
        }
    }
}