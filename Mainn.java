import java.util.*;
public class Mainn
{
public static void main(String[] args) {
int a, b,c,d,x,y,i,gcd = 0;
Scanner sc = new Scanner(System.in);
System.out.println("\nEnter the numerator  1st number : ");
a = sc.nextInt();
System.out.println("\nEnter the denominator  1st number : ");
b = sc.nextInt();

x=a*b;
y=a+b;
for(i=1; i <= x && i <= y; ++i)
{
if(x%i==0 && y%i==0)
gcd = i;
}
System.out.println("\nThe added fraction is "+ x/gcd + "/" + y/gcd);
System.out.println();
}
}