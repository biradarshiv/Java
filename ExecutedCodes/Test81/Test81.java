class Test81 
{
  public static void main(String str[])
  {
    Hello.Hai h2 = new Hello().new Hai();
    h2.display();
  }
}

class A
{
  int a = 21;
}
class Hello extends A
{
  int a = 32;
  
class B
{
  int a = 43;
}
class Hai extends B
{
  int a=65;
void display()
{ 
  int a=54;
  System.out.println("a:"+a);
  System.out.println("this.a:"+this.a);
  System.out.println("super.a:"+super.a);
  System.out.println("Hello.this.a:"+Hello.this.a);
  System.out.println("Hello.super.a:"+Hello.super.a);
}
}
}

/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test81.java

E:\>java Test81
a:54
this.a:65
super.a:43
Hello.this.a:32
Hello.super.a:21

*/





