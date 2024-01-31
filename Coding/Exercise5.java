package Coding;
// Write a Java program to create a class called "Book" with attributes
// for title, author, and ISBN, and methods to add and remove books from a collection.
class Book {
    String title;
    String author;
    String ISBN;
    public Book(String title, String author, String ISBN) {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
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

}
public class Exercise5 {
    
}
