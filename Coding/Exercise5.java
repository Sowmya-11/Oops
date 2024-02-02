package Coding;
// Write a Java program to create a class called "Book" with attributes
// for title, author, and ISBN, and methods to add and remove books from a collection.
class Book {
    String title;
    String author;
    String ISBN;
    int pages;
    public Book(String title, String author, String ISBN, int pages) {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.pages=pages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author=author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN=ISBN;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages=pages;
    }
    public void printBookDetails() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+ISBN);
        System.out.println("Pages: "+pages);
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        Book book=new Book("Good", "Alex", "Not good", 200);
        book.printBookDetails();
    }
}
