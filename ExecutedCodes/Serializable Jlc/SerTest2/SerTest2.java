import java.io.*;

class SerTest
{
  public static void main(String str[]) throws Exception
  {
    Address add = new Address(104, "Mathikere");
    
    Student st = new Student(12, "sri", 12500, 123456, "Srinivas", "dnade", add);
    Student.totalfee = 15000;
    System.out.println(st);
    
    FileOutputStream fos = new FileOutputStream("stud.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeFloat(Student.totalfee);
    oos.writeObject(st);
    
  }
}

class DeserTest 
{
  public static void main(String str[]) throws Exception
  {
    FileInputStream fis = new FileInputStream("stud.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    float fee = ois.readFloat();
    System.out.println(fee);
    
    Object obj = ois.readObject();
    Student st = (Student)obj;
    System.out.println(st);
  }
}

class Person  // imp
{
  String name = "Manish";
  // String name; // since Person does not implement serializable hence name will be assigned default value when deserialized  // imp
  
  Person()
  {
    System.out.println("Default constructor of Person");
  }
  
  Person(String name)
  {
    System.out.println("** Parameterized constructor of Person");
    this.name = name;
  }
}

class User extends Person implements Serializable  // imp
{
  String username;
  transient String password; // imp
  
  User(String username, String password, String name)
  {
    super(name);
    this.username = username;
    this.password = password;
    System.out.println(" Parameterized constructor of User");
  }
}

class Student extends User
{
  int sid;
  float fee;
  
  static float totalfee = 0.01f; // imp
  transient long  phone = 12; // imp
  
  Address add;
  
  Student(int sid, String name, float fee, long phone, String username, String password, Address add)
  {
    super(username, password, name);
    System.out.println("Parameterzed constructor of student");
    this.sid = sid;
    this.fee = fee;
    this.phone = phone;
    this.add = add;
  }
  
  public String toString()
  {
    return sid +"\t"+ name +"\t"+ fee +"\t"+ totalfee +"\t"+ phone +"\t"+ username +"\t"+password +"\t"+ add;
  }
}


class Address implements Serializable  // imp
{
  int aid;
  String street;
  
  Address(int aid, String street)
  {
    this.aid = aid;
    this.street = street;
  }
  
  public String toString()
  {
    return aid +"\t"+ street;
  }
  
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac SerTest2.java

E:\>java SerTest
** Parameterized constructor of Person
 Parameterized constructor of User
Parameterzed constructor of student
12      sri     12500.0 15000.0 123456  Srinivas        dnade   104     Mathikere

E:\>java DeserTest
15000.0
Default constructor of Person
12      Manish  12500.0 0.01    0       Srinivas        null    104     Mathikere



*/

































