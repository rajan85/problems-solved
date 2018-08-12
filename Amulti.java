class Amulti{
public static void main(String as[]){
int a[]={1,2,3};
int b[]= new int[3];
int mul=1;


for(int i=0; i<a.length; i++){

for(int j=0; j<a.length; j++){

if(j!=i)

mul=mul*a[j];

}
b[i]=mul;


mul=1;
}

for(int i=0; i< b.length; i++)
{
System.out.print(b[i]);
}




}}