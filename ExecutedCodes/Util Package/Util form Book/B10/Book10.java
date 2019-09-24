
// Use a custom comparator.
import java.util.*;
// A reverse comparator for strings.
class MyComp implements Comparator 
{
public int compare(Object a, Object b) {
String aStr, bStr;
aStr = (String) a;
bStr = (String) b;
// reverse the comparison
return bStr.compareTo(aStr);

/*
return aStr.compareTo(bStr);

E:\>javac Book10.java
Note: Book10.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java CompDemo
A B C D E F

*/

}
// no need to override equals
}

// CREATED A CLASS IMPLEMENTING COMPARATOR OVERRIDDEN COMPARE METHOD , AND PASSING ITS OBJECT TO TREESET

class CompDemo {
public static void main(String args[]) {
// Create a tree set
TreeSet ts = new TreeSet(new MyComp());
// Add elements to the tree set
ts.add("C");
ts.add("A");

ts.add("B");
ts.add("E");
ts.add("F");
ts.add("D");
// Get an iterator
Iterator i = ts.iterator();
// Display elements
while(i.hasNext()) {
Object element = i.next();
System.out.print(element + " ");
}
System.out.println();
}
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book10.java
Note: Book10.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java CompDemo
F E D C B A

*/
