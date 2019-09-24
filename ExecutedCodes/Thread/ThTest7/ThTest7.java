class ThTest7 
{
  public static void main(String str[])
  {
    Hello h = new Hello();
    
    AThread ath = new AThread(h);
    BThread bth = new BThread(h);
    
    ath.start();
    bth.start();
  }
}

class AThread extends Thread
{
  Hello h = null;
  AThread(Hello h)
  {
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
  BThread(Hello h)
  {
    this.h = h;
  }
  
  public void run()
  {
    h.m2();
  }
}

class Hello
{
  synchronized void m1()
  {
    for(int i=0; i<5; i++)
    {
      System.out.println("in m1"+"\t"+ i +"\t"+ this );
      try
      {
        //Thread.sleep(1000);
        wait();
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
  }
  
  synchronized void m2()
  {
    for(int i=45; i<50; i++)
    {
      System.out.println("in m2"+"\t"+ i +"\t"+ this );
      try
      {
        notify();
        wait(1000);
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
  }
}





/*
OUT PUT OF THE PROGRAM IS 

E:\>java ThTest7
in m1   0       Hello@130c19b
in m2   45      Hello@130c19b
in m1   1       Hello@130c19b
in m2   46      Hello@130c19b
in m1   2       Hello@130c19b
in m2   47      Hello@130c19b
in m1   3       Hello@130c19b
in m2   48      Hello@130c19b
in m1   4       Hello@130c19b
in m2   49      Hello@130c19b

*/

