import java.sql.*;
import java.util.Scanner;

public class DeletePlane {
    public void deletePlane() {
        try (Connection connection = DriverManager.getConnection(ConnectionsDB.url, ConnectionsDB.user, ConnectionsDB.password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETE_PlANE);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть id для видалення:");
            int id_plane = scanner.nextInt();
            preparedStatement.setInt(1, id_plane);
            preparedStatement.executeUpdate();

            System.out.println("Запис видалено");
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
