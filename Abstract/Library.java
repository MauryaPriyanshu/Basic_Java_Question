class Library{
private String stu_id;
private String stu_class;
private String book_author;
private float book_price;
private int no_ofbooks;

Library(String stu_id, String stu_class, String book_author ,float book_price,int no_ofbooks){
this.stu_id = stu_id;
this.stu_class = stu_class;
this.book_author = book_author;
this.book_price = book_price;
this.no_ofbooks = no_ofbooks;
}

public String getstu_id(){
return this.stu_id;}

public String getstu_class(){
return this.stu_class;}

public String getbook_author(){
return this.book_author;}

public float getbook_price(){
return this.book_price;}

public int getno_ofbooks(){
return this.no_ofbooks;}

public void setstu_id(String stu_id){
this.stu_id = stu_id;}

public void setstu_class(String stu_class){
this.stu_class = stu_class;}

public void setbook_author(String book_author){
this.book_author = book_author;}

public void setbook_price(float book_price){
this.book_price = book_price;}

public void setno_ofbooks(int no_ofbooks){
this.no_ofbooks = no_ofbooks;}
}

