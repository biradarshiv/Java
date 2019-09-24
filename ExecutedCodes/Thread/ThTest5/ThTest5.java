class AThread extends Thread
{  
  public void run()
  {
    for(int i = 0 ; i< 5 ;i++ )
    {
      System.out.println(i);
      
      try
      {
        sleep(1000);
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
  }
}

class ThTest5
{
  public static void main(String str[])
  {
    AThread ath = new AThread();
    AThread ath2 = new AThread();
    
    ath.start();
    ath2.start();
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac ThTest5.java

E:\>java ThTest5
0
0
1
1
2
2
3
3
4
4


*/
