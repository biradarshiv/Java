import java.util.*;

class ArrayListToArray 
{
public static void main(String args[]) 
{
// Create an array list
ArrayList al = new ArrayList();
// Add elements to the array list
al.add(new Integer(1));
al.add(new Integer(2));
al.add(new Integer(3));
al.add(new Integer(4));
System.out.println("Contents of al: " + al);
// get array
Object ia[] = al.toArray();
int sum = 0;
// sum the array
for(int i=0; i<ia.length; i++)
sum += ((Integer) ia[i]).intValue();
System.out.println("Sum is: " + sum);
}
}



/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book2.java
Note: Book2.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java ArrayListToArray
Contents of al: [1, 2, 3, 4]
Sum is: 10

*/