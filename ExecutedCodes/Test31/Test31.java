class Test31{
  public static void main(String arr[])
  {
    String str = new String("Jlc");
    Student st = new Student();
    System.out.println(str instanceof String);  // true
    System.out.println(st instanceof Student);  // true
    
    //System.out.println(str instanceof Student);     //  gives compilation error
    
    Object obj = new Student();
    System.out.println(obj instanceof Student);  // true
    System.out.println(obj instanceof String);  // false
    
    
    System.out.println(obj instanceof Object);  // true
    System.out.println(str instanceof Object);  // true
    System.out.println(st instanceof Object);  // true     Object is the super class of all. Every thing is an instance of Object.  
    
    
  }
}

class Student
{

}

