//how to find reverse of the given number

public class Reverse{
public static void main(String[] args){
int num = 567;

int reverse = 0;
while(num > 0){
int remain = num%10;
reverse = reverse*10 + remain;
num = num/10;}

System.out.println("the reverse of the given number is :" + reverse);
}
}
