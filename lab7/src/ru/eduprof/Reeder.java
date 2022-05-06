package ru.eduprof;

public class Reeder extends User implements Reederable{
    Reeder(String func, String name) { super(func,name); }

    @Override
    public void takeBook(Book... books) {
        System.out.print(this.name + " beret knigi: ");
    for (Book book : books) {
        System.out.println(book.getNameBook());
        }
    }

    @Override
    public void returnBook(Book... books) {
        System.out.print(this.name + " vernet knigi: ");
        for (Book book : books) {
            System.out.println(book.getNameBook());
        }
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
