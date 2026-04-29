package logistic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Driver ID: ");
        String driverId = sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String driverName = sc.nextLine();

        Driver driver = new Driver(driverId, driverName);


        System.out.print("Enter number of checkpoints: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nCheckpoint " + (i + 1));

            System.out.print("Enter type (1-Delivery, 2-Fuel, 3-Rest): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Checkpoint ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Location: ");
            String location = sc.nextLine();

            System.out.print("Enter Distance: ");
            double distance = sc.nextDouble();

            System.out.print("Enter Start Time: ");
            int startTime = sc.nextInt();

            System.out.print("Enter End Time: ");
            int endTime = sc.nextInt();
            sc.nextLine();


            if (type == 1) {
                driver.routeHistory.addCheckpoint(
                        new DeliveryCheckpoint(id, location, distance, startTime, endTime));
            } else if (type == 2) {
                driver.routeHistory.addCheckpoint(
                        new FuelCheckpoint(id, location, distance, startTime, endTime));
            } else if (type == 3) {
                driver.routeHistory.addCheckpoint(
                        new RestCheckpoint(id, location, distance, startTime, endTime));
            } else {
                System.out.println("Invalid type. Skipping...");
                i--;
            }
        }


        System.out.println("\n--- Route Summary ---");
        driver.printSummary();

        sc.close();
    }
}