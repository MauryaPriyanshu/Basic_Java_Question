abstract class Animal{
abstract void walk();
void breathe(){
System.out.println("The animal breaths air!!!");
}
Animal(){
System.out.println("You are about to create an animal");
}
}
class Horse extends Animal{
Horse(){
System.out.println("Wow; you have created a Horse");
}
void walk(){
System.out.println("Horse walks on 4 legs");
}
}
class Chicken extends Animal{
Chicken(){
System.out.println("Wow, you have created a chicken");}

void walk(){
System.out.println("Chicken walks on 2 legs");
}
}
 class OOPS{
public static void main(String[] args){
Horse whiteHorse = new Horse();
whiteHorse.walk();
whiteHorse.breathe();
}
}
