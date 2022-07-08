class User {
private String id;
private String name;
private String gender;

User (String id, String name, String gender){
this.id = id;
this.name = name;
this.gender = gender;
}
public String getid(){
	return this.id;
	}
public String getname(){
	return this.name;
	}
public String getgender(){
	return this.gender;
	}

public void setid(String id){
this.id = id;
}
public void setname(String name){
this.name = name;
}
public void setgender(String gender){
this.gender = gender;
}
}