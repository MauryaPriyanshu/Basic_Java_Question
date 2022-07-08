// check polindrome number--> 121, 343
public class polindrome{
public static void main(String[] args){
int num = 878;
int rev = 0;
int temp = num;
while(num != 0){
int rem = num % 10;
rev = rev*10 + rem;
num = num/10;}
if ( temp == rev){
System.out .println( temp + " is polindrome number ");}
else{
System.out.println( temp + " is not polindrome number ");
}
}
}


