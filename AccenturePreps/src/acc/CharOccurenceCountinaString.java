package acc;



public class CharOccurenceCountinaString
{
public static void main(String[] args) {

String a ="subscribecccccc";
char key ='c';
int c=0;
for(int i=0;i<a.length();i++){
if(a.charAt(i)==key){
c++;
}
}
System.out.println(c);
}
}