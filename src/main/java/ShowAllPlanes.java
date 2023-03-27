import java.sql.*;
import java.util.ArrayList;

public class ShowAllPlanes {
    public void showAllPlanes() {
        try (Connection connection = DriverManager.getConnection(ConnectionsDB.url, ConnectionsDB.user, ConnectionsDB.password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(Queries.SHOW_ALL_PLANES);) {
            ArrayList<Plane> planes = new ArrayList<>();

            while (resultSet.next()) {
                Plane plane = new Plane();

                plane.setId_plane(resultSet.getInt("id_plane"));
                plane.setModel(resultSet.getString("model"));
                plane.setSerial_number(resultSet.getString("serial_number"));
                plane.setNumber_seats(resultSet.getInt("number_seats"));
                planes.add(plane);
            }

            for (Plane plane : planes) {
                System.out.println(plane.toString());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
