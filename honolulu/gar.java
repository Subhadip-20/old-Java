package honolulu;
public class gar
{
    //i am kala
    public static void main()
    {
        int a[]=new int[5];
        int b;
        String g="Hii";
        try{
            System.out.println(g.charAt(6));
            System.out.println(5/0);
            System.out.println(a[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division not possible");
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You went out of range");
            
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("You went out of range in string");
        }
        System.out.println("End of code");
    }
}
