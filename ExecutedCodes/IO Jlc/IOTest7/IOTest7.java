import java.io.*;

class IOTest7 
{
  public static void main(String str[]) throws Exception
  {
    File f = new File("E:");
    File f1[] = f.listFiles();
    
    for(int i = 0; i<f1.length; i++)
    {
      System.out.println(f1[i]);
    }
    
    System.out.println("------------.java files");
    File f2[] = f.listFiles(new NameFilter(".java"));
    for(int i = 0; i<f2.length; i++)
    {
      System.out.println(f2[i]);
    }
    
    System.out.println("------------.directories ");
    File f4[] = f.listFiles(new DirectoryFilter());
    for(int i = 0; i<f4.length; i++)
    {
      System.out.println(f4[i]);
    }
    
  }
}

class NameFilter implements FileFilter
{
  String ext;
  
  NameFilter(String ext)
  {
    this.ext = ext;
  }
  
  public boolean accept(File f)
  {
    return f.getName().endsWith(ext);
  }
}


class DirectoryFilter implements FileFilter
{
  public boolean accept(File f)
  {
    return f.isDirectory();
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac IOTest7.java

E:\>java IOTest7
E:\DirectoryFilter.class
E:\Head_First_Practice
E:\IO Jlc
E:\IOTest1
E:\IOTest2
E:\IOTest3
E:\IOTest31
E:\IOTest32
E:\IOTest4
E:\IOTest5
E:\IOTest6
E:\IOTest7
E:\IOTest7.class
E:\IOTest7.java
E:\JAVA LEARNING CENTER EXECUTED CODES
E:\JDK1.5
E:\jdk1.5.0_21
E:\LoginServlet.java
E:\MY Eclipse 7 Workspace
E:\NameFilter.class
E:\Need While Writing.txt
E:\old codes
E:\RECYCLER
E:\System Volume Information
E:\Tomcat 5.0
------------.java files
E:\IOTest7.java
E:\LoginServlet.java
------------.directories
E:\Head_First_Practice
E:\IO Jlc
E:\IOTest1
E:\IOTest2
E:\IOTest3
E:\IOTest31
E:\IOTest32
E:\IOTest4
E:\IOTest5
E:\IOTest6
E:\IOTest7
E:\JAVA LEARNING CENTER EXECUTED CODES
E:\JDK1.5
E:\jdk1.5.0_21
E:\MY Eclipse 7 Workspace
E:\old codes
E:\RECYCLER
E:\System Volume Information
E:\Tomcat 5.0

*/