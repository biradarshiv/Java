/*
THIS KEYWORD
*/


class Test69
{
  public static void main(String str[])
  {
    Hello.display();
    Hello h = new Hello();
    h.x = 45;
    h.y = 101;
    h.show();
  }
}


class Hello
{
  static int y;
  int x;
  
  void show()
  {
    String x = "jlc";
    boolean y = false;
    System.out.println(x +"\t"+ y);
    
    Hello h = new Hello();
    System.out.println(h.x +"\t"+ h.y );
    System.out.println(this.x +"\t"+ this.y);
    
    Hello h1 = this;
    System.out.println(h1.x+"\t"+h1.y);
    h1=null;
    
    final Hello h2 = new Hello();
    // h2 = null;
    // this = new Hello(); // FINAL VARIABLES CANNOT BE ASSIGNED ANY VALUES
    // this = null;
  }
  
  static void display()
  {
    String x="abc";
    char y = 'a';
    System.out.println(x+"\t"+y);
    
    //System.out.println(this.y); // INSTATNCE MEMBERS CANNOT BE ACCESSED IN STATIC BLOCK
    System.out.println(Hello.y);
    
    
  }
  
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Test69.java

E:\>java Test69
abc     a
0
jlc     false
0       101
45      101
45      101

*/







