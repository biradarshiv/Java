// Demonstrate ArrayList.
import java.util.*;
class ArrayListDemo 
{
public static void main(String args[]) 
{
// create an array list
ArrayList al = new ArrayList();
System.out.println("Initial size of al: " + al.size());
// add elements to the array list
al.add("C");
al.add("A");
al.add("E");
al.add("B");
al.add("D");
al.add("F");
al.add(1, "A2");
System.out.println("Size of al after additions: " +al.size());
// display the array list
System.out.println("Contents of al: " + al);
// Remove elements from the array list
al.remove("F");
al.remove(2);
System.out.println("Size of al after deletions: " +al.size());
System.out.println("Contents of al: " + al);
}
}

/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book1.java
Note: Book1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java ArrayListDemo
Initial size of al: 0
Size of al after additions: 7
Contents of al: [C, A2, A, E, B, D, F]
Size of al after deletions: 5
Contents of al: [C, A2, E, B, D]


*/