import java.util.Scanner;

public class Plane{
int plane_number;
int total_seat;
String airline_class;
String pilot_name;
int reserved;
public Plane(int p, int t, String a, String n){
plane_number = p;
total_seat = t;
airline_class = a;
pilot_name = n;
}
public int seatAvaibility(){

return(total_seat - reserved);
}

public String reserve(){
if(reserved <= total_seat){
reserved = reserved + 1;
return "Your Seat is booked";
}
else{
return "Your Seat is not booked";}
}


public void planeInfo(){
	System.out.println("plane number -  " + plane_number);
	System.out.println("total seat -  " + total_seat);
	
	System.out.println("airline_class -  " + airline_class);
	System.out.println("pilot name -  " + pilot_name);
}	
public static void main(String [] args){
System.out.println("Execution Started:");

Scanner sc = new Scanner(System.in);
boolean flag = true;
while(flag){

System.out.println("enter plane number --> ");

int planeNumber = sc.nextInt();

System.out.println("Enter total number of seat --> ");
int totalSeat = sc.nextInt();

System.out.println("Enter airline class --> ");
String airlineClass = sc.next();

System.out.println("Enter pilotName --> ");
String pilotName = sc.next();


Plane indigo_d = new Plane(planeNumber,totalSeat,"airlineClass","pilotName");

System.out.println("*******plane info --- ");
indigo_d.planeInfo();


int seats = indigo_d.seatAvaibility();
System.out.println("seats available - " + seats);

String gudaan = indigo_d.reserve();
System.out.println("reservation status - " + gudaan);
System.out.println("Do you want to continue(Y)");

String choice = sc.next();
if(!choice.equalsIgnoreCase("Y")){
	flag = false;
}
}
}
}








