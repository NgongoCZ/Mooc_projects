public class Product {
    private double price;
    private int quantiti;
    private String name;

    public Product(double price, int quantiti, String name){
        this.price = price;
        this.quantiti = quantiti;
        this.name = name;
    }



    @Override
    public String toString(){
        return "Price: " + this.price + ", quantiti: " + this.quantiti + ", name: " + this.name;
    }

    public void priceDiscount(){
        price-=1;
    }

    public boolean isHealthy(int nutritions){
        if (nutritions > 10){
            return true;
        }else return false;
    }


}
