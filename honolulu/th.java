package honolulu;
class th
{
    public static void main(String args[])
    {
        h t=new h();
        t.start();
        h t1=new h();
        t1.start();
    }
}
class h extends Thread
{
    public void run() 
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Lobh you Apuu "+ i);

            try{Thread.sleep(1000);}
            catch(InterruptedException e)
            {}

        }
    }

}
