package ru.eduprof;

public class Provider extends User implements Providerable {
    Provider(String func, String name) { super(func,name); }

    @Override
    public void provBook() {
        System.out.println(super.func + super.name + " prinosit knigi v biblioteky");
    }
}
