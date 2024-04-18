public class Person {
    private int height;
    private String name;

    public Person(int height, String name){
        this.height = height;
        this.name = name;
    }

    public int getHeight(){
        return this.height;
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return "The height is: " + this.height;
    }

}
