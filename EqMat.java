import java.util.*;
public class EqMat
{
    int a[][],m,n;
    
    EqMat(int mm, int nn)
    {
        m=mm;
        n=nn;
        a=new int[m][n];
    }
    void readarray()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    int check(EqMat P,EqMat Q)
    {
        int f=0;
        l: for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               int a=P.a[i][j];
               int b=Q.a[i][j];
               if(a==b)
                {
                    f=1;
                }
                else 
                {
                    f=0;
                    break l;
                }
            }
            
        }
        return f;
        
    }
    void print()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,y,a,b;
        System.out.println("Enter the number of rows for the first matrix");
        x=sc.nextInt();
        System.out.println("Enter the number of coloumn for the first matrix");
        y=sc.nextInt();
        EqMat ob1=new EqMat(x,y);
        System.out.println("Enter the values of marix 1");
        ob1.readarray();
        ob1.print();
        System.out.println("Enter the number of rows for the second matrix");
        a=sc.nextInt();
        System.out.println("Enter the number of coloumn for the second matrix");
        b=sc.nextInt();
        EqMat ob2=new EqMat(a,b);
        System.out.println("Enter the values of marix 2");
        ob2.readarray();
        ob2.print();
        
        if(x!=a||y!=b)
        {
            System.out.println("The dimenssions did not match");
            System.exit(0);
        }
        EqMat ob3=new EqMat(x,y);
        int p=ob3.check(ob1,ob2);
        if(p==1)
        System.out.println("Equal Matrix");
        if(p==0)
        System.out.println("Unequal Matrix");
    }
}
