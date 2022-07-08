class Mobile{
private String Mob_name;
private String Mob_quality;
private String Mob_company;
private float Mob_size;

Mobile(String Mob_name, String Mob_quality, String Mob_company, float Mob_size){
this.Mob_name = Mob_name;
this.Mob_quality = Mob_quality;
this.Mob_company = Mob_company;
this.Mob_size = Mob_size;
}
public String getMob_name(){
return this.Mob_name;
}
public String getMob_quality(){
return this.Mob_quality;
}
public String getMob_company(){
return this.Mob_company;
}
public float getMob_size(){
return this.Mob_size;
}
public String setMob_name(String setMob_name){
return this.Mob_name;}

public String setMob_quality(String setMob_quality){
return this.Mob_quality;}

public String setMob_company(String setMob_company){
return this.Mob_company;}

public float setMob_size(float setMob_size){
return this.Mob_size;}
}

