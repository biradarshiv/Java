import java.io.*;

class IOTest1
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
    System.out.println(s);
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac IOTest1.java

E:\>java IOTest1
 Provide data
Hi How are you ?
Hi How are you ?


*/