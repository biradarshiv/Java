/*
Local Variable
*/

class Test68 
{
  public static void main(String str[])
  {
    Hello h = new Hello();
    h.x = 12;
    h.show();
    
    Hello h1 = new Hello();
    h1.x = 48;
    h1.show();
    
  }
}

class Hello 
{
  int x;
  void show()
  {
    String x = "JLC";
    System.out.println(x);
    
    Hello h = new Hello();
    System.out.println(h.x);
    System.out.println(this.x);
  }
}



/*
OUT PUT OF THE PROGRAM IS

E:\>javac Test68.java

E:\>java Test68
JLC
0
12
JLC
0
48

*/