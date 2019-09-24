class A
{
  void show()
  {
    System.out.println("show of A");
  }
  static void display()
  {
    System.out.println("static display of A");
  }
}

class B extends A
{
  void show()
  {
    System.out.println("show of B");
  }
  static void display()
  {
    System.out.println("static display of B");
  }
}


class Test95 
{
  public static void main(String str[])
  {
    A ob = new A();
    ob.show();
    ob.display();
    
    B ob1 = new B();
    ob1.show();
    ob1.display();
    
    A ob2 = new B();
    ob2.show();
    ob2.display();
    
    
  }
}

/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test95.java

E:\>java Test95
show of A
static display of A
show of B
static display of B
show of B
static display of A

*/
