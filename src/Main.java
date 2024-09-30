import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // declare accidents 2 dimensional array
        int[][] accidents = new int[3][2];
        String[] cities = {"Cape Town", "Johannesburg","Port Elizabeth "};
        int total= 0;

        System.out.println("Enter the number of car accidents for Cape Town : ");
        // ASSIGN FOR CAR IN CAPE TOWN
        accidents[0][0] = scan.nextInt();
        System.out.println("Enter the number of motor bike accidents for Cape Town : ");
        // ASSIGN FOR MOTOR BIKE IN CAPE TOWN
        accidents[0][1] = scan.nextInt();

//        Johannesburg
        System.out.println("Enter the number of car accidents for Johannesburg : ");
        // ASSIGN FOR CAR IN Johannesburg
        accidents[1][0] = scan.nextInt();

        System.out.println("Enter the number of car motor bike for Johannesburg : ");
        // ASSIGN FOR CAR IN Johannesburg
        accidents[1][1] = scan.nextInt();

//        Port Elizabeth
        System.out.println("Enter the number of car accidents for Port Elizabeth : ");
        // ASSIGN FOR CAR IN Johannesburg
        accidents[2][0] = scan.nextInt();

        System.out.println("Enter the number of car motor bike for Port Elizabeth : ");
        // ASSIGN FOR CAR IN Johannesburg
        accidents[2][1] = scan.nextInt();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Road Accident Report");
        System.out.println("-------------------------------------------------------------");

        /// For Loop for column and row display

        for (int i = 0; i < accidents.length; i++) {
            /// making A COLUMN AND RO
            System.out.printf("%-20s  %-10s   %-10s","      ", "CAR", "Motor Bike");
            System.out.println();
            // DISPLAYING CARS, MOTORBIKES ACCIDENTS AND CITIES
            System.out.printf("%-20s  %-10d   %-10d", cities[i],accidents[i][0], accidents[i][1]);

            for (int j = 0; j < accidents[i].length; j++) {
            total += accidents[i][j];
            }

            // separate cities
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------------------");

        // Display total by each city
        System.out.println("Cape Town "+total);
        System.out.println("Johannesburg "+total);
        System.out.println("Port Elizabeth "+total);



    }
}