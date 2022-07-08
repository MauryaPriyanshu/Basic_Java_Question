//Check Leap Year
public class Leap{
public static void main(String [] args)
{
int year = 2026;
if (year%400==0)
System.out.println("Leap year");
else if(year%4==0 && year%100 != 0)
System.out.println("Leap year");
else
System.out.println("not leap year");
}
}