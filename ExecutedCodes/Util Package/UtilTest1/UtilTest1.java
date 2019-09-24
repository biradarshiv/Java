import java.util.*;

class UtilTest1 
{
  public static void main(String str[])
  {
    Set col = new TreeSet();
    
    col.add( new Student(10, "Sri"));
    col.add( new Student(12, "Manish"));
    
    System.out.println(col);
  }
}

class Student implements Comparable
{
  int sid;
  String name;
  
  Student( int sid, String name)
  {
    this.name = name;
    this.sid = sid;
  }
  
  public String toString() // this will be called if you are printing the reference.
  {
    return sid +"\t"+name;
  }
  
  public int compareTo(Object obj)
  {
    Student st = (Student)obj;
    // return this.sid - st.sid;  // use this based on sid
    return this.name.compareTo(st.name);
  }
  
}

/*
OUT PUT OF THE PROGRAM IS 

E:\>javac UtilTest1.java
Note: UtilTest1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java UtilTest1
[12     Manish, 10      Sri]

*/