import java.util.*;
class Info
{
public static void main(String ar[])
{
String ip = "he saw a saw which saw he the saw";

String[] words = ip.split(" ");
int n = words.length;
ArrayList<String> al = new ArrayList<String>(n); 

for(String i:words)
al.add(i);


Map<String,Integer> h = new HashMap<String,Integer>();

for(int i=0;i<n;i++)
{
String current = al.get(i);
if(!h.containsKey(current))
{
h.put(current,new Integer(1));
}
else
{
h.put(current,h.get(current)+1);
}

	
}

		for (Map.Entry<String, Integer> entry : h.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}

}

}