class Singleton
{
private static Singleton only = null;
private static String s;
private static int count;
private Singleton()
{
count++;
}

public static Singleton getInstance()
{
if(only==null)
	 only = new Singleton();
return only;
}

public void printCount()
{
System.out.println("number of Instances of singleton class is "+count+".");

}


public static void main(String as[])
{
Singleton a = Singleton.getInstance();
a.printCount();
Singleton b = Singleton.getInstance();
b.printCount();
Singleton c = Singleton.getInstance();
c.printCount();

System.out.println(a==b && b==c);
}

}