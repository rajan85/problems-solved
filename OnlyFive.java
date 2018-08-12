class OnlyFive
{
private static OnlyFive five[] = new OnlyFive[5];
private static int count;
private OnlyFive()
{
count++;
}

public static OnlyFive getInstance()
{
if(count<5)
	 five[count] = new OnlyFive();

return five[0];
}

public void printCount()
{
System.out.println("number of Instances of this class is "+count+".");

}


public static void main(String as[])
{
OnlyFive[] arr = new OnlyFive[10];
for(int i=0;i<10;i++)
{
arr[i] = OnlyFive.getInstance();
arr[i].printCount();
}

}

}