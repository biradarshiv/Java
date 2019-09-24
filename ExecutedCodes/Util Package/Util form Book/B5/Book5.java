// Demonstrate TreeSet.
import java.util.*;
class TreeSetDemo 
{
public static void main(String args[]) 
{
// Create a tree set
TreeSet ts = new TreeSet();
// Add elements to the tree set
ts.add("C");
ts.add("A");
ts.add("B");
ts.add("E");
ts.add("F");
ts.add("D");
System.out.println(ts);
}
}



/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book5.java
Note: Book5.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java TreeSetDemo
[A, B, C, D, E, F]

*/
