class Test73
{
  public static void main(String str[])
  {
    Student st = new Student(10, "sri");
    System.out.println(st.sid +"\t"+ st.name);
    
    Student st1 = new Student(); 
    /* without 2 and with 1 will give the following error
    
      E:\>javac Test73.java
      Test73.java:8: cannot find symbol
      symbol  : constructor Student()
      location: class Student
      Student st1 = new Student();
                  ^
      1 error
    */
    
    st.Student();
  }
}


class Student
{
  int sid;
  String name;
  
  //1.
  void Student()
  {
    System.out.println("void Student()");
  }
  
  //2.
  Student()
  {
    System.out.println("Default constructor Student()");
  }
  
  Student(int sid, String name)
  {
    this.sid = sid;
    this.name = name;
    System.out.println("Student(int, String)");
  }
}

/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test73.java

E:\>java Test73
Student(int, String)
10      sri
constructor Student()
void Student()

*/
