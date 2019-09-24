/*
DYNAMIC DISPATCH
*/

abstract class Person
{
  String name;
  
  Person(String name)
  {
    this.name = name;
  }
  
  abstract void work();
  
  public String getname()
  {
    return name;
  }
  
}

class Student extends Person
{
  Student(String name)
  {
    super(name);
  }
  
  void work()
  {
    System.out.println("Studying course");
  }
  
  void currentcourse()
  {
    System.out.println(" INHERITANCE ");
  }
}

class Employee extends Person
{
  Employee(String name)
  {
    super(name);
  }
  
  void work()
  {
    System.out.println("working in a company");
  }
  
  void currentproject()
  {
    System.out.println("JLC India");
  }
}

class Test93
{
  public static void main(String str[])
  {
    showAboutPerson(new Student("Manish"));
    showAboutPerson(new Employee("Sri"));
  }
  
  static void showAboutPerson(Person p)
  {
    p.work();
    System.out.println("Name : "+ p.getname() );
    
    //p.currentcourse();
    //p.currentproject();  
    
    if(p instanceof Student)
    {
      Student st = (Student)p;
      st.currentcourse();
    }
    else if(p instanceof Employee)
    {
      Employee emp = (Employee)p;
      emp.currentproject();
    }
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test93.java

E:\>java Test93
Studying course
Name : Manish
 INHERITANCE
working in a company
Name : Sri
JLC India
*/










