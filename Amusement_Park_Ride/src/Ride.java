public class Ride {
    private String name;
    private int minimalHeight;
    private int numberOfRides;

    public Ride(String name, int minimalHeight){
        this.name = name;
        this.minimalHeight = minimalHeight;
    }

    public void isHighEnough(Person person){
        if (person.getHeight() >= this.minimalHeight){
            System.out.println("You may enter");
            numberOfRides++;
        }else {
            System.out.println("Your height is too small");
        }
    }

    @Override
    public String toString(){
        return "Ride name: " + this.name + ", Minimal height: " + this.minimalHeight;
    }
    public int getNumberOfRides(){
        return this.numberOfRides;
    }
}
