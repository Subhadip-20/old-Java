import java.io.*;
public class filee
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw=new FileWriter("abc.txt");
        for(int i=0;i<=1;i++)
        {
            System.out.println("Enter the no");
            String g=br.readLine();
            fw.write(g+"\n");
        }
        fw.close();
        BufferedReader fr=new BufferedReader(new FileReader("abc.txt"));
        String l;
        while((l=fr.readLine())!=null)
        {
            int p=Integer.parseInt(l);
            System.out.println(p);
        }
        fr.close();
    }
}