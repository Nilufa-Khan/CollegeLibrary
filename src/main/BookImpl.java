package main;

import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setTitle("Book");
        System.out.println("Title of the book = "+obj.getTitle());
        obj.setYear_Of_Publication(2013);
        System.out.println("Year of publication = "+obj.getYear_Of_Publication());
        obj.setIsbn(2389198984L);
        System.out.println("ISBN = "+obj.getIsbn());
        obj.setAuthorName("RAJ");
        System.out.println("Author name = "+obj.getAuthorName());
    }
}
