public class Plane {
    private int id_plane;
    private String model;
    private String serial_number;
    private int number_seats;

    public Plane() {
    }

    public Plane(String model, String serial_number, int number_seats) {
        this.model = model;
        this.serial_number = serial_number;
        this.number_seats = number_seats;
    }

    public Plane(int id_plane, String model, String serial_number, int number_seats) {
        this.id_plane = id_plane;
        this.model = model;
        this.serial_number = serial_number;
        this.number_seats = number_seats;
    }

    public void setId_plane(int id_plane) {
        this.id_plane = id_plane;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public void setNumber_seats(int number_seats) {
        this.number_seats = number_seats;
    }

    @Override
    public String toString() {
        return "id_plane = " + id_plane + "; model = '" + model + '\'' + "; serial_number = '" + serial_number + '\'' + "; number_seats = " + number_seats;
    }
}
