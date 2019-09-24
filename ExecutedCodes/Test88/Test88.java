import java.io.*;
import java.sql.*;


class Hello 
{
  void m1(){}
  void m2(){}
  void m3(int s, String st){}
  void m4(String str){}
  void m5(){}
  void m6(){}
  void m7(){}
  static void m8(){}
  private void m9(){}
  static void m10(){}
  final int m11(){ return 0;}
  void m12(){}
  void m13(){}
  void m14()throws IOException{}
  void m15()throws IOException{}
  void m16()throws IOException{}
  void m17()throws IOException{}
  void m18()throws ArrayIndexOutOfBoundsException {}
}

class Hai extends Hello
{
  void m1(){}
  void m2(int a ){}
  void m3(int c, String abc){}
  //void m4(String str){ return 0; } // cannot return a value from method whose result type is void
  //private void m5(){} // Test88.java:33: m5() in Hai cannot override m5() in Hello; attempting to assign weaker access privileges; was package
  protected void m6(){}
  //static void m7(){} // Test88.java:35: m7() in Hai cannot override m7() in Hello; overriding method is static
  //void m8(){} // Test88.java:36: m8() in Hai cannot override m8() in Hello; overridden method is static
  void m9(){}
  static void m10(){}
  //final int m11(){ return 12;} //  m11() in Hai cannot override m11() in Hello; overridden method is final
  void m12()throws NullPointerException, ArithmeticException{}
  //void m13()throws ClassNotFoundException{}//m13() in Hai cannot override m13() in Hello; overridden method does not throw //java.lang.ClassNotFoundException
  
 // CHECKED HAS TO BE THROWN IN SUPERCLASS, UNCHECKED NEED NOT BE THROWN FORM THE SUPER CLASS (IMP)
 
  void m14(){}
  void m15()throws IOException, ArithmeticException{}
  void m16()throws FileNotFoundException{}
  //void m17()throws SQLException{} // Test88.java:48: m17() in Hai cannot override m17() in Hello; overridden method does not throw //java.sql.SQLException
  void m18()throws IndexOutOfBoundsException {}
}


