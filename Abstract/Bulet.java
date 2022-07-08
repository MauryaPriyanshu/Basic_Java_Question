abstract class Bike{
abstract void run();
}

class Bulet extends Bike{
void run()
{
System.out.println("Bulet running Safely:");
System.out.println("Bulet have high speed:");
}
public static void main(String args[]){
Bike obj = new Bulet();
obj.run();
}
}