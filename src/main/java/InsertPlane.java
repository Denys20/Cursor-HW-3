import java.sql.*;
import java.util.Scanner;

public class InsertPlane {
    public void insertPlane() {
        try (Connection connection = DriverManager.getConnection(ConnectionsDB.url, ConnectionsDB.user, ConnectionsDB.password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERT_PlANE, Statement.RETURN_GENERATED_KEYS);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть модель літака:");
            String model = scanner.nextLine();
            System.out.println("Введіть серійний номер:");
            String serial_number = scanner.nextLine();
            System.out.println("Введіть кількість місць:");
            int number_seats = scanner.nextInt();
            preparedStatement.setString(1, model);
            preparedStatement.setString(2, serial_number);
            preparedStatement.setInt(3, number_seats);
            preparedStatement.executeUpdate();

            System.out.println("Літак додано");
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
