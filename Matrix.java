import java.util.*;
public class Matrix
{
    int a[][],m,n;
    
    Matrix(int mm,int nn)
    {
        m=mm;
        n=nn;
        a=new int[m][n];
    }
    void fillray()
    {
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        a[i][j]=(int)(Math.random()*10);
    }
    Matrix SubMat(Matrix A)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            A.a[i][j]=A.a[i][j]-a[i][j];
        }
        return A;
    }
    void display()
    {
          for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+"  ");
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the aarray");
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        Matrix ob=new Matrix(m,n);
        ob.fillray();
        ob.display();
        
        System.out.println("Enter the size of the aarray");
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        Matrix ob1=new Matrix(x,y);
        ob1.fillray();
        ob1.display();
         
         
         ob=ob.SubMat(ob1);
         ob.display();
         
    }
}