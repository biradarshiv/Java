class Test65
{
	public static void main(String str[])
	{
		ShowMessage.show("abc");
		ShowMessage.show(new int[4]);
		ShowMessage.show(null);
	}
}


class ShowMessage
{
  static void show(String st)
  {
    System.out.println("String");
	}


  static void show(Object ob)
  {
    System.out.println("Object");
	}
}



/*
OUT PUT OF THE PROGRAM IS

E:\>java Test65
String
Object
String

*/