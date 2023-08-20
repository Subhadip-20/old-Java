 public class OCT_TO_DECCI
{
    public static void main(int n)
    {
         double s=0, x=0;
        while(n!=0)
        {
            int r=n%10;
            s=s+r*Math.pow(8,x);
            n/=10;
            x++;
        }
        System.out.print(s);
    }
}