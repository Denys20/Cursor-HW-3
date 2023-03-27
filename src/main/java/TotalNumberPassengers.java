import java.sql.*;

public class TotalNumberPassengers {
    public void totalNumberPassengers() {
        try (Connection connection = DriverManager.getConnection(ConnectionsDB.url, ConnectionsDB.user, ConnectionsDB.password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(Queries.NUMBER_OF_SEATS)) {
            int number_of_seats = 0;

            while (resultSet.next()) {
                number_of_seats += resultSet.getInt("number_seats");
            }
            System.out.println("Загальна кількість пасажирів яку може обслужити аеропорт: " + number_of_seats);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
