import java.util.*;
public class Sum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("*****************Welcome to our system of digit sum check!!");
boolean flag=true;
while(flag){
System.out.println("Enter a number");
int num = sc.nextInt();

//int num = 34;
int sum = 0;
while(num != 0){
sum = sum + num % 10;//extract the digit from number//
num = num / 10; //shorten the number by 1 digit//
}
System.out.println("sum of digit:" + sum);

System.out.println("Do you want to continue(Y)");

String choice = sc.next();
if(!choice.equalsIgnoreCase("Y")){
	flag = false;
}
}

System.out.println("**********************thanks for using our system!!");
}
}

