package ru.eduprof;

abstract class User {
    String name;
    String func;
    User (String func, String name) {
        this.func = func;
        this.name = name;
    }
    @Override
    public String toString() {
        return this.getName();
    }
    public String getName() {
        return name;
    }

}
