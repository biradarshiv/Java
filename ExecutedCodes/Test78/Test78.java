class Test78
{
  static
  {
    System.out.println(" static of Test78");
  }
}

class Test78A
{
  public static void main(String str[])
  {
    int st = Student.passmarks;
  }
}
/*
OUT PUT OF THE PROGRAM IS 
E:\>java Test78A
 static of Student
*/

class Test78B
{
  public static void main(String str[])
  {
    Student st = null; // class will not be loaded
    System.out.println(" Reference Defined");
    int x = st.passmarks;
  }
}
/*
OUT PUT OF THE PROGRAM IS 
E:\>java Test78B
 Reference Defined
 static of Student
*/

class Test78C
{
  public static void main(String str[])
  {
    new Student();
  }
}

/*
OUT PUT OF THE PROGRAM IS 
E:\>java Test78C
 static of Student
 */

class Test78D
{
  public static void main(String str[]) throws Exception
  {
    Class.forName(str[0]);
  }
}
/*
OUT PUT OF THE PROGRAM IS 
E:\>java Test78D Student
 static of Student

E:\>java Test78D OldStudent
 static of Student
 static of Old Student
*/

class Test78E
{
  public static void main(String str[])
  {
    new OldStudent();
  }
}
/*
OUT PUT OF THE PROGRAM IS 
E:\>java Test78E
 static of Student
 static of Old Student
 */


class Test78F
{
  public static void main(String str[]) throws Exception
  {
    ClassLoader cl = Test78F.class.getClassLoader();
    Class cls = cl.loadClass(str[0]);
    System.out.println(cls.getName());
  }
}
/*
OUT PUT OF THE PROGRAM IS 
E:\>javac Test78.java

E:\>java Test78F Student
Student

E:\>java Test78F OldStudent
OldStudent
 */








class Student
{
  static int passmarks = 85;
  
  static
  {
    System.out.println(" static of Student");
  }
}

class OldStudent extends Student
{
  static
  {
    System.out.println(" static of Old Student");
  }
}



