abstract class Bike{
abstract void speed();}

class Yamaha extends Bike{
void speed(){
System.out.println("Yamaha have higher speed in two wheels");}
}
public class Checking{
public static void main (String[] args){
System.out.println("Yamaha is a bike");
Bike obj = new Yamaha();
obj.speed();
}
}