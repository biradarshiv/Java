// Create a second thread.
class NewThread implements Runnable {
Thread t;
NewThread() {
// Create a new, second thread
t = new Thread(this, "Demo Thread");
System.out.println("Child thread ************************ : " + t);
t.start(); // Start the thread
}
// This is the entry point for the second thread.
public void run() {
try {
for(int i = 5; i > 0; i--) {
System.out.println("Child Thread: CCCCCCCCCCCCCCCC  " + i);
Thread.sleep(500);
}
} catch (InterruptedException e) {
System.out.println("Child interrupted.");
}
System.out.println("Exiting child thread.");
}
}
class ThreadDemo {
public static void main(String args[]) {
new NewThread(); // create a new thread
try {
for(int i = 5; i > 0; i--) {
System.out.println("Main Thread: " + i);
Thread.sleep(1000);
}
} catch (InterruptedException e) {
System.out.println("Main thread interrupted.");
}
System.out.println("Main thread exiting.");
}
}



/*
OUT PUT OF THE PROGRAM IS 

E:\>javac Thex2.java

E:\>java ThreadDemo
Child thread ************************ : Thread[Demo Thread,5,main]
Main Thread: 5
Child Thread: CCCCCCCCCCCCCCCC  5
Child Thread: CCCCCCCCCCCCCCCC  4
Main Thread: 4
Child Thread: CCCCCCCCCCCCCCCC  3
Child Thread: CCCCCCCCCCCCCCCC  2
Child Thread: CCCCCCCCCCCCCCCC  1
Main Thread: 3
Exiting child thread.
Main Thread: 2
Main Thread: 1
Main thread exiting.


*/