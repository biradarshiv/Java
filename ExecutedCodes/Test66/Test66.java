/*
CALLING THE METHOD BY PASSING SOME VALUES
*/

class Test66 
{
  public static void main(String str[])
  {
    Change ch = new Change();
    Hello h = new Hello();
    System.out.println("** in main Method");
    System.out.println("Before Calling : "+ h.x);
    ch.changeValue(h.x);
    System.out.println("After Calling : " + h.x);
    
    System.out.println("in main Method 2");
    System.out.println("Before Calling: "+h.x);
    ch.changeValue(h);
    System.out.println("After Calling: "+h.x);
  }
}


class Change
{
  void changeValue(Hello h)
  {
    System.out.println("*** in changeValue(Hello) method");
    System.out.println("Before changing the value: " +h.x);
    h.x = h.x+20;
    System.out.println("After changing the value: "+h.x);
    h=new Hello();
    h.x=84;
    System.out.println("After changing the reference "+h.x);
    h=null;
  }
  
  void changeValue(int x)
  {
    System.out.println("*** in chagneValue(int) method");
    System.out.println("Before changing the value: " +x);
    x=x+10;
    System.out.println("After changing the value: " +x);
  }
}

class Hello
{
  int x=12;
}





/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test66.java

E:\>java Test66
** in main Method
Before Calling : 12
*** in chagneValue(int) method
Before changing the value: 12
After changing the value: 22
After Calling : 12
in main Method 2
Before Calling: 12
*** in changeValue(Hello) method
Before changing the value: 12
After changing the value: 32
After changing the reference 84
After Calling: 32

*?