package honolulu;
public class sup
{
    int a=5; // eta amio jantam na....
    void displaySup()
    {
        int a=15;
        this.a=10;
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main(String args[])
    {
        sup ob1=new sup();
        ob1.displaySup();
        g ob=new g();
        ob.display();
    }
}
class g extends sup
{
    void display()
    {
        int a=69;
        System.out.println(a);
        System.out.println(super.a);
    }
}
