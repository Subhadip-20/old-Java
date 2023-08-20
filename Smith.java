import java.io.*;
class Smith
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int sumDig(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
     
    int sumPrimeFact(int n)
    {
        int i=2, sum=0;
        while(n>1)
        {
            if(n%i==0)
            {
                sum=sum+sumDig(i);
                n=n/i;
            }
            else
                i++;
        }
        return sum;
    }
 
public static void main(String args[]) throws IOException
{
    Smith ob=new Smith();
    System.out.print("Enter a Number : ");
    int n=Integer.parseInt(br.readLine());
    int a=ob.sumDig(n);
    int b=ob.sumPrimeFact(n); 
     
    System.out.println("Sum of Digit = "+a);
    System.out.println("Sum of Prime Factor = "+b);
     
    if(a==b)
    System.out.print("It is a Smith Number");
    else
    System.out.print("It is Not a Smith Number");
}
}
