import java.util.Scanner;

public class Program

{

        public static void main(String[] args) 
        {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of elements");

                    int n=sc.nextInt();

                    int []a=new int[n];

                    System.out.println("enter the sequence values");

                    for(int i=0;i<n;i++)
                    {

                        a[i]=sc.nextInt();

                    }

                    int sum=a[0]+a[(a.length-1)];

                    if(n%2==0)
                    {

                        int c=0;

                        for(int i=0;i<n/2;i++)  
                        {
                
                                int temp_sum=a[i]+a[(a.length-1)-i];

                                if(temp_sum==sum)

                                continue;

                                else{

                                    System.out.println("not a pesudo arithemitic sequence");

                                    c++;

                                }

                                break;

                        }

                        if(c==0)
                        
                        System.out.println("sum of pesudo arithmetic number is:" +(sum*(n/2)));

                    }

            else
            {

                int c=0;

                for(int i=0;i<n/2;i++)
                {

                    int temp_sum1;

                    if(i!=(n/2)+1)
                    {

                        temp_sum1=a[i]+a[(a.length-1)-i];
                    }

                    else
                    {

                        a[(a.length-1)-i]=a[i];

                        temp_sum1=a[i]+a[(a.length-1)-i];

                    }

                    if(temp_sum1==sum)

                    continue;

                    else{
    
                        System.out.println("not a pesudo arithemitic sequence");

                        c++;

                    }

                    break;

                }

                    if(c==0)

                    System.out.println("sum of pesudo arithmetic number is:" +(sum*((n/2)+1)));

                }

            }
}

