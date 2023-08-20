import java.io.*;
public class FruitJuice
{
    int product_code,pack_size,product_price;
    String flavour, pack_type;
    
    FruitJuice()
    {
        product_code=pack_size=product_price=0;
        flavour= pack_type="";
    }
    void input() throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE PRODUCT CODE, FLAVOUR, PACK TYPE, PRODUCT SIZE, PRODUCT PRICE");
        product_code=Integer.parseInt(br.readLine());
        flavour=br.readLine();
        pack_type=br.readLine();
        pack_size=Integer.parseInt(br.readLine());
        product_price=Integer.parseInt(br.readLine());
    }
    void discount()
    {
        product_price=product_price-10;
    }
    void display()
    {
        System.out.println("PRUDUCT CODE : " +product_code );
        System.out.println("FLAVOUR : "+ flavour);
        System.out.println("PACK TYPE : "+ pack_type);
        System.out.println("PACK SIZE : "+pack_size);
        System.out.println("PRODUCT PRICE : "+product_price);
    }
    public static void main() throws IOException
    {
        FruitJuice ob=new FruitJuice();
        ob.input();
        ob.discount();
        ob.display();
    }
        
}
