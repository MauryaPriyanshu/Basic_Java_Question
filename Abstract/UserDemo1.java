public class UserDemo1{
public static void main(String[] args){

User1 Student = new User1(79, "Priya" , 98);

System.out.println("**** Initial values*****");
System.out.println(Student.getid());
System.out.println(Student.getname());
System.out.println(Student.getmarks());

System.out.println("****After change the values*****");
Student.setid(80);
System.out.println(Student.getid());

Student.setname("Anshu");
System.out.println(Student.getname());

Student.setmarks(100);
System.out.println(Student.getmarks());
}
}