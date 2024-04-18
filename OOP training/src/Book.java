public class Book {
    private String author;
    private String title;
    private int pageCount;

    public Book(String title, String author, int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPageCount(){
        return this.pageCount;
    }

    @Override
    public String toString(){
        return "Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pageCount;
    }
}
