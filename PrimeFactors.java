import java.util.Scanner;
class PrimeFactors
{
public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number to find Prime Factors ");   //
int number=sc.nextInt();
System.out.println("Given Number is : " + number);
System.out.print("Prime Factors are : " );
        for (int i = 2; i <= number; i++) {
 
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }
 
        if (number < 1) System.out.println(number+",");
    }
 
}