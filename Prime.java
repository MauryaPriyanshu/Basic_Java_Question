public class Prime{
public static void main(String[] args){
int num =25;
int count = 0;
if (num < 2)
System.out.println("The number" + num + "is not prime number");
for(int i=1;i <= num;i++){
if(num %i == 0)
count += 1;
}
if(count > 2)
System.out.println(" The given number" + num + "is not prime");
else
System.out.println("The given number" + num + "is prime");
}
}