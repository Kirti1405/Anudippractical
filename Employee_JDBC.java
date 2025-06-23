    import java.sql.*;
    public class Employee_JDBC {


    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3307/JDBC_DB";
    private static final String USER = "Kirti";
    private static final String PASSWORD = "Kirti@1405";

    public static void main(String[] args) {
        try {
            // Step 1: Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 2: Establish connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully!");

            // Step 3: Create Table
            createTable(connection);

            // Step 4: Insert Data
            insertData(connection, 6, "Sushant Kakade ", "sushantkakade123@gmail.com");
            insertData(connection, 7, "Prasnna Dumbre ", "prasnnadumbre111@gmail.com.com");

            // Step 5: Retrieve Data
            retrieveData(connection);

            // Step 6: Update Data
            updateData(connection, 6, "sushantkakade111@gmail.com");

            //step 7: Search Data

            searchData(connection, 7);

            // Step 7: Delete Data
            deleteData(connection, 7);

            // Step 8: Close Connection
            connection.close();
            System.out.println("Database connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Create Table Method
    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Emp ("
                + "Emp_id INT PRIMARY KEY, "
                + "Emp_name VARCHAR(100), "
                + "Emp_email VARCHAR(100) UNIQUE)";
        
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Table 'Emp' created successfully!");
        }
    }

    // Insert Data Method
    private static void insertData(Connection connection, int Emp_id, String Emp_name, String Emp_email) throws SQLException {
        String insertSQL = "INSERT INTO Emp (Emp_id, Emp_name, Emp_email) VALUES (?, ?, ?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setInt(1, Emp_id);
            pstmt.setString(2, Emp_name);
            pstmt.setString(3, Emp_email);
            pstmt.executeUpdate();
            System.out.println("Inserted: " + Emp_name);
        }
    }

    // Retrieve Data Method
    private static void retrieveData(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM Emp";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            System.out.println("Emp Data:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("Emp_id") + ", Name: " + rs.getString("Emp_name") + ", Email: " + rs.getString("Emp_email"));
            }
        }
    }

    // Update Data Method
    private static void updateData(Connection connection, int Emp_id, String newEmail) throws SQLException {
        String updateSQL = "UPDATE Emp SET Emp_email = ? WHERE Emp_id = ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(updateSQL)) {
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, Emp_id);
            pstmt.executeUpdate();
            System.out.println("Updated email for ID: " + Emp_id);
        }
    }


    //Search data method

     private static void searchData(Connection connection, int Emp_id) throws SQLException {
    String searchSQL = "SELECT * FROM Emp WHERE Emp_id = ?";

    try (PreparedStatement pstmt = connection.prepareStatement(searchSQL)) {
        pstmt.setInt(1, Emp_id);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                
                int id = rs.getInt("Emp_id");
                String name = rs.getString("Emp_name");
                String email = rs.getString("Emp_email");

                System.out.println("Employee Found:");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
            } else {
                System.out.println("No employee found with ID: " + Emp_id);
            }
        }
    }
}


    // Delete Data Method
    private static void deleteData(Connection connection, int Emp_id) throws SQLException {
        String deleteSQL = "DELETE FROM Emp WHERE Emp_id = ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, Emp_id);
            pstmt.executeUpdate();
            System.out.println("Deleted Emp with ID: " + Emp_id);
        }
    
}
}
