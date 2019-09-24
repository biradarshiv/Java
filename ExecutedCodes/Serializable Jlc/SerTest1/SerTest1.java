import java.io.*;

class SerTest
{
  public static void main(String str[]) throws Exception
  {
    Student st = new Student(12, "sri", 12500, 123456);
    System.out.println(st);
    
    FileOutputStream fos = new FileOutputStream("stud.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(st);
  }
}

class DeserTest
{
  public static void main(String str[]) throws Exception
  {
    FileInputStream fis = new FileInputStream("stud.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Object obj = ois.readObject();
    
    Student st = (Student)obj;
    System.out.println(st);
    System.out.println(st.sid);
  }
}

class Student implements Serializable
{
  int sid;
  String name;
  float fee;
  long phone;
  
  Student(int sid, String name, float fee, long phone)
  {
    System.out.println("** param cons of student ");
    this.sid = sid;
    this.name = name;
    this.fee = fee;
    this.phone = phone;
    
  }
  
  public String toString()
  {
    return sid +"\t"+ name +"\t"+ fee +"\t"+ phone ;
  }
}




/*
OUT PUT OF THE PROGRAM IS 

E:\>javac SerTest1.java

E:\>java SerTest
** param cons of student
12      sri     12500.0 123456

E:\>java DeserTest
12      sri     12500.0 123456
12



*/