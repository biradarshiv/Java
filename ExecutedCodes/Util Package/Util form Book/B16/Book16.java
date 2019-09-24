

// Demonstrate a Hashtable
import java.util.*;
class HTDemo {
public static void main(String args[]) {
Hashtable balance = new Hashtable();
Enumeration names;
String str;
double bal;
balance.put("John Doe", new Double(3434.34));
balance.put("Tom Smith", new Double(123.22));
balance.put("Jane Baker", new Double(1378.00));
balance.put("Todd Hall", new Double(99.22));
balance.put("Ralph Smith", new Double(-19.08));
// Show all balances in hash table.
names = balance.keys();  // imp
while(names.hasMoreElements()) {   // imp
str = (String) names.nextElement();
System.out.println(str + ": " +
balance.get(str));    // imp
}
System.out.println();

// Deposit 1,000 into John Doe's account
bal = ((Double)balance.get("John Doe")).doubleValue();
balance.put("John Doe", new Double(bal+1000));
System.out.println("John Doe's new balance: " +
balance.get("John Doe"));
}
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book16.java
Note: Book16.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java HTDemo
Ralph Smith: -19.08
Todd Hall: 99.22
John Doe: 3434.34
Jane Baker: 1378.0
Tom Smith: 123.22

John Doe's new balance: 4434.34

*/

