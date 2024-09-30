import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args){
        String vehicleType;
        String cityAccident;
        int totalNumAccidents;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the accident vehicle type:  ");
        // vehicle type by user
        vehicleType = scanner.nextLine();

        System.out.println("Enter the city for the vehicle accidents:  ");
        // vehicle by city
        cityAccident = scanner.nextLine();

        System.out.println("Enter the city for the vehicle accidents:  ");
        // vehicle by city
        totalNumAccidents = scanner.nextInt();

        RoadAccidentReport firstReport = new RoadAccidentReport(vehicleType,cityAccident,totalNumAccidents);

        firstReport.printAccidentReport();



    }
}
