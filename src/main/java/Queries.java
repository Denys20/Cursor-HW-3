public class Queries {
    public static final String NUMBER_OF_SEATS = "SELECT number_seats FROM planes";

    public static final String INSERT_PlANE = "INSERT INTO planes(model, serial_number, number_seats) VALUES (?, ?, ?)";

    public static final String UPDATE_PlANE = "UPDATE planes SET number_seats = ? WHERE model = ?";

    public static final String DELETE_PlANE = "DELETE FROM planes WHERE id_plane = ?";

    public static final String SHOW_ALL_PLANES = "SELECT * FROM planes";
}
