class Student
{
//public static void main(String str[])
//{
int sid;
String name;
final int totalmarks;

Student()
{
totalmarks = 100;
System.out.println("student default constructor");
}
//}
}

/*

1.
You cannot define student constructor in the
public static void main(String str[]) 

It has to be in the Student class only.


2.
You have define all the final values in the class.

*/