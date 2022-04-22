package ru.eduprof;

public class Person {
    String fullName;
    int age;
    public static void main(String[] args) {
    Person person = new Person();
    Person person1 = new Person("BENDER",1000);
    person.move();
    person1.move();
    person.talk();
    person1.talk();
    }

    public void move() {
        System.out.println(age + " years old " + fullName + " MOVING");
    }

    public void talk() {
        System.out.println(age + " years old " + fullName + " TALKING");
    }

    public Person() {
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
