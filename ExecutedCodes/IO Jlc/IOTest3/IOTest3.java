import java.io.*;

class IOTest3
{
  public static void main(String str[]) throws Exception 
  {
    System.out.println(" Provide data ");
    int x = 0;
    String s = "";
    
    while(x != '\n')
    {
      x = System.in.read();
      s = s + (char)x;
    }
    
    FileWriter fr = new FileWriter("bc1.txt");
    fr.write(s);
    fr.flush();
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac IOTest3.java

E:\>java IOTest3
 Provide data
this is the third file written using filewriter

*/