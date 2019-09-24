
// Use a default property list.
import java.util.*;
class PropDemoDef {
public static void main(String args[]) {
Properties defList = new Properties();
defList.put("Florida", "Tallahassee");
defList.put("Wisconsin", "Madison");
Properties capitals = new Properties(defList);
Set states;
String str;
capitals.put("Illinois", "Springfield");
capitals.put("Missouri", "Jefferson City");
capitals.put("Washington", "Olympia");
capitals.put("California", "Sacramento");
capitals.put("Indiana", "Indianapolis");
// Show all states and capitals in hashtable.
states = capitals.keySet(); // get set-view of keys
Iterator itr = states.iterator();
while(itr.hasNext()) {
str = (String) itr.next();

System.out.println("The capital of " +
str + " is " +
capitals.getProperty(str)
+ ".");
}
System.out.println();
// Florida will now be found in the default list.
str = capitals.getProperty("Florida");
System.out.println("The capital of Florida is "
+ str + ".");

System.out.println(" r and d ");  // it is giving the correct value because you are sending the defList as parameter in the line 9 , while declaring // capitals properties
str = capitals.getProperty("Wisconsin");
System.out.println("The capital of Wisconsin is "
+ str + ".");

}
}



/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book19.java

E:\>java PropDemoDef
The capital of Missouri is Jefferson City.
The capital of Illinois is Springfield.
The capital of Indiana is Indianapolis.
The capital of California is Sacramento.
The capital of Washington is Olympia.

The capital of Florida is Tallahassee.
 r and d
The capital of a is Madison.

*/


