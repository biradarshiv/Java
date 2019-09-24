abstract class Person
{
  private int age;
  private String name;
  public static final int  min_vot_age = 18;
  
  {
    System.out.println("Person Instance Block");
  }
  
  Person(String name, int age)
  {
    System.out.println("Person constructor");
    this.name = name;
    this.age = age;
  }
  
  void showinfo()
  {
    System.out.println(name +"\t"+ age );
  }
  
  abstract void work();
  
}

abstract class Student extends Person
{
  private int sid;
  private String batchtiming;
  
  {
    System.out.println("Student Instance Block");
  }
  
  Student(String name, int age, int sid, String timing)
  {
    super(name, age);
    System.out.println("Student Constructor");
    this.sid = sid;
    this.batchtiming = timing;
  }
  
  void showinfo()
  {
    super.showinfo();
    System.out.println(sid+"\t"+batchtiming);
  }
}

class OldStudent extends Student
{
  {
    System.out.println("oldStudent instance block");
  }
  
  OldStudent(String name, int age, int sid, String timing)
  {
    super(name, age, sid, timing);
    System.out.println("oldStudent constructor");
  }
  
  void work()
  {
    System.out.println("Course completed. Searching for job");
  }
}

class CurrentStudent extends Student
{
  {
    System.out.println("CurrentStudent instance block");
  }
  
  CurrentStudent(String name, int age, int sid, String timing)
  {
    super(name, age, sid, timing);
    System.out.println("CurrentStudent constructor");
  }
  
  void work()
  {
    System.out.println("Course is going on");
  }
  
}

class Test90
{
  public static void main(String str[])
  {
    System.out.println(Person.min_vot_age);
    OldStudent ost = new OldStudent("sri", 25, 14, "3 to 8");
    ost.showinfo();
    ost.work();
    
    CurrentStudent cst = new CurrentStudent("sri", 10, 20, "8 to 6");
    cst.showinfo();
    cst.work();    
    
  }  
}



/*
OUT PUT OF THE PROGRAM IS 
E:\>javac Test90.java

E:\>java Test90
18
Person Instance Block
Person constructor
Student Instance Block
Student Constructor
oldStudent instance block
oldStudent constructor
sri     25
14      3 to 8
Course completed. Searching for job
Person Instance Block
Person constructor
Student Instance Block
Student Constructor
CurrentStudent instance block
CurrentStudent constructor
sri     10
20      8 to 6
Course is going on

*/
