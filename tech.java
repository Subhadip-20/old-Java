
public class tech
{
    public static void main()
    {
        double s=0,p=0, d;

        for(double i=1000; i<=9999; i++)
        {
            p=i%100;
            s=i/100;
            d=Math.pow((p+s),2);
            if(d==i)
            {
            System.out.println(i);
        }
    }
    }
}
