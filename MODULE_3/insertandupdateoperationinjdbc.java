import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class StudentDAO {
    public void insertStudent(int id, String name) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:sqlite:students.db");
        PreparedStatement pst = con.prepareStatement("INSERT INTO students VALUES (?, ?)");
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.executeUpdate();
        con.close();
    }
}
