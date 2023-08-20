public class recur
{
    int Sum=1;
    int fact(int n)
{
	if(n>0)
	{
		return (fact(n-1)*n);
	}
	else
	return 1;
	
	
}
    public static void main()
{
	int i,n=5,fac=1;
	
	/*for(i=n;i>0;i--)
	{
		printf("%d *",i);
		fac=fac-1; //fac=fac*i
	}*/
	recur ob=new recur();
	System.out.println(ob.fact(5));
}
}
