package honolulu;

public class reverse
{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);

        int m=a%10;
        int n=a/10;

        int k,sum=0;
        System.out.println("the input is "+a);
        System.out.println("the last digit is "+m);
        System.out.println("the remaining digits are "+n);
        while(a!=0){
            k=a%10;
            sum=(sum*10)+k;
            a=a/10;}
        System.out.println("the reverse of the number is "+ sum);
    }
}
