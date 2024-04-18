public class Main {
    public static void main(String[] args) {

        Person jack = new Person("Jack", 20, 172,73);
        Person bob = new Person("Bob", 32, 180, 90);
        HealthStation hospital = new HealthStation();
        System.out.println("The weight of " + jack.getName() + " is: " + hospital.getWeight(jack));
        System.out.println("The weight of " + bob.getName() + " is: " + hospital.getWeight(bob));

        hospital.weighing(jack);
        hospital.weighing(jack);
        hospital.weighing(bob);
        System.out.println("The weight of " + jack.getName() + " is: " + hospital.getWeight(jack));
        System.out.println("The weight of " + bob.getName() + " is: " + hospital.getWeight(bob));

        System.out.println("Number of weightings: " + hospital.numOfWeight());

    }
}