package data;

public class Book {
   private String title;
   private int year_Of_Publication;
   private long isbn;
   private String authorName;
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return  title;
    }
    public void setYear_Of_Publication(int year_Of_Publication){
        this.year_Of_Publication = year_Of_Publication;
    }
    public int getYear_Of_Publication(){
        return year_Of_Publication;
    }
    public void setIsbn(long isbn){
        this.isbn = isbn;

    }
    public long getIsbn(){
        return isbn;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public String getAuthorName(){
        return  authorName;
    }
}
