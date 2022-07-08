// How to get the matching character in the string
import java.util.*;
public class MatchingString{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String mystring = "guddan";
char mychar  = 'u' ;
MatchingString match = new MatchingString();
boolean matchingstring = match.isMatching(mystring , mychar);
System.out.println(matchingstring);

}

public boolean isMatching(String str ,char a){
for(int i = 0; i < str.length() ; i++){
if(str.charAt(i) == a){
return true;
}
}
return false;
}
}

