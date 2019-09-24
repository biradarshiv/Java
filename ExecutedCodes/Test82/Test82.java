class Test82 
{
  public static void main(String str[])
  {
    System.out.println("y of inner : "+ Hello.Hai.y);
    
    Hello h = new Hello();
    h.display();
    
    Hello.Hai h1 = new Hello.Hai();
    h1.show();
    
  }
}


class Hello
{
  int a = 20;
  static int b = 24;
  
  void display()
  {
    System.out.println("in display method (outer)");
    System.out.println(a);
    System.out.println(b);
    
    Hai h = new Hai();
    h.show();
    
  }
  
  static class Hai
  {
    int x = 85;
    static int y = 98;
    
    void show()
    {
      System.out.println("in show method (inner)");
      //System.out.println(a); //  non-static variable a cannot be referenced from a static context
      System.out.println(b);
      System.out.println(x);
      System.out.println(y);
      
    }
  }
  
}


/*
OUT PUT OF THE PROGRAM IS 
E:\>javac Test82.java

E:\>java Test82
y of inner : 98
in display method (outer)
20
24
in show method (inner)
24
85
98
in show method (inner)
24
85
98
*/

