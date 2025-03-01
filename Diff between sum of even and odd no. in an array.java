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
int A=0;
int B=0;
for(int i=0;i&lt;n;i++){
if(arr[i]%2==0){
A=A+arr[i];
}
}
for(int i=0;i&lt;n;i++){
if(arr[i]%2!=0){
B=B+arr[i];
}

}
System.out.println(&quot;Sum Of Even No.s:&quot;+A);
System.out.println(&quot;Sum Of Odd No.s:&quot;+B);
System.out.println(&quot;Differnce:&quot;+Math.abs(A-B));
}
}
