public class Main {
  public static void main(String[] args) {
      String l="1 1 s 90 90 90",g="";
      int x=0,ss1,ss2,ss3,marks,p;
      
    for(int i=0;i<l.length();i++)
            {
                char ch=l.charAt(i);
                System.out.println(ch);
                if(ch==' ')
                {
                    x++;
                    System.out.println(x);
                
                if(x==3)
                {
                    System.out.println(i);
                    
                    g=l.substring(i+1);
                    System.out.println(g);
                        for(int j=0;j<g.length();j++)
                        {
                            ss1=Integer.parseInt(g.substring(0,2));
                            ss2=Integer.parseInt(g.substring(3,5));
                            ss3=Integer.parseInt(g.substring(6));
                            marks=ss1+ss2+ss3;
                            break;
                        }
                }
                
            }
            }
            
  }
}