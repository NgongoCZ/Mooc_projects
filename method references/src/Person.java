public class Person {
    private int age;
    private String name;
    private char sex;
    private boolean isMarried;

    public Person(int age, String name, char sex, boolean isMarried){
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.isMarried = isMarried;
    }

    public void growOlder(){
        this.age++;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", Age: " + this.age + ", Sex: " + this.sex + " ,  Is married : " + this.isMarried;
    }
}
