
class UserDemo{
public static void main(String[] args){
User aadvic = new User("1","Aadvic","M");
//System.out.println(aadvic.id);
//System.out.println(aadvic.name);
//System.out.println(aadvic.gender);

//aadvic.id = "123";
//System.out.println(aadvic.id);
System.out.println("**Initial values of user aadvic**");
System.out.println(aadvic.getid());
System.out.println(aadvic.getname());
System.out.println(aadvic.getgender());

System.out.println("After changing the values of user aadvic--->");

aadvic.setid("123");
System.out.println(aadvic.getid());

aadvic.setname("Aadi");
System.out.println(aadvic.getname());

aadvic.setgender("male");
System.out.println(aadvic.getgender());
}
}