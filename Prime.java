class Main {
public static void main(String[] args) {
for(int i=100;i&lt;=1000;i++){
if(prime(i))
{
int r=sum(i);
if(prime(r)){
System.out.print(i+ &quot; &quot;);
}
}
}
}
public static boolean prime(int i){
int count=0;
for(int j=2;j&lt;i;j++){
if(i%j==0)
count++;
}
return count==0;
}
public static int sum(int i){
int s=0;
while(i&gt;0){
s=s+i%10;
i=i/10;
}
return s;
}
}
