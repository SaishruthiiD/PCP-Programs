import java.util.*;
public class Main
{
public static void main(String[] args) {
int[] a = {1,2,6,7};
int target = 8;
int left = 0;
int right = a.length - 1;
int[] result = new int[]{};

while (left &lt; right){
int sum = a[left] + a[right];

if(sum == target){
result = new int[]{left,right};
break;
}else if(sum&lt;target){
left++;
}else{
right--;
}
}
if(result.length == 2)
System.out.print(result[0]+&quot;,&quot;+result[1]);
else
System.out.print(&quot;Not found&quot;);

}}
