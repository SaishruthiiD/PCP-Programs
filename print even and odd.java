import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner a=new Scanner(System.in);
System.out.print(&quot;Enter the size of the Array:&quot;);
int n=a.nextInt();
int[] arr=new int[n];
System.out.print(&quot;Enter the elements of the Array:&quot;);
for(int i=0;i&lt;n;i++){
arr[i]=a.nextInt();
}
for(int i=0;i&lt;n;i++){
if(arr[i]%2==0){
System.out.print(arr[i]+&quot; &quot;);
}
}
for(int i=0;i&lt;n;i++){
if(arr[i]%2!=0){

System.out.print(arr[i]+&quot; &quot;);
}
}
}
}
