abstract class Car{
 abstract void speed();
abstract void color();
 void bodypart(){
 System.out.println("its body");}
}

class Mahindra extends Car{
void color(){
System.out.println("Mahindra car have many color!!");
}
void speed(){
System.out.println("Mahindra car have different style bodypart**");}

}

class Tayota extends Car{
void color(){
System.out.println("Tayota car have many beautiful color and features###");}
void speed(){
System.out.println("Tayota car have high speed");}

}

public class Self{
public static void main(String[] args){
System.out.println("Mahindra and tayota both are type of car");
Car Mahindracar = new Mahindra();
Mahindracar.speed();
Mahindracar.color(); 
Mahindracar.bodypart();
}
}

