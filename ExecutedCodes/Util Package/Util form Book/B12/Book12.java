// Demonstrate various algorithms.
import java.util.*;
class AlgorithmsDemo {
public static void main(String args[]) {
// Create and initialize linked list
LinkedList ll = new LinkedList();
ll.add(new Integer(-8));
ll.add(new Integer(20));
ll.add(new Integer(-20));
ll.add(new Integer(8));
// Create a reverse order comparator
Comparator r = Collections.reverseOrder();  // imp
// Sort list by using the comparator
Collections.sort(ll, r);  // imp

// Get iterator
Iterator li = ll.iterator();
System.out.print("List sorted in reverse: ");
while(li.hasNext())
System.out.print(li.next() + " ");
System.out.println();


Collections.shuffle(ll);   // imp
// display randomized list
li = ll.iterator(); 
System.out.print("List shuffled: ");
while(li.hasNext())
System.out.print(li.next() + " ");
System.out.println();

System.out.println("Minimum: " + Collections.min(ll));  // imp
System.out.println("Maximum: " + Collections.max(ll));  // imp
} 
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book12.java
Note: Book12.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java AlgorithmsDemo
List sorted in reverse: 20 8 -8 -20
List shuffled: 20 -20 -8 8
Minimum: -20
Maximum: 20

*/
