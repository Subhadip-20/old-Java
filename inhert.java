import java.util.*;
class inhert
{
    static void display()
    {
        System.out.println("child class");
    }
    public static void main()
    {
        // in i love u
        c ob=new c();
        ob.hello(); 
        display();
    }
}
class c extends inhert
{
    void hello()
    {
        System.out.println("parent class");
       
    }
    
}


