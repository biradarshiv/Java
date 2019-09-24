

/* A simple telephone number database that uses
a property list. */
import java.io.*;
import java.util.*;
class Phonebook {
public static void main(String args[])
throws IOException
{
Properties ht = new Properties();
BufferedReader br =



new BufferedReader(new InputStreamReader(System.in));
String name, number;
FileInputStream fin = null;
boolean changed = false;
// Try to open phonebook.dat file.
try {
fin = new FileInputStream("phonebook.dat");
} catch(FileNotFoundException e) {
// ignore missing file
}
/* If phonebook file already exists,
load existing telephone numbers. */
try {
if(fin != null) {
ht.load(fin);
fin.close();
}
} catch(IOException e) {
System.out.println("Error reading file.");
}
// Let user enter new names and numbers.
do {
System.out.println("Enter new name" +
" ('quit' to stop): ");
name = br.readLine();
if(name.equals("quit")) continue;
System.out.println("Enter number: ");
number = br.readLine();
ht.put(name, number);
changed = true;
} while(!name.equals("quit"));
// If phone book data has changed, save it.
if(changed) {
FileOutputStream fout = new FileOutputStream("phonebook.dat");
ht.store(fout, "Telephone Book");



fout.close();
}
// Look up numbers given a name.
do {
System.out.println("Enter name to find" +
" ('quit' to quit): ");
name = br.readLine();
if(name.equals("quit")) continue;
number = (String) ht.get(name);
System.out.println(number);
} while(!name.equals("quit"));
}
}









/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Book20.java

E:\>java Phonebook
Enter new name ('quit' to stop):
manish
Enter number:
123
Enter new name ('quit' to stop):
singla
Enter number:
456
Enter new name ('quit' to stop):
sri
Enter number:
789
Enter new name ('quit' to stop):
bike
Enter number:
159
Enter new name ('quit' to stop):
quit
Enter name to find ('quit' to quit):
bike
159
Enter name to find ('quit' to quit):
bike
159
Enter name to find ('quit' to quit):
singla
456
Enter name to find ('quit' to quit):
quit


*/


