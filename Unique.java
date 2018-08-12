import java.util.*;
public class Unique
{

static boolean isAllUnique(String s)
{
//use caching
char[] c  = s.toCharArray();
int[] cache = new int[256];

for(char i:c)
{
cache[i]++;
}

for(int j:cache )
{
if(j>1)
return false;
}

return true;
// time complexity = O(n)
// space complexity = O(n)

}



static boolean hasAllUnique(String s)
{
//brute force approach
char[] c  = s.toCharArray();

for(int i=0;i<s.length();i++)
{
for(int j=i+1;j<s.length();j++)
{
if(s.charAt(i)==s.charAt(j))
return false;
}
}

return true;

//time complexity = O(n^2)
//space complexity = O(n)
}



static boolean isUnique(String s)
{
//use a HashSet
char[] c = s.toCharArray();
Set set = new HashSet(s.length());


for(char i:c)
{
if(set.contains(i))
return false;
else set.add(i);
}

return true;

// time complexity = O(n)
// space complexity = O(n)

}


static boolean areUnique(String s)
{
char[] c  = s.toCharArray();
Arrays.sort(c);
for(int i=1;i<c.length;i++)
{
if(c[i]==c[i-1])
return false;
}
return true;

}
public static void main(String ar[])
{
String input1 = "rajan";

System.out.println(Unique.areUnique(input1));
}

}