import java.sql.*;
import java.util.Scanner;

public class UpdatePlane {
    public void updatePlane() {
        try (Connection connection = DriverManager.getConnection(ConnectionsDB.url, ConnectionsDB.user, ConnectionsDB.password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATE_PlANE);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть модель літака:");
            String model = scanner.nextLine();
            System.out.println("Введіть кількість місць:");
            int number_seats = scanner.nextInt();
            preparedStatement.setInt(1, number_seats);
            preparedStatement.setString(2, model);

            preparedStatement.executeUpdate();

            System.out.println("Інформацію про літак оновлено");
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
