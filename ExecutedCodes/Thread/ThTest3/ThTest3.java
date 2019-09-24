class ThTest3 
{
  public static void main(String str[])
  {
    MyThread mth = new MyThread();
    mth.start();  // you have to start it to call the run method. otherwise the run method will not be called.
    
    MyThread mth2 = new MyThread();
    mth2.start();
  }
}

class MyThread extends Thread
{
  public void run()
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

E:\>javac ThTest3.java

E:\>java ThTest3
show : 0        Thread-0        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 0        Thread-1        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 1        Thread-0        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 1        Thread-1        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 2        Thread-0        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 2        Thread-1        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 3        Thread-0        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 3        Thread-1        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 4        Thread-0        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 4        Thread-1        java.lang.ThreadGroup[name=main,maxpri=10]  5

*/
