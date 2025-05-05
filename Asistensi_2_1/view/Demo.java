package view;

import java.math.BigDecimal;

import model.Author;
import model.Book;
import model.CoverType;
import model.Publisher;

import controller.BookService;

public class Demo {
    public void viewDemo() {
        
        BookService bookService = new BookService();
        
        Book[] books = new Book[] {
            new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, 
                    new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.Paperback),
           
            new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, 
                    new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.Paperback),
            
            new Book(3, "Book_3", new Author[] { new Author(3, "Walter", "Peterson") }, 
                    new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.Hardcover),

            new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, 
                    new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.Hardcover)
        };
       
        
        
        
       
       //ini untuk filterBooksByAuthor
        Author jonJohnson = new Author(1, "Jon", "Johnson");
        System.out.println("Books by Jon Johnson:");
        Book[] booksByAuthor = bookService.filterBooksByAuthor(jonJohnson, books);
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }
        System.out.println();
        
        //ini untuk filterBooksByPublisher
        Publisher publisher1 = new Publisher(1, "Publisher_1");
        System.out.println("Books by Publisher_1:");
        Book[] booksByPublisher = bookService.filterBooksByPublisher(publisher1, books);
        for (Book book : booksByPublisher) {
            System.out.println(book);
        }
        System.out.println();
        
        //ini untuk filterBooksAfterSpecifiedYear
        int year = 1995;
        System.out.println("Books published after " + year + ":");
        Book[] booksAfterYear = bookService.filterBooksAfterSpecifiedYear(year, books);
        for (Book book : booksAfterYear) {
            System.out.println(book);
        }
    }
}