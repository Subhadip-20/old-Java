import java.io.*;
class TTV1
{
    void saveDetails()throws IOException
    {
        FileWriter fout=new FileWriter("qwerty.txt");
        BufferedWriter bout=new BufferedWriter(fout);
        PrintWriter pout=new PrintWriter(bout);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean moreval=true;
        while(moreval)
        {
            System.out.println("Enter the subject name:");
            String sub=br.readLine();
            System.out.println("Enter the marks:");
            int n=Integer.parseInt(br.readLine());
            pout.println(sub+" "+n); //saving the subject and marks entered by user in one line in .txt file
            System.out.println("Do you wish to continue?Press 1 to continue ;2 to exit");
            int t=Integer.parseInt(br.readLine());
            if(t==2)
            { moreval=false;
                pout.close();
                bout.close();
                fout.close();
                System.exit(0);
            }
        }
    }
}