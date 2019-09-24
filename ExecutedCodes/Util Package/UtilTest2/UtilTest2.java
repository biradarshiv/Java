import java.util.*;

class UtilTest2
{
  public static void main(String str[])
  {
    List l = new ArrayList();
    l.add("Sri1");
    l.add("Sri2");
    l.add("Sri3");
    l.add("Sri4");
    l.add("4");
    l.add("1");
    l.add("2");
    l.add("3");
    
    // Add String object in list
    
    Collections.sort(l, new StringDescComp() );  // IMP  
    
    Iterator it = l.iterator();
    while(it.hasNext())
    {
      System.out.println(it.next());
    }
  }
}

class StringDescComp implements Comparator
{
  public int compare(Object obj1, Object obj2)
  {
    String st1 = (String)obj1;
    String st2 = obj2.toString();
    return st2.compareTo(st1);
  }
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac UtilTest2.java
Note: UtilTest2.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java UtilTest2
Sri4
Sri3
Sri2
Sri1
4
3
2
1

*/


