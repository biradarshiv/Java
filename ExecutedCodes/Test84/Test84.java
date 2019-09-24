/*
OUT PUT OF THE PROGRAM IS 
ANONYMOUS INNER CLASS
*/


class Test84 
{
  public static void main(String str[])
  {
    Hello h = new Hello(){};
    h.show();
    // Test84.1 t=null;
    // Test84$1 t1=null;
    System.out.println(h);
    System.out.println(h instanceof Hello);
    
    Hello h1 = new Hello(){};
    h1.show();
    System.out.println(h1);
    
    Hello h2 = new Hello()
    {
      void show()
      {
        System.out.println("Show in anonymous class");
        display();
      }
      
      void display()
      {
        System.out.println("Display in anonymous class");
      }
    };
    h2.show();
    //h2.display();// we can write this only if the 1. code is written
  }
}

class Hello
{
  static Hello h = new Hello(){};
  
  void show()
  {
    System.out.println("show of Hello");
    Hello h1 = new Hello(){};
    
    System.out.println(h);
    System.out.println(h1);
  }
  
  /* 1. 
  void display()
  {
  System.out.println("Display in Hello class");
  }
  */
  
}

/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test84.java

E:\>java Test84
show of Hello
Hello$1@11b86e7
Hello$2@35ce36
Test84$1@757aef
true
show of Hello
Hello$1@11b86e7
Hello$2@d9f9c3
Test84$2@9cab16
Show in anonymous class
Display in anonymous class

*/
