import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc",
                    "yourUsername",
                    "yourPassword"
            );

            // Create Statement
            Statement st = con.createStatement();

            // Execute Query
            ResultSet rs = st.executeQuery("SELECT * FROM Student");

            // Read ResultSet
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " + rs.getString(2)
                );
            }

            // Close resources
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}