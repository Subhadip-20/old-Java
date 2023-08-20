import java.util.*;
public class fibbo
{
  static  int a=0,b=1,c=0;
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int m=sc.nextInt();
        for( int i=1;i<=m;i++)
        {
            c=fib(i);
            System.out.print(c+",");
        }
    }
   static   int fib(int n) //Recursive function for generating the 'nth' term of "Fibonacci Series"
{
if(n<=1)
return a;
else if(n==2)
return b;
else
return (fib(n-1)+fib(n-2));
        
    }
}