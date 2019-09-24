package com.jlc;

public class Hello
{
  private int a = 12;
  int b = 22;
  protected int c = 32;
  public int d = 42;
  
  void show()
  {
    System.out.println("within same class without Object");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    
    System.out.println("within same class with Object");
    Hello h = new Hello();
    System.out.println(h.a);
    System.out.println(h.b);
    System.out.println(h.c);
    System.out.println(h.d);
  }
}

class Hai extends Hello
{
  void display()
  {
    System.out.println("in sub class within same package            class without object");
    // System.out.println(a); //a has private access in com.jlc.Hello
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    
    System.out.println("in sub class within same package             with super object");
    Hello h = new Hello();
    //System.out.println(h.a); // a has private access in com.jlc.Hello
    System.out.println(h.b);
    System.out.println(h.c);
    System.out.println(h.d);
    
    System.out.println("in sub class within same package             with current object");
    Hai h1 = new Hai();
    //System.out.println(h1.a);//a has private access in com.jlc.Hello
    System.out.println(h1.b);
    System.out.println(h1.c);
    System.out.println(h1.d);
    
  }
}

class Test86
{
  public static void main(String str[])
  {
    Hello h = new Hello();
    h.show();
    Hai h1 = new Hai();
    h1.display();
    
    System.out.println("in non sub class within same pack ");
    //System.out.println(h.a);//a has private access in com.jlc.Hello
    System.out.println(h.b);
    System.out.println(h.c);
    System.out.println(h.d);
  }
}

/*
OUT PUT OF THE PROGRAM IS 

E:\>javac -d . Hello.java

E:\>java com.jlc.Test86
within same class without Object
12
22
32
42
within same class with Object
12
22
32
42
in sub class within same package            class without object
22
32
42
in sub class within same package             with super object
22
32
42
in sub class within same package             with current object
22
32
42
in non sub class within same pack
22
32
42

*/
