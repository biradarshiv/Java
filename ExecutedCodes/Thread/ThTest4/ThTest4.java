class AThread implements Runnable
{
  public void run()
  {
    Hello h = new Hello();
    h.show();
  }
}

class BThread implements Runnable
{
  public void run()
  {
    Hello h = new Hello();
    h.show();
  }
  BThread()
  {
    Thread th = new Thread(this);
    th.start();
  }
}

class CThread implements Runnable
{
  public void run()
  {
    Hello h = new Hello();
    h.show();
  }
  Thread th = null;
  CThread()
  {
    th = new Thread(this);
  }
  public void start()
  {
    th.start();
  }
}

class ThTest4
{
  public static void main(String str[])
  {
    AThread ath = new AThread();
    Thread th = new Thread(ath);
    th.start();
    
    BThread bth = new BThread();
    
    CThread cth = new CThread();
    cth.start();
    
    Runnable run = new Runnable()
    {
      public void run()
      {
        //System.out.println("inside run method");
        Hello h = new Hello();
        h.show();
      }
    };
    
    Thread th2 = new Thread(run);
    th2.start();
    
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

E:\>javac ThTest4.java

E:\>java ThTest4
show : 0        Thread-1        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 0        Thread-0        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 0        Thread-2        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 0        Thread-3        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 1        Thread-1        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 1        Thread-0        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 1        Thread-2        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 1        Thread-3        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 2        Thread-1        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 2        Thread-0        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 2        Thread-2        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 2        Thread-3        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 3        Thread-1        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 3        Thread-0        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 3        Thread-2        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 3        Thread-3        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 4        Thread-1        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 4        Thread-0        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 4        Thread-2        java.lang.ThreadGroup[name=main,maxpri=10]  5
show : 4        Thread-3        java.lang.ThreadGroup[name=main,maxpri=10]  5


*/