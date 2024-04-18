import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What movie are you looking for ?");
        String filmName = myScanner.nextLine();
        System.out.println("What is the age rating ?");
        int ageRating = myScanner.nextInt();
        myScanner.nextLine();
        Film airingMovie = new Film(filmName, ageRating);

        System.out.println("The movie you have chosen is: " + airingMovie.name() + " with Age Ratings of: " + airingMovie.getAgeRate());

        System.out.println("How old are you ? ");
        int getAge = myScanner.nextInt();

        if (airingMovie.isOldEnough(getAge)){
            System.out.println("You may enter");
        }else System.out.println("Not old enough");
    }
}