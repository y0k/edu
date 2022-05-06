package ru.eduprof;

public class LibraryManager extends User implements LibraryManagerable{
    LibraryManager(String func, String name) { super(func, name); }

    @Override
    public void orderBook(Providerable providerable) {
        System.out.println(this.func + " " + this.name + " delegiruet "  + providerable.toString() + " prinesti knigi");
    }
}
