package main.book;
// BookServiceImpl.java
import main.config.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private Connection connection = Database.DBConnection();
    private PreparedStatement preparedStatement;

    @Override
    public void addBook(Book book) {
        try {
            String query = "INSERT INTO book VALUES (NULL, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getAuthorName());
            preparedStatement.executeUpdate();
            System.out.println("Book has been added.\n");
            preparedStatement.close();
        } catch (SQLException exc) {
            System.err.println("FAILED TO ADD BOOK: " + exc.getMessage());
        }
    }

    @Override
    public List<Book> findBookList() {
        List<Book> bookList = new ArrayList<>();
        try {
            String query = "SELECT * FROM book";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setTitle(resultSet.getString("title"));
                book.setAuthorName(resultSet.getString("author_name"));
                bookList.add(book);
            }
            statement.close();
            resultSet.close();
        } catch (SQLException exc) {
            System.err.println("FAILED TO GET BOOK LIST: " + exc.getMessage());
        }
        return bookList;
    }

    @Override
    public Book findBookById(int bookId) {
        Book book = new Book();
        try {
            String query = "SELECT * FROM book WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, bookId);
            ResultSet result = preparedStatement.executeQuery();
            if (result.next()) {
                book.setId(result.getInt("id"));
                book.setTitle(result.getString("title"));
                book.setAuthorName(result.getString("author_name"));
            }
            preparedStatement.close();
            result.close();
        } catch (SQLException exc) {
            System.err.println("FAILED TO GET BOOK : " + exc.getMessage());
        }
        return book;
    }

    @Override
    public void updateBook(Book book) {
        try {
            String query = "UPDATE book SET title = ?, author_name = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getAuthorName());
            preparedStatement.setInt(3, book.getId());
            preparedStatement.executeUpdate();
            System.out.println("Successfully updated the book with id = " + book.getId() + "\n");
            preparedStatement.close();
        } catch (SQLException exc) {
            System.err.println("FAILED TO UPDATE BOOK DATA : " + exc.getMessage());
        }
    }

    @Override
    public void removeBook(int id) {
        try {
            String query = "DELETE FROM book WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Successfully delete book!\n");
            preparedStatement.close();
        } catch (SQLException exc) {
            System.err.println("FAILED TO DELETE BOOK DATA : " + exc.getMessage());
        }
    }
}