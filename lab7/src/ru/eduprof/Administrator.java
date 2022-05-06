package ru.eduprof;

public class Administrator extends User implements Administrable {
    Administrator(String func, String name) {
        super(func, name);
    }


    @Override
    public Book outOfDateNotification(Book book) {
        if (book.outOfDate) {
            System.out.println(this.func + this.name + " govorit chto "
                    + book.namebook + " prosrochena " );
        } else {
            System.out.println(this.func + this.name + " govorit chto "
                    + book.namebook + " sdana v srok ");
        }

        return book;
    }
}






