class Test76
{
  public static void main(String str[])
  {
    Person p = new Person();
    System.out.println("Person object created");
    
    Student st = new Student();
    System.out.println("new Student()   object created");
    Student st1 = new Student(12);
    System.out.println("new Student(12)   object created");
  }
}

class Person
{
  static
  {
    System.out.println("* static block of person");
  }
  
  {
    System.out.println("* instance block of person");
  }
  
  Person()
  {
    System.out.println("* default person constructor");
  }
}

class Student extends Person
{
  int sid;
  static final int totalmarks;
  final int passmarks;
  
  Student()
  {
    System.out.println("** Student constructor default");
  }
  
  static
  {
    totalmarks=100;
    System.out.println("** static block B");
  }
  
  Student(int sid)
  {
    System.out.println("** Student (int sid)");
  }
  
  {
    passmarks = 98;
    System.out.println("** instance of block 1");
  }
  
  static
  {
    System.out.println("** static block A");
  }
  
  
}


/*
OUT PUT OF THE PROGRAM IS 


E:\>javac Test76.java

E:\>java Test76
* static block of person
* instance block of person
* default person constructor
Person object created
** static block B
** static block A
* instance block of person
* default person constructor
** instance of block 1
** Student constructor default
new Student()   object created
* instance block of person
* default person constructor
** instance of block 1
** Student (int sid)
new Student(12)   object created


*/























