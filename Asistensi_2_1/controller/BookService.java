package controller;
import model.Book;
import model.Author;
import model.Publisher;

public class BookService {
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        int count = 0;
        for (Book book : books) {
            Author[] authors = book.getAuthors();
            for (Author bookAuthor : authors) {
                if (bookAuthor.getId() == author.getId()) {
                    count++;
                    break;
                }
            }
        }
        
        Book[] result = new Book[count];
        int index = 0;
        for (Book book : books) {
            Author[] authors = book.getAuthors();
            for (Author bookAuthor : authors) {
                if (bookAuthor.getId() == author.getId()) {
                    result[index++] = book;
                    break;
                }
            }
        }
        
        return result;
    }
    
    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book.getPublisher().getId() == publisher.getId()) {
                count++;
            }
        }
        
        Book[] result = new Book[count];
        int index = 0;
        
        for (Book book : books) {
            if (book.getPublisher().getId() == publisher.getId()) {
                result[index++] = book;
            }
        }
        return result;
    }
    
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                count++;
            }
        }
        
        Book[] result = new Book[count];
        int index = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                result[index++] = book;
            }
        }
        return result;
    }
}