class Test76_1
{
  public static void main(String str[])
  {
    //Person p = new Person();   // comment this to understand the flow better
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
Person object created
* static block of person        // static block of super class
** static block B               // static block of current class
** static block A               // static block of current class
* instance block of person      // instance block of super class
* default person constructor    // DEFAULT CONSTRUCTOR of super class
** instance of block 1          // instance block of current class
** Student constructor default  // DEFAULT CONSTRUCTOR of current class
new Student()   object created

* instance block of person      // all static blocks were created hence starting with the instance blocks// instance block of super class
* default person constructor    // DEFAULT CONSTRUCTOR of super class
** instance of block 1          // instance block of current class
** Student (int sid)            // PARAMETERIZED CONSTRUCTOR of current class
new Student(12)   object created
*/























