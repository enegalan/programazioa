package Ariketak3Unitatea.Ariketa3.Ariketa1;

public class Item {
     int code;
     String title;
     String author;
     public Item(int code, String title, String author){
        this.code = code;
        this.title = title;
        this.author = author;
    }
    public int getCode(){
         return this.code;
    }
    public String getTitle(){
         return this.title;
    }
    public void show(){
         System.out.println("Code: "+ code);
         System.out.println("Title: "+ title);
         System.out.println("Author: "+ author);
    }
}
