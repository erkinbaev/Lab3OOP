package com.natlusrun.task4;

public class BookStoreService {

    public static void main(String[] args) {
        Books book1 = new Books("HP", 2012, "Windows");
        Magazines magazine1 = new Magazines("Samsung", 2016, "A3");
        Books book2 = new Books("Apple", 2014, "MacOS BigSur");
        Books book3 = new Books("Acer", 2020, "Windows");
        Magazines magazine2 = new Magazines("Apple", 2020, "SE2");
        Magazines magazine3 = new Magazines("Apple", 2020, "12Pro");
        BookStore bookStore= new BookStore();
        bookStore.addBook(book1);
        bookStore.addBook(magazine1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);
        bookStore.addBook(magazine2);
        bookStore.addBook(magazine3);
        bookStore.printBooks();
    }
}
