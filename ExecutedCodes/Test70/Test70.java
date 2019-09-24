/*
  Using Super Key word
*/


class Test70 
{
  public static void main(String str[])
  {
    new Hello().show();
    new Hello().display();
  }
}

class B
{
  float x = 12.02f;
  int y = 23;
}
class A extends B 
{
  int x  = 12;
}
class Hello extends A 
{
  String x= "ab";
  
  void show() 
  {
    boolean x = false;
    System.out.println(x);
    System.out.println(this.x);
    System.out.println(this.y);
    
    System.out.println(y);
    
     //System.out.println(super.super.x);
     //A ob = super;
     //super = null;
  }
  
  void display()
  {
    System.out.println(super.x);
  }
}



/*
OUT PUT OF THE PROGRAM IS

E:\>javac Test70.java

E:\>java Test70
false
ab
23
23
12


*/














