import java.io.*;

class IOTest2
{
  public static void main(String str[]) throws Exception 
  {
    System.out.println(" Provide data ");
    int x = 0;
    
    FileOutputStream fos = new FileOutputStream("bc.txt");
    while(x != '\n')
    {
      x = System.in.read();
      fos.write(x);
    }
  }
}


/*
OUT PUT OF THE PROGRAM IS 


E:\>javac IOTest2.java

E:\>java IOTest2
 Provide data
Hi How are you ?

it has written in a text file with name bc.

*/