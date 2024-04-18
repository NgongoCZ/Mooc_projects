public class Account {

    public String name;
    public int age;
    public char sex;

    public Account(String name, int age, char sex){
        this.sex = sex;
        this.age = age;
        this.name = name;
    }

    public void printMyPerson(){
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Sex: " + this.sex);
    }

    public void whistle(String voice){
        System.out.println(this.name + " makes " + voice);
    }

    public void door(){
        System.out.println("Whois there");
    }

}
