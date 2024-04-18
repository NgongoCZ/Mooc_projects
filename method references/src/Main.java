public class Main {
    public static void main(String[] args) {

        Person joan = new Person(25, "Joan", 'M', true);
        System.out.println(joan);

        joan = null;
        joan.growOlder();
        System.out.println(joan);
    }
}