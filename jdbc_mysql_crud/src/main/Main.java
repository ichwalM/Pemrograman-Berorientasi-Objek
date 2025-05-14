package main;

import main.book.Book;
import main.book.BookService;
import main.book.BookServiceImpl;
import main.config.Database;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        int menuInput = 0;

        System.out.println("Library Program");
        System.out.println("===============");

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add Book");
            System.out.println("2. Find Book List");
            System.out.println("3. Find Book By Id");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("\nSelect Menu : ");
            menuInput = scanner.nextInt();
            switch (menuInput) {
                case 1:
                    System.out.println("\nAdd Book");
                    System.out.println("=========");
                    scanner.nextLine(); // Consume newline left-over
                    System.out.print("Book Title : ");
                    String title = scanner.nextLine();
                    System.out.print("Author Name : ");
                    String authorName = scanner.nextLine();
                    Book newBook = new Book(title, authorName);
                    bookService.addBook(newBook);
                    break;
                case 2:
                    System.out.println("\nFind Book List");
                    System.out.println("===============");
                    List<Book> books = bookService.findBookList();
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book book : books) {
                            System.out.println("ID          : " + book.getId());
                            System.out.println("Title       : " + book.getTitle());
                            System.out.println("Author Name : " + book.getAuthorName());
                            System.out.println("-------------");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nFind Book By Id");
                    System.out.println("================");
                    System.out.print("Enter Book Id : ");
                    int bookId = scanner.nextInt();
                    Book book = bookService.findBookById(bookId);
                    if (book != null && book.getId() != 0) {
                        System.out.println("ID          : " + book.getId());
                        System.out.println("Title       : " + book.getTitle());
                        System.out.println("Author Name : " + book.getAuthorName());
                    } else {
                        System.out.println("Book with id " + bookId + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("\nUpdate Book");
                    System.out.println("===========");
                    System.out.print("Enter Book Id to Update : ");
                    int bookIdUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.print("New Book Title : ");
                    String newTitle = scanner.nextLine();
                    System.out.print("New Author Name : ");
                    String newAuthorName = scanner.nextLine();
                    Book bookUpdate = new Book(newTitle, newAuthorName);
                    bookUpdate.setId(bookIdUpdate);
                    bookService.updateBook(bookUpdate);
                    break;
                case 5:
                    System.out.println("\nRemove Book");
                    System.out.println("===========");
                    System.out.print("Book Id : ");
                    int bookIdRemove = scanner.nextInt();
                    bookService.removeBook(bookIdRemove);
                    break;
                case 6:
                    System.out.println("Program finished!");
                    Database.closeConnection();
                    break;
                default:
                    System.out.println("Invalid Menu!");
                    break;
                }
            } while (menuInput != 6);
        }
    }