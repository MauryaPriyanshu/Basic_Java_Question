public class MobileDemo{
public static void main(String[] args){

Mobile typeOfMobile = new Mobile("Sumsung glacxy", "8GB Ram", "Sumsung", 18.5f);

System.out.println("*** Initially defind values of Mobile are:--->");
System.out.println(typeOfMobile.getMob_name() + typeOfMobile.getMob_quality() + typeOfMobile.getMob_company() + typeOfMobile.getMob_size());

System.out.println("*** After the changes of Mobile values are:--->");
typeOfMobile.setMob_name("Oppo 5G");
typeOfMobile.setMob_quality("64GB RAM");
typeOfMobile.setMob_company("Oppo");
typeOfMobile.setMob_size(20.5f);

System.out.println(typeOfMobile.getMob_name());
System.out.println(typeOfMobile.getMob_quality());
System.out.println(typeOfMobile.getMob_company());
System.out.println(typeOfMobile.getMob_size());
}
}



