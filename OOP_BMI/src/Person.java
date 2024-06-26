public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double bmiIndex(){
        double heightPerHundred = this.height / 100.00;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
}
