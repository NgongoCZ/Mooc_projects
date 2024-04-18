public class Book {

    private String title;
    private int pages;
    private int yearOfPublication;

    public Book(String title, int pages, int yearOfPublication){
        this.title = title;
        this.pages = pages;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return "Title: " + this.title + "\nPages: " + this.pages + "\nPublication year: " + yearOfPublication + "\n";
    }
}
