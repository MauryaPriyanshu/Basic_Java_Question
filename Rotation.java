/* input s1;
let s1 = abc
and s2 = bca
check rotation
we append s2 and store it s3
if s3 contains s1
than return true
else false

*/


public class Rotation{
public static void main(String[] args){
	String s1 = "abc";
	String s2 = "bca";
    Rotation rotation = new Rotation();
    boolean check = rotation.isRotation(s1,s2);
   System.out.println(check);
}
public boolean isRotation(String s1,String s2){
String s3 = s2+s2;
if(s3.contains(s1)){
return true;}
else{
return false;}
}
}
