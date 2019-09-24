class Test74
{
  public static void main(String str[])
  {
    Student st2 = new Student();
  }
}


class Student
{
int sid;
String name;

void Student()
{
System.out.println(" void Student() ie. method not a default constructor ");
}
}



/*
OUT PUT OF THE PROGRAM IS 

nothing will be displayed since void Student isn't any default constructor.
since it is method.

*/