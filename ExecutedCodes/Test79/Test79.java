class Test79
{
  public static void main(String str[]) throws Exception
  {
    Class cl1 = Class.forName("Hello");
    System.in.read();
    Class cl2 = Class.forName("Hello");
    System.out.println(cl1 == cl2);
    
    Hello h =new Hello();
    h.show();
  }
}

class Hello
{
  Hello()
  {
    System.out.println("Default constructor of Hello class");
  }
  
  static
  {
    System.out.println("static of Hello");
  }
  
  void show()
  {
    System.out.println(" show method of Hello Class");
  }
}

/*
OUT PUT OF THE PROGRAM IS 
E:\>javac Test79.java

E:\>java Test79
static of Hello

true
Default constructor of Hello class
 show method of Hello Class
*/