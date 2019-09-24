class A{}
interface I1{ void m1(); void m3();}
interface I2{ void m2(); void m3();}

class B extends A implements I1, I2
{
  // override all abstract methods
  public void m1(){ System.out.println("1"); }
  public void m2(){ System.out.println("2"); } 
  public void m3(){ System.out.println("3"); }
}

class Test94
{
  public static void main(String str[])
  {
    B ob = new B();
    ob.m1(); ob.m2(); ob.m3();
    
    A ob2 = new B();
    //ob2.m1(); //ob2.m2(); //ob2.m3();
    
    I1 i1 = new B();
    i1.m1(); 
    //i1.m2(); 
    i1.m3();
    
    I2 i2 = new B();
    //i2.m1();
    i2.m2();
    i2.m3();
    
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test94.java

E:\>java Test94
1
2
3
1
3
2
3

*/



