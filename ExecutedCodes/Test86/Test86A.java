package com.sd;
import com.jlc.*;

class Test86A
{
  public static void main(String str[])
  {
    Hello h = new Hello();
    System.out.println("in non subclass in another package");
    //System.out.println(h.a); // a has private access in com.jlc.Hello
    //System.out.println(h.b);// b is not public in com.jlc.Hello; cannot be accessed from outside package
    //System.out.println(h.c);// c has protected access in com.jlc.Hello
    System.out.println(h.d);    
    
    Abc ob = new Abc();
    ob.display();
  }
}


class Abc extends Hello
{
  void display()
  {
    System.out.println("in subclass in another package without Object");
    //System.out.println(a);// a has private access in com.jlc.Hello
    //System.out.println(b);// b is not public in com.jlc.Hello; cannot be accessed from outside package
    System.out.println(c); // SINCE Abc EXTENDS Hello HENCE C CAN BE ACCESSED DIRECTLY 
    System.out.println(d);
    
    Hello  h = new Hello();
    System.out.println("in subclass in another package super Object");
    //System.out.println(h.a);// a has private access in com.jlc.Hello
    //System.out.println(h.b);// b is not public in com.jlc.Hello; cannot be accessed from outside package
    //System.out.println(h.c);// c has protected access in com.jlc.Hello // SINCE YOU ARE CREATING A NEW OBJECT WHICH DOES NOT EXTEND Hello, HENCE ERROR
                              // IF YOU EXTEND IT IS ACCESSIBLE, IF YOU CRATE OBJECT IT IS NOT ACCESSIBLE.
    System.out.println(h.d);
    
    Abc ob = new Abc();
    System.out.println("in subclass in another package super Object");
    //System.out.println(ob.a);// a has private access in com.jlc.Hello
    //System.out.println(ob.b);// b is not public in com.jlc.Hello; cannot be accessed from outside package
    System.out.println(ob.c);
    System.out.println(ob.d);    
  }
}

/*
OUT PUT OF THE PROGRAM IS 
E:\>javac -d . Test86A.java

E:\>java com.sd.Test86A
in non subclass in another package
42
in subclass in another package without Object
32
42
in subclass in another package super Object
42
in subclass in another package super Object
32
42

*/
