// Demonstrate HashSet.
import java.util.*;
class HashSetDemo 
{
public static void main(String args[]) 
{
// create a hash set
HashSet hs = new HashSet();
// add elements to the hash set
hs.add("B");
hs.add("A");
hs.add("D");
hs.add("E");
hs.add("C");
hs.add("F");

System.out.println(hs);
}
}



/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book4.java
Note: Book4.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java HashSetDemo
[D, A, F, C, B, E]


*/
