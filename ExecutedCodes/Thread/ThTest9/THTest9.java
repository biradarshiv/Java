class ThTest9
{
  public static void main(String str[])
  {
    Hello h = new Hello();
    AThread ath = new AThread(h,10);
    BThread bth = new BThread(h,25);
    
    bth.setDaemon(true);
    ath.start();
    bth.start();    
    
    
  }
}

class AThread extends Thread
{
  Hello h = null;
  int n;
  AThread(Hello h , int n)
  {
    this.h = h;
    this.n = n;
  }
  
  public void run()
  {
    for(int i=0; i<n; i++)
    {
      System.out.println("in AThread "+"gettting value" +"\t"+ (i+1) +"\t" + isDaemon() );
      
      try
      {
        Thread.sleep(200);
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
  }
}

class BThread extends Thread
{
  Hello h = null;
  int n;
  BThread(Hello h , int n)
  {
    this.h = h;
    this.n = n;
  }
  
  public void run()
  {
    for(int i=0; i<n; i++)
    {
      h.setx(i+1);
      System.out.println("in BThread "+"stored value is"+"\t"+ (i+1) +"\t" + isDaemon() );
      
      try
      {
        Thread.sleep(200);
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
  }
}



class Hello
{
  private int x;
  
  void setx(int x)
  {
    this.x = x;
  }
  
  int getx()
  {
    return this.x;
  }
}



/*
OUT PUT OF THE PROGRAM IS 

E:\>javac ThTest9.java

E:\>java ThTest9
in AThread gettting value       1       false
in BThread stored value is      1       true
in BThread stored value is      2       true
in AThread gettting value       2       false
in AThread gettting value       3       false
in BThread stored value is      3       true
in BThread stored value is      4       true
in AThread gettting value       4       false
in AThread gettting value       5       false
in BThread stored value is      5       true
in BThread stored value is      6       true
in AThread gettting value       6       false
in BThread stored value is      7       true
in AThread gettting value       7       false
in AThread gettting value       8       false
in BThread stored value is      8       true
in AThread gettting value       9       false
in BThread stored value is      9       true
in AThread gettting value       10      false
in BThread stored value is      10      true
in BThread stored value is      11      true

*/

