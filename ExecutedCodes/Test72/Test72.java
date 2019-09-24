class Test72
{
  public static void main(String str[])
  {
    Student st = new Student(10,"sri");
    System.out.println(st.sid+"\t"+st.name);
  }
}

class Student
{
int sid;
String name;

Student(int sid)
{
  this.sid=sid;
  System.out.println("Student(int)");
}

Student(int sid, String name)
{
  this(sid);
  // Student(sid);  // Method
  this.name = name;
  // this(sid);  // must be the first statement
  System.out.println("Student(int , String)");
}
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test72.java

E:\>java Test72
Student(int)
Student(int , String)
10      sri

*/