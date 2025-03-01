public class Main
{
public static void main(String[] args) {
String a=&quot;aaabbbbbccccdddaa&quot;;
String res=&quot;&quot;;
int c=1;
for(int i=0;i&lt;a.length();i++){
if((i+1)&lt;a.length()&amp;&amp; a.charAt(i)==a.charAt(i+1)){
c++;
}
else{
res=res+a.charAt(i);
res=res+c;
c=1;
}
}
System.out.print(res);
}
}
