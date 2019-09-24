import java.io.*;

class IOTest32
{
  public static void main(String st[]) throws Exception 
  {
    System.out.println(" Read the data from text file ");
    int x = 0;
    
    FileInputStream fis = new FileInputStream(st[0]);
    while(x != -1)
    {
      x = fis.read();
      if(x != -1)
      {
        System.out.println((char)x);
      }
    }
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac IOTest32.java

E:\>java IOTest32 e:\IOTest31\bc1.txt
 Read the data from text file
a



a
b
c
d



j
k
l

*/