public class Main {
    public static void main(String[] args) {

        Product banana = new Product(1.33, 20, "Chikita");
        System.out.println(banana);

        banana.priceDiscount();
        System.out.println(banana);

        if (banana.isHealthy(11)){
            System.out.println("Banan is healthy");
        }else System.out.println("Banana is not healthy");


    }
}