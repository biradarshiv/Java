import java.io.*;

class IOTest4 
{
  public static void main(String st[]) throws Exception
  {
    System.out.println("Reading the Data");
    
    int x = 0;
    
    FileInputStream fis = new FileInputStream(st[0]);
    FileOutputStream fos = new FileOutputStream(st[1]);
    
    while( x!= -1 )
    {
      x = fis.read();
      if(x!= -1)
      fos.write(x);
    }
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac IOTest4.java

E:\>java IOTest4 LoginServlet.java IO4Text.txt
Reading the Data


*/