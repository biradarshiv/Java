class Person
{
  private int age;
  private String name;
  
  Person(String name, int age)
  {
    this.name = name;
    this.age = age;
  }
  
  void showinfo()
  {
    System.out.println(name +"\t"+ age);
  }
  
  void work()
  {
    
  }
}


class Student extends Person
{
  private int sid;
  private String batchtiming;
  
  Student(String name, int age, int sid, String timing)
  {
    super(name, age);
    this.sid = sid;
    this.batchtiming = timing;
  }
  
  void showinfo()
  {
    super.showinfo();
    System.out.println(sid +"\t"+ batchtiming);
  }
}

class OldStudent extends Student
{
  OldStudent(String name, int age, int sid, String timing)
  {
    super(name, age, sid, timing);
  }
  
  void work()
  {
    System.out.println("Course completed. Searching for Job");
  }
}

class CurrentStudent extends Student
{
  CurrentStudent(String name, int age, int sid, String timing)
  {
    super(name, age, sid, timing);
  }
  
  void work()
  {
    System.out.println("Course is going on");
  }
}


class Test89
{
  public static void main(String str[])
  {
    OldStudent ost = new OldStudent("sri", 25, 14, "3:00 to 8:00");
    ost.showinfo();
    ost.work();
    
    CurrentStudent cst = new CurrentStudent("Manish", 24, 57, "6:00 to 8:00");
    cst.showinfo();
    cst.work();
    
  }  
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test89.java

E:\>java Test89
sri     25
14      3:00 to 8:00
Course completed. Searching for Job
Manish  24
57      6:00 to 8:00
Course is going on

*/



