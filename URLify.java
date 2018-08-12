public class URLify
{

static String urlify(String i )
{
String trimmed = i.trim();
String[] words = trimmed.split(" ");
String url = "";
int n = words.length;
for(int k=0;k<n-1;k++)
url =url+words[k]+"%20";

return url;

//time complexity:O(n)
//space complexity:O(n)

}

static String urlifyChar(char[] a)
{


}




public static void main(String ar[])
{
String i = "Mr smith john    ";
System.out.println(URLify.urlify(i));

char[] ip = {'M','r',' ','s','m','i','t','h',' ','j','o','h','n',' ', ' ',};
System.out.println(ip.length);

}




}
