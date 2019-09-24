import java.io.*;

class IOTest6 
{
  public static void main(String str[]) throws Exception
  {
    System.out.println("Reading the data from Keyboad and saving it in a file");
    
    FileOutputStream fos = new FileOutputStream("Hello.txt");
    DataReaderAndWriter.readAndWriter(System.in,fos);
    
    System.out.println("Reading the data from file and writing to console");
    
    FileInputStream fis = new FileInputStream("HI.txt");
    DataReaderAndWriter.readAndWriter(fis, System.out);
  }
}

class DataReaderAndWriter
{
  public static void readAndWriter(InputStream in, OutputStream os) throws Exception
  {
    int x = 0;
    while(true)
    {
      x = in.read();
      if(in instanceof BufferedInputStream && x == '\n')
      break;
      else if (in instanceof FileInputStream && x == -1 )
      break;
      
      os.write(x);
    }
  }
}



/*
OUT PUT OF THE PROGRAM IS 

E:\>javac IOTest6.java

E:\>java IOTest6
Reading the data from Keyboad and saving it in a file
HI
Reading the data from file and writing to console
HI wassssssssup.............

Bro...



*/