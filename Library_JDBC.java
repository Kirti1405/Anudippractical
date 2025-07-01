import java.sql.*;

public class Library_JDBC {

    private static final String URL = "jdbc:mysql://localhost:3307/L_JDBC";
    private static final String USER = "Kirti";
    private static final String PASSWORD = "Kirti@1405";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database.");

            createTable(connection);

            insertBook(connection, 1, "The Alchemist", "Paulo Coelho", 399.0, "1988", "Akshada", "2025-07-10");
            insertBook(connection, 2, "Wings of Fire", "A.P.J. Abdul Kalam", 250.0, "1999", "Sam", "2025-07-08");
            insertBook(connection, 3, "The Secret", "Rhonda Byrne", 299.0, "2006", "Kirti", "2025-07-15");
            insertBook(connection, 4, "Rich Dad Poor Dad", "Robert Kiyosaki", 349.0, "1997", "Sakshi", "2025-07-18");
            insertBook(connection, 5, "Ikigai", "Francesc Miralles", 450.0, "2016", "Prasanna", "2025-07-12");
            insertBook(connection, 6, "Atomic Habits", "James Clear", 499.0, "2018", "Sushant", "2025-07-20");

            retrieveBooks(connection);
            searchBookById(connection, 3);

            updateBookById(connection, 2, "Wings of Fire", "Dr. A.P.J. Abdul Kalam", 275.0, "1999", "Sneha", "2025-07-09");
            deleteBookById(connection, 6);

            retrieveBooks(connection);

            connection.close();
            System.out.println("Connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Books (" +
                     "book_id INT PRIMARY KEY, " +
                     "book_name VARCHAR(100), " +
                     "book_author VARCHAR(100), " +
                     "book_price DOUBLE, " +
                     "book_published VARCHAR(20), " +
                     "book_borrow VARCHAR(100), " +
                     "book_return VARCHAR(20))";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'Books' created successfully.");
        }
    }

    private static void insertBook(Connection connection, int id, String name, String author,
                                   double price, String published, String borrow, String retDate) throws SQLException {
        String sql = "INSERT INTO Books (book_id, book_name, book_author, book_price, book_published, book_borrow, book_return) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, author);
            pstmt.setDouble(4, price);
            pstmt.setString(5, published);
            pstmt.setString(6, borrow);
            pstmt.setString(7, retDate);
            pstmt.executeUpdate();
            System.out.println("Inserted: " + name);
        }
    }

    private static void retrieveBooks(Connection connection) throws SQLException {
        String sql = "SELECT * FROM Books";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\nBooks in Library:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("book_id") +
                        ", Name: " + rs.getString("book_name") +
                        ", Author: " + rs.getString("book_author") +
                        ", Price: " + rs.getDouble("book_price") +
                        ", Published: " + rs.getString("book_published") +
                        ", Borrowed By: " + rs.getString("book_borrow") +
                        ", Return Date: " + rs.getString("book_return"));
            }
        }
    }

    private static void searchBookById(Connection connection, int id) throws SQLException {
        String sql = "SELECT * FROM Books WHERE book_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("\nBook Found:");
                    System.out.println("ID: " + rs.getInt("book_id"));
                    System.out.println("Name: " + rs.getString("book_name"));
                    System.out.println("Author: " + rs.getString("book_author"));
                    System.out.println("Price: " + rs.getDouble("book_price"));
                    System.out.println("Published: " + rs.getString("book_published"));
                    System.out.println("Borrowed By: " + rs.getString("book_borrow"));
                    System.out.println("Return Date: " + rs.getString("book_return"));
                } else {
                    System.out.println("\nNo book found with ID: " + id);
                }
            }
        }
    }

    private static void updateBookById(Connection connection, int id, String name, String author,
                                       double price, String published, String borrow, String retDate) throws SQLException {
        String sql = "UPDATE Books SET book_name = ?, book_author = ?, book_price = ?, " +
                     "book_published = ?, book_borrow = ?, book_return = ? WHERE book_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, author);
            pstmt.setDouble(3, price);
            pstmt.setString(4, published);
            pstmt.setString(5, borrow);
            pstmt.setString(6, retDate);
            pstmt.setInt(7, id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("\nBook with ID " + id + " updated.");
            } else {
                System.out.println("\nNo book found with ID: " + id);
            }
        }
    }

    private static void deleteBookById(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM Books WHERE book_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("\nBook with ID " + id + " deleted.");
            } else {
                System.out.println("\nNo book found with ID: " + id);
            }
        }
    }
}
