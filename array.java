import java.util.*;
public class Main
{
public static void main(String[] args) {
System.out.println(&quot;Enter the no. of data&quot;);
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
int sum=0;
for(int i=0;i&lt;n;i++){
System.out.println(&quot;Enter the element&quot;+(i+1));
a[i]=s.nextInt();
if(a[i]&gt;39 &amp;&amp; a[i]&lt;101)
sum=sum+a[i];
}
System.out.println(&quot;The array elements are&quot;+Arrays.toString(a));
System.out.println(&quot;The sum is&quot;+sum);
}
}
