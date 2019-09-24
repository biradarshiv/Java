

// Demonstrate a Property list.
import java.util.*;
class PropDemo {
public static void main(String args[]) { 
Properties capitals = new Properties();  // imp
Set states;  // imp
String str;
capitals.put("Illinois", "Springfield");
capitals.put("Missouri", "Jefferson City");
capitals.put("Washington", "Olympia");
capitals.put("California", "Sacramento");
capitals.put("Indiana", "Indianapolis");
// Show all states and capitals in hashtable.
states = capitals.keySet(); // get set-view of keys    // imp
Iterator itr = states.iterator();   // imp
while(itr.hasNext()) {
str = (String) itr.next();
System.out.println("The capital of " +
str + " is " +
capitals.getProperty(str)   // imp
+ ".");
}
System.out.println();
// look for state not in list -- specify default
//str = capitals.getProperty("Illinois", "Not Found");
str = capitals.getProperty("Florida", "Not Found"); // if capital of florida is not found then use "Not Found"
System.out.println("The capital of Florida is "
+ str + ".");
}
}



/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book18.java

E:\>java PropDemo
The capital of Missouri is Jefferson City.
The capital of Illinois is Springfield.
The capital of Indiana is Indianapolis.
The capital of California is Sacramento.
The capital of Washington is Olympia.

The capital of Florida is Not Found.

E:\>javac Book18.java

str = capitals.getProperty("Illinois", "Not Found");
str = capitals.getProperty("Florida", "Not Found"); // if capital of florida is not found then use "Not Found"

line 27 active and 28 commented

E:\>java PropDemo
The capital of Missouri is Jefferson City.
The capital of Illinois is Springfield.
The capital of Indiana is Indianapolis.
The capital of California is Sacramento.
The capital of Washington is Olympia.

The capital of Florida is Springfield.



*/
