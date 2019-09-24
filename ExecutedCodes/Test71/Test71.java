class Test71
{
public static void main(String str[])
{
Student st = new Student(10, "sri");
System.out.println(st.sid+"\t"+st.name);
}
}

/*
class Student
{
int sid;
String name;

Student(int sid, String name)
{
sid = sid;
name = name;
}
}

OUT PUT OF THE PROGRAM IS
E:\>javac Test71.java

E:\>java Test71
0       null

*/
/*
class Student
{
int sid;
String name;

Student(int si, String n)
{
sid = si;
name = n;
}
}

OUT PUT OF THE PROGRAM IS 
E:\>javac Test71.java

E:\>java Test71
10      sri
*/


class Student
{
int sid;
String name;

Student(int sid, String name)
{
this.sid = sid;
this.name = name;
}
}
/*
OUT PUT OF THE PROGRAM IS 
E:\>javac Test71.java

E:\>java Test71
10      sri
*/

