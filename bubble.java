import java.util.*;
public class bubble
{
 public static void main()
    {  
        int temp=0,flag=0,count=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("ENTER THE NUMBER OF THE ARRAY");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<a.length-1;i++) //
    {   
        for(int j=0;j<a.length-i-1;j++)
        {
            
            if(a[j]>a[j+1])
            {   temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=1;
                
            }
            if(flag==0) 
            break;
        }
    }
    System.out.println("count= "+count);
        for(int i=0 ; i<a.length;i++)
        System.out.print(a[i]+" ,");
}
}
