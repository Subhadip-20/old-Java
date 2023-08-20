import java.util.*;
public class Transarray
{
    int arr[][],m,n;
    Transarray()
    {
        
    }
    Transarray(int mm, int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements of the array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void transpose(Transarray A)
    {
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        A.arr[i][j]=arr[j][i];
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}
