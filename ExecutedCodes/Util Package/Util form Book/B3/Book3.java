
// Demonstrate LinkedList.
import java.util.*;
class LinkedListDemo {
public static void main(String args[]) 
{
// create a linked list
LinkedList ll = new LinkedList();
// add elements to the linked list
ll.add("F");
ll.add("B");
ll.add("D");
ll.add("E");
ll.add("C");
ll.addLast("Z");
ll.addFirst("A");
ll.add(1, "A2");

System.out.println("Original contents of ll: " + ll);
// remove elements from the linked list
ll.remove("F");
ll.remove(2);
System.out.println("Contents of ll after deletion: "
+ ll);
// remove first and last elements
ll.removeFirst();
ll.removeLast();
System.out.println("ll after deleting first and last: "
+ ll);
// get and set a value
Object val = ll.get(2);
ll.set(2, (String) val + " Changed");
System.out.println("ll after change: " + ll);
}
}



/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book3.java
Note: Book3.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java LinkedListDemo
Original contents of ll: [A, A2, F, B, D, E, C, Z]
Contents of ll after deletion: [A, A2, D, E, C, Z]
ll after deleting first and last: [A2, D, E, C]
ll after change: [A2, D, E Changed, C]

*/
