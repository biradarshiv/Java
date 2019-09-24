class ThTest6 
{
  public static void main(String str[])
  {
    Hello h = new Hello();
    // Hello h2 = h;
    Hello h2 = new Hello();
    
    AThread ath1 = new AThread(h, "ATH_1");
    AThread ath2 = new AThread(h2, "ATH_2");
    BThread bth1 = new BThread(h, "BTH_1");
    BThread bth2 = new BThread(h2, "BTH_2");
    
    ath1.start();
    ath2.start();
    bth1.start();
    bth2.start();
  }
}

class AThread extends Thread
{
  Hello h = null;
  AThread(Hello h, String name)
  {
    super(name);
    this.h = h;
  }
  
  public void run()
  {
    h.m1();
  }
}

class BThread extends Thread
{
  Hello h = null;
  BThread(Hello h, String name)
  {
    super(name);
    this.h = h;
  }
  
  public void run()
  {
    h.m2();
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

E:\>javac ThTest7.java

E:\>java ThTest7
in m1   0       ATH_1   Hello@130c19b
in m2   45      BTH_2   Hello@1f6a7b9
in m2   45      BTH_1   Hello@130c19b
in m1   0       ATH_2   Hello@1f6a7b9
in m1   1       ATH_1   Hello@130c19b
in m2   46      BTH_2   Hello@1f6a7b9
in m2   46      BTH_1   Hello@130c19b
in m1   1       ATH_2   Hello@1f6a7b9
in m1   2       ATH_1   Hello@130c19b
in m2   47      BTH_2   Hello@1f6a7b9
in m2   47      BTH_1   Hello@130c19b
in m1   2       ATH_2   Hello@1f6a7b9
in m1   3       ATH_1   Hello@130c19b
in m2   48      BTH_2   Hello@1f6a7b9
in m2   48      BTH_1   Hello@130c19b
in m1   3       ATH_2   Hello@1f6a7b9
in m1   4       ATH_1   Hello@130c19b
in m2   49      BTH_2   Hello@1f6a7b9
in m2   49      BTH_1   Hello@130c19b
in m1   4       ATH_2   Hello@1f6a7b9


E:\>java ThTest7
in m1   0       ATH_1   Hello@130c19b
in m1   0       ATH_2   Hello@1f6a7b9
in m2   45      BTH_2   Hello@1f6a7b9
in m2   45      BTH_1   Hello@130c19b
in m1   1       ATH_1   Hello@130c19b
in m1   1       ATH_2   Hello@1f6a7b9
in m2   46      BTH_2   Hello@1f6a7b9
in m2   46      BTH_1   Hello@130c19b
in m1   2       ATH_1   Hello@130c19b
in m1   2       ATH_2   Hello@1f6a7b9
in m2   47      BTH_2   Hello@1f6a7b9
in m2   47      BTH_1   Hello@130c19b
in m1   3       ATH_1   Hello@130c19b
in m1   3       ATH_2   Hello@1f6a7b9
in m2   48      BTH_2   Hello@1f6a7b9
in m2   48      BTH_1   Hello@130c19b
in m1   4       ATH_1   Hello@130c19b
in m1   4       ATH_2   Hello@1f6a7b9
in m2   49      BTH_2   Hello@1f6a7b9
in m2   49      BTH_1   Hello@130c19b


E:\>java ThTest7
in m2   45      BTH_2   Hello@130c19b
in m1   0       ATH_1   Hello@1f6a7b9
in m2   45      BTH_1   Hello@1f6a7b9
in m1   0       ATH_2   Hello@130c19b
in m2   46      BTH_2   Hello@130c19b
in m1   1       ATH_1   Hello@1f6a7b9
in m2   46      BTH_1   Hello@1f6a7b9
in m1   1       ATH_2   Hello@130c19b
in m2   47      BTH_2   Hello@130c19b
in m1   2       ATH_1   Hello@1f6a7b9
in m2   47      BTH_1   Hello@1f6a7b9
in m1   2       ATH_2   Hello@130c19b
in m2   48      BTH_2   Hello@130c19b
in m1   3       ATH_1   Hello@1f6a7b9
in m2   48      BTH_1   Hello@1f6a7b9
in m1   3       ATH_2   Hello@130c19b
in m2   49      BTH_2   Hello@130c19b
in m1   4       ATH_1   Hello@1f6a7b9
in m2   49      BTH_1   Hello@1f6a7b9
in m1   4       ATH_2   Hello@130c19b

E:\>java ThTest7
in m1   0       ATH_2   Hello@1f6a7b9
in m2   45      BTH_2   Hello@1f6a7b9
in m1   0       ATH_1   Hello@130c19b
in m2   45      BTH_1   Hello@130c19b
in m1   1       ATH_2   Hello@1f6a7b9
in m2   46      BTH_2   Hello@1f6a7b9
in m1   1       ATH_1   Hello@130c19b
in m2   46      BTH_1   Hello@130c19b
in m1   2       ATH_2   Hello@1f6a7b9
in m2   47      BTH_2   Hello@1f6a7b9
in m1   2       ATH_1   Hello@130c19b
in m2   47      BTH_1   Hello@130c19b
in m1   3       ATH_2   Hello@1f6a7b9
in m2   48      BTH_2   Hello@1f6a7b9
in m1   3       ATH_1   Hello@130c19b
in m2   48      BTH_1   Hello@130c19b
in m1   4       ATH_2   Hello@1f6a7b9
in m2   49      BTH_2   Hello@1f6a7b9
in m1   4       ATH_1   Hello@130c19b
in m2   49      BTH_1   Hello@130c19b



*/

