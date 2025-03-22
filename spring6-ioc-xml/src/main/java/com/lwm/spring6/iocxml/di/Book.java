package com.lwm.spring6.iocxml.di;

/**
 *  LWM
 *  2025/3/21 18:50
 **/
public class Book {
    private String name;
    private String author;
    private String others;


    public Book() {
        System.out.println("Book 无参构造");
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setName("java");
        book.setAuthor("lwm");
        System.out.println(book.getName()+" "+book.getAuthor());


        Book book1 = new Book("C++", "lyy");
        System.out.println(book1.getName()+" "+book1.getAuthor());
    }
}