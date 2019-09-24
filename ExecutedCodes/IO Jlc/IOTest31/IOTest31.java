import java.io.*;

class IOTest31
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
    
    FileWriter fr = new FileWriter("bc1.txt", true);
    fr.write(s);
    fr.flush();
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac IOTest31.java

E:\>java IOTest31
 Provide data
ss

E:\>java IOTest31
 Provide data
ssdd

E:\>java IOTest31
 Provide data
fdfd


*/