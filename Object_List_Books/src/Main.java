import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();
        while (true){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Write a title of a book, empty inout exits the program");
            String bookTitle = myScanner.nextLine();
            if (bookTitle.isEmpty()){
                System.out.println("No input, exit");
                break;
            }
            System.out.println("Write the number of pages");
            int numberOfPages = myScanner.nextInt();
            myScanner.nextLine();
            if (numberOfPages <= 0){
                System.out.println("Wrong input, please try again");
                continue;
            }
            System.out.println("Write a year of publication");
            int publicYear = myScanner.nextInt();
            if (publicYear > 2024){
                System.out.println("Wrong input, please try again");
                continue;
            }

            bookList.add(new Book(bookTitle, numberOfPages, publicYear));
        }


        Scanner answerScanner = new Scanner(System.in);
        System.out.println("What are you looking for ? Title/Everything ?");
        String answer = answerScanner.nextLine();
        if (answer.equals("Title")){
            for (Book book : bookList){
                System.out.println(book.getTitle());
            }
        } else if (answer.equals("Everything")) {
            for (Book book : bookList){
                System.out.println(book);
            }
        }

    }
}