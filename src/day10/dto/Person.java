package day10.dto;

public class Person {

    private String name;
    private int age;
    private String phone;

    public Person() {} //default constructor

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone; // constructor overloading
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String play() {
        return "운동한다.";
    }

    public String eat() {
        return "먹다.";
    }

    public String walk() {
        return "걷다.";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
