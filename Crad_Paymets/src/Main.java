public class Main {
    public static void main(String[] args) {

        Payment_Terminal unicafeExactum = new Payment_Terminal();
        System.out.println(unicafeExactum);

        Payment_Card annesCard = new Payment_Card(100.00);

        System.out.println("amount of money on the card is " + annesCard.getBalance() + " euros");

        boolean wasSuccessful = unicafeExactum.eat_heartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.add_money_to_terminal(annesCard, 100);

        wasSuccessful = unicafeExactum.eat_heartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.getBalance() + " euros");

        System.out.println(unicafeExactum);
    }
}