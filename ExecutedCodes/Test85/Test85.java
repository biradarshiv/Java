/*
INHERITANCE EXAMPLE for private type
*/

class Test85 
{
  public static void main(String str[])
  {
    Hai h = new Hai();
    //System.out.println(h.x); //  x has private access in Hello
    System.out.println(h.y);
    
    //h.show();   //Test85.java:13: cannot find symbol
                  //symbol  : method show()
                  //location: class Hai
                  //h.show();
                  // ^
    h.display();
    
  }
}


class Hello
{
  private int x = 10;
  int y = 20;
  
  private void show()
  {
    System.out.println("show in hello");
  }
  
  void display()
  {
    System.out.println("display in hello");
  }
}

class Hai extends Hello
{
  void m1()
  {
    //System.out.println(x); //  x has private access in Hello
    System.out.println(y);
  }
}