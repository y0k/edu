package ru.eduprof;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("KNIGA1", 0,true));
        books.add(new Book("KNIGA2",1,false));
        books.add(new Book("KNIGA3",2,true));
        books.add(new Book("KNIGA4",3,false));
        books.add(new Book("KNIGA5",4,true));

        Administrator admin = new Administrator("Admin ", "VASYA");
        Reeder reeder1 = new Reeder("Chitatel ", "AFANASY");
        Reeder reeder2 = new Reeder("Chitatel ", "VALERA");
        Provider provider = new Provider("Dealer ", "ARSENY");
        LibraryManager libraryManager = new LibraryManager("Bibliotekar ", "NINEL");


        libraryManager.orderBook(provider);
        provider.provBook();
        reeder1.takeBook(books.get(1));
        reeder1.returnBook(admin.outOfDateNotification(books.get(0)));
        reeder2.returnBook(admin.outOfDateNotification(books.get(2)));

    }
}
