class Test87
{
  public static void main(String str[])
  {
    Hai h = new Hai();
    h.show();
    h.display();
    h.show1();
    h.display1();
  }
}


class Hello
{
  void show()
  {
    System.out.println("show in hello class");
  }
  
  void display()
  {
    System.out.println("display in hello class");
  }
  
  void show1()
  {
    System.out.println("show1 in hello class");
  }
  
  void display1()
  {
    System.out.println("display in hello class");
  }
}

class Hai extends Hello
{
  void display()
  {
    System.out.println("display in subclass");
  }
  
  void show1()
  {
    System.out.println("show1 in subclass before super.implementation");
    super.show1();
    System.out.println("show1 in subclass after super.implementation");
  }
  
  void display1()
  {
    super.display1();
  }
}

/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test87.java

E:\>java Test87
show in hello class
display in subclass
show1 in subclass before super.implementation
show1 in hello class
show1 in subclass after super.implementation
display in hello class

*/

