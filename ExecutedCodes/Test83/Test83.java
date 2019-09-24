/*
Local Inner Class
*/

class Test83 
{
  public static void main(String str[])
  {
    Hello h = new Hello();
    h.show();
    
    h.x = 56;
    System.out.println("after modifying the x value");
    h.show();
  }
}

class Hello
{
  int x = 10;
  static int y = 20;
  void show()
  {
    final int ab = 12;
    int mn = 67;
    int xy = 23;
    
    // Hai h = new Hai();
    
    class Hai
    {
      void display()
      {
        System.out.println(x);
        System.out.println(y);
        System.out.println(ab);
        //System.out.println(mn); //Test83.java:37: local variable mn is accessed from within inner class; needs to be declared final
      }
    }
    
    Hai h1 = new Hai();
    h1.display();
    // ab = 89;
    //h1.display();
  }
  
  void m1()
  {
    //Hai h = new hai(); // cannot access the class defined in another method
  }
}




/*
OUT PUT OF THE PROGRAM IS 
E:\>javac Test83.java

E:\>java Test83
10
20
12
after modifying the x value
56
20
12
*/