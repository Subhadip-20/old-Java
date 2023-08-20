public class ffff
{
    int fact(int n)
    {
        if(n==0)
        return 0;
        else return (n%10)+fact(n/10);
    }
    public static void main()
    {
        ffff ob=new ffff();
        int p=ob.fact(210);
        System.out.print(p);
    }
}
