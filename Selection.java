class Selection{
public static void main(String as[]){
int a[]={14,33,27,10,32,19,42,44};
int temp=0;
for(int i=0; i<a.length-1;i++){
int max=i;
for(int j=i+1;j<a.length;j++){
if(a[j]>a[max]){
max=j;
}
}
temp=a[max];
a[max]=a[i];
a[i]=temp;
System.out.print(a[i]);
}



}



}