import java.util.*;
public class pronic  
{ 
    public static void main()
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER A NUMBER");
            int n = sc.nextInt();
            int f = 0;
            for(int i=1;i<=n;i++)
            {
                if(i*(i+1)== n )
            { f=1;
                break;
            }
               
            }
            if(f==1)
            System.out.println("THE INPUTED NUMBER IS PRONIC");
            else
            System.out.println("THE NUMBER YOU HAVE ENTERED IS NOT PRONIC");
    }
}
