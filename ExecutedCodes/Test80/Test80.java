class Test80
{
  public static void main(String str[])
  {
    Hello h = new Hello(12);
    h.show();
    
    //Hai h1 = new Hai();  // cannot create an instance of inner class directly
    
    System.out.println("out of outer class");
    Hello.Hai h1 = null;
    h1 = h.new Hai(200);
    h1.display();
    
    Hello.Hai h2 = new Hello(10).new Hai(20);
    h2.display();
    
  }
}


class Hello
{
  int a;
  static int b = 22;
  
  Hello(int a)
  {
    this.a = a;
  }
  
  void show()
  {
    System.out.println("show of Hello(Outer Class) ");
    Hai h = new Hai(100);
    h.display();
  }
  
  class Hai
  {
    Hai(int x)
    {
      this.x = x;
    }
    int x = 55;
    // static int y = 65; // cannot define any static inside instance inner class
    void display()
    {
      System.out.println("displayt of hai (inner class)");
      System.out.println(a);
      System.out.println(b);
      System.out.println(x);
    }
    
  }
  
}




/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test80.java

E:\>java Test80
show of Hello(Outer Class)
displayt of hai (inner class)
12
22
100
out of outer class
displayt of hai (inner class)
12
22
200
displayt of hai (inner class)
10
22
20


*/