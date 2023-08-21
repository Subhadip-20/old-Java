import java.util.*;
public class Combine
{
    int com[],size;
    Combine(int nn)
    {
        size=nn;
        com=new int[size];
    }
    void inputarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++)
        com[i]=sc.nextInt();
        sc.close();
    }
    void sort()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(com[i]>com[i+1])
                {
                    int temp=com[i];
                    com[i]=com[i+1];
                    com[i+1]=temp;
                }
            }
        }
    }
    void mix(Combine A,Combine B)
    {
        int i;
        for(i=0;i<A.size;i++)
        {
            com[i]=A.com[i];
        }
        for( int j=0;j<B.size;j++)
        {
            com[i++]=B.com[j];
        }
    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(com[i]);
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int p=sc.nextInt();
        Combine ob1=new Combine(p);
        ob1.inputarray();
        System.out.println("Enter the size of the second array");
        int q=sc.nextInt();
        Combine ob2=new Combine(q);
        ob2.inputarray();
        int d=p+q;
        Combine ob3=new Combine(d);
        ob3.mix(ob1,ob2);
        ob3.sort();
        ob3.display();
        sc.close();
    }
}
