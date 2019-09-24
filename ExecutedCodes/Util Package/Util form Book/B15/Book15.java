

// Demonstrate the Stack class.
import java.util.*;
class StackDemo {
static void showpush(Stack st, int a) {
st.push(new Integer(a));  // imp
System.out.println("push(" + a + ")");
System.out.println("stack: " + st);   // imp
}
static void showpop(Stack st) {
System.out.print("pop -> ");
Integer a = (Integer) st.pop();  // imp
System.out.println(a);
System.out.println("stack: " + st);
}
public static void main(String args[]) {

Stack st = new Stack();
System.out.println("stack: " + st);
showpush(st, 42);
showpush(st, 66);
showpush(st, 99);
showpop(st);
showpop(st);
showpop(st);
try {
showpop(st);
} catch (EmptyStackException e) {
System.out.println("empty stack");
}
}
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book15.java
Note: Book15.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\>java StackDemo
stack: []
push(42)
stack: [42]
push(66)
stack: [42, 66]
push(99)
stack: [42, 66, 99]
pop -> 99
stack: [42, 66]
pop -> 66
stack: [42]
pop -> 42
stack: []
pop -> empty stack


*/
