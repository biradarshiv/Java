
// Demonstrate Arrays
import java.util.*;
class ArraysDemo {
public static void main(String args[]) {
// allocate and initialize array
int array[] = new int[10];
for(int i = 0; i < 10; i++)
array[i] = -3 * i;
// display, sort, display
System.out.print("Original contents: ");
display(array);  //  imp
Arrays.sort(array); //  imp
System.out.print("Sorted: ");
display(array);
// fill and display
Arrays.fill(array, 2, 6, -1); //  imp // in the position 2 3 4 and 5 fill with -1.
System.out.print("After fill(): ");
display(array);
// sort and display
Arrays.sort(array); //  imp
System.out.print("After sorting again: ");
display(array);
// binary search for -9
System.out.print("The value -9 is at location ");
int index = Arrays.binarySearch(array, -9);  //  imp
System.out.println(index);
}
static void display(int array[]) {
for(int i = 0; i < array.length; i++)
System.out.print(array[i] + " ");

System.out.println("");
}
}


/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book13.java

E:\>java ArraysDemo
Original contents: 0 -3 -6 -9 -12 -15 -18 -21 -24 -27
Sorted: -27 -24 -21 -18 -15 -12 -9 -6 -3 0
After fill(): -27 -24 -1 -1 -1 -1 -9 -6 -3 0
After sorting again: -27 -24 -9 -6 -3 -1 -1 -1 -1 0
The value -9 is at location 2


*/
