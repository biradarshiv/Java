import java.io.*;

class IOTest5
{
  public static void main(String str[]) throws Exception
  {
  
  InputStreamReader in = new InputStreamReader(System.in);  //   imp
  
  BufferedReader br = new BufferedReader(in);  //   imp
  System.out.println("Enter name \t :");
  String name = br.readLine();  //   imp
  
  System.out.println("Enter ID \t :");
  DataInputStream dis = new DataInputStream(System.in);  //   imp
  
  int id = Integer.parseInt(dis.readLine());
  System.out.println(name +"\t"+ id);
  
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac IOTest5.java
Note: IOTest5.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

E:\>java IOTest5
Enter name       :
sri
Enter ID         :
10
sri     10

*/


