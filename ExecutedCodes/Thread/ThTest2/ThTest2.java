class ThTest2
{
  public static void main(String str[])
  {
    Hello h = new Hello();
    h.show();
  }
}

class Hello
{
  void show()
  {
    Thread th = Thread.currentThread();
    for(int i = 0; i<5; i++)
    {
      System.out.println("show : " +i +"\t"+ th.getName()  +"\t"+ th.getThreadGroup()  +"\t" + th.getPriority() );
    }
  }
}

/*
OUT PUT OF THE PROGRAM IS 

E:\>javac ThTest2.java

E:\>java ThTest2
show : 0        main    java.lang.ThreadGroup[name=main,maxpri=10]      5
show : 1        main    java.lang.ThreadGroup[name=main,maxpri=10]      5
show : 2        main    java.lang.ThreadGroup[name=main,maxpri=10]      5
show : 3        main    java.lang.ThreadGroup[name=main,maxpri=10]      5
show : 4        main    java.lang.ThreadGroup[name=main,maxpri=10]      5


*/
