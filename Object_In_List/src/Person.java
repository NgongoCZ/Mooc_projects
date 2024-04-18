public class Person {
    private int age;
    private int grade;
    private String name;

    public Person(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", Age: " + this.age + ", Grade: " + this.grade;
    }
}
