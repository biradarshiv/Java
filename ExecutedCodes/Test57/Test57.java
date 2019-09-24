class  Test57{
  public static void main(String str[]){
  
    Student raj = null;
    //raj.sid = 52;
    System.out.println("INS Name: "+Student.insName);
    System.out.println("Pass Marks: "+raj.passMarks);
    
    Student sri = new Student();
    Student manish = new Student();
    System.out.println("After creating the object");
    sri.show();
    manish.show();
    new Student().show();
    
    sri.sid = 2;
    sri.name = "sri";
    sri.feepaid = 1500.00f;
    sri.insName = "JLC";
    sri.passMarks = 85;
    
    System.out.println("After modifying the first object");
    sri.show();
    manish.show();
    new Student().show();
    
    System.out.println("Static Method");
    Student.display();
  }
}




class Student{
  int sid;
  String name;
  float feepaid;
  static String insName = "jlc";
  static int passMarks = 75;
  
  void show(){
    System.out.println(sid+"\t"+ name+"\t"+ feepaid+"\t"+ insName+"\t"+ passMarks);
  }
  
  static void display(){
    System.out.println("Pass Marks"+passMarks);
    //System.out.println(sid);
    
    Student st = new Student();
    System.out.println("Sid of Object"+st.sid);
  }
}


/*

OUTPUT OF THE PROGRAM IS 

E:\>java Test57
INS Name: jlc
Pass Marks: 75
After creating the object
0       null    0.0     jlc     75
0       null    0.0     jlc     75
0       null    0.0     jlc     75
After modifying the first object
2       sri     1500.0  JLC     85
0       null    0.0     JLC     85
0       null    0.0     JLC     85
Static Method
Pass Marks85
Sid of Object0
*/

