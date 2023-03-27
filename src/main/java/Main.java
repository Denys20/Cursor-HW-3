import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        TotalNumberPassengers totalNumberPassengers = new TotalNumberPassengers();
        InsertPlane insertPlane = new InsertPlane();
        UpdatePlane updatePlane = new UpdatePlane();
        DeletePlane deletePlane = new DeletePlane();
        ShowAllPlanes showAllPlanes = new ShowAllPlanes();

        int number;
        do {
            System.out.println("Меню:" +
                    "\n1 Загальна кількість пасажирів яку може обслужити аеропорт" +
                    "\n2 Додати літак" +
                    "\n3 Оновити літак" +
                    "\n4 Видалити літак" +
                    "\n5 Вивести літаки" +
                    "\n6 Вихід");
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    totalNumberPassengers.totalNumberPassengers();
                    System.out.println();
                    break;
                case 2:
                    insertPlane.insertPlane();
                    System.out.println();
                    break;
                case 3:
                    updatePlane.updatePlane();
                    System.out.println();
                    break;
                case 4:
                    deletePlane.deletePlane();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Всі літаки:");
                    showAllPlanes.showAllPlanes();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Вихід:");
                    break;
                default:
                    System.out.println("Ви ввели неправильно. Спробуйте знову");
                    break;
            }
        } while(number != 6);
    }
}
