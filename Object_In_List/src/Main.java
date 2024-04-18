import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Person>personFolder = new ArrayList<>();
        Person peter = new Person("Peter", 12, 7);

        personFolder.add(peter);
        personFolder.add(new Person("John", 10, 5));
        personFolder.add(new Person("Marry", 14, 9));

        for (Person person : personFolder){
            System.out.println(person);
        }

    }
}