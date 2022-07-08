public class LibraryDemo{
public static void main(String[] args){

Library user = new Library("BE19IT070", "  IT-63  ", "  Kr.Mittal  ", 700.89f, 2);

System.out.println("*****Getting the current value of user****");

System.out.println(user.getstu_id() +user.getstu_class()+ user.getbook_author()+ user.getbook_price()+ user.getno_ofbooks());

System.out.println("***After setting the new values of user***");


user.setstu_id("BE19IT90");
user.setstu_class("IT-64");
user.setbook_author("G.S Balluja");
user.setbook_price(900.5f);
user.setno_ofbooks(5);

System.out.println(user.getstu_id() +" "+  user.getstu_class()+" "  + user.getbook_author()+" "  + user.getbook_price()+ " "  +  user.getno_ofbooks()); 
}
}