class ThTest8
{
  public static void main(String str[])
  {
    ThreadGroup tg1 = new ThreadGroup("MyThreadGroup1");
    ThreadGroup tg2 = new ThreadGroup("MyThreadGroup2");
    
    AThread ath = new AThread(tg1, "");
    ath.setName("EJB");
    AThread ath1 = new AThread(tg2, "JDBC");
    //ath1.setPriority(6);
    BThread bth = new BThread("JSP");
    BThread bth1 = new BThread("XML");
    CThread cth = new CThread("CTH1");
    
    bth1.setPriority(3);
    ath1.setPriority(9);
    bth.setPriority(8);
    ath.setPriority(2);
    
    bth1.start();
    bth.start();
    ath.start();
    ath1.start();
    
  }
}

class AThread extends Thread
{
  AThread(ThreadGroup tg, String name)
  {
    super(tg, name);
  }
  
  public void run()
  {
    for(int i=0; i<5; i++)
    {
      System.out.println("in AThread "+"\t"+ i +"\t"+ getName() +"\t"+  getPriority() +"\t"+ getThreadGroup().getName() );
      if(i ==3)
      {
        setName("Java");
      }
    }
  }
}

class BThread extends Thread
{
  BThread(String name)
  {
    super(name);
  }
  
  public void run()
  {
    for(int i=10; i<15; i++)
    {
      System.out.println("in BThread "+"\t"+ i +"\t"+ getName() +"\t"+  getPriority() +"\t"+ getThreadGroup().getName() );
    }
  }
}

class CThread implements Runnable
{
  CThread(String name)
  {
    Thread th = new Thread(this, name);
    th.start();
  }
  
  public void run()
  {
    Thread th = Thread.currentThread();
    for(int i=20; i<25; i++)
    {
      System.out.println("in CThread "+"\t"+ i +"\t"+ th.getName() +"\t"+  th.getPriority() +"\t"+ th.getThreadGroup().getName() );
    }
  }
}

class Hello
{
  void m1()
  {
    Thread th = Thread.currentThread();
    for(int i=0; i<5; i++)
    {
      System.out.println("in m1"+"\t"+ i +"\t"+ th.getName() +"\t"+ this );
    }
  }
  
  void m2()
  {
    Thread th = Thread.currentThread();
    for(int i=45; i<50; i++)
    {
      System.out.println("in m2"+"\t"+ i +"\t"+ th.getName() +"\t"+ this );
    }
  }
}



/*
OUT PUT OF THE PROGRAM IS 

E:\>javac ThTest8.java

E:\>java ThTest8
in BThread      20      CTH1    5       main
in AThread      0       JDBC    9       MyThreadGroup2
in BThread      10      JSP     8       main
in BThread      10      XML     3       main
in AThread      0       EJB     2       MyThreadGroup1
in BThread      21      CTH1    5       main
in AThread      1       JDBC    9       MyThreadGroup2
in BThread      11      JSP     8       main
in BThread      11      XML     3       main
in AThread      1       EJB     2       MyThreadGroup1
in BThread      22      CTH1    5       main
in AThread      2       JDBC    9       MyThreadGroup2
in BThread      12      JSP     8       main
in BThread      12      XML     3       main
in AThread      2       EJB     2       MyThreadGroup1
in BThread      23      CTH1    5       main
in AThread      3       JDBC    9       MyThreadGroup2
in BThread      13      JSP     8       main
in BThread      13      XML     3       main
in AThread      3       EJB     2       MyThreadGroup1
in BThread      24      CTH1    5       main
in AThread      4       Java    9       MyThreadGroup2
in BThread      14      JSP     8       main
in BThread      14      XML     3       main
in AThread      4       Java    2       MyThreadGroup1


*/

