package com.Homepage;

import com.Transport.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TravelApp {
	 Scanner scanner = new Scanner(System.in);
    // Method to calculate the package price based on distance
    public double calculatePrice(double distance,int pr) {
        double amount = distance * pr;
        return amount;
    }
    public String rating() {
    	String r=scanner.next();
    	
    	System.out.println("Enter review");
    	String review=scanner.nextLine();
    	scanner.nextLine();
    	System.out.println("Ratings: "+r+"\nReview:"+review);
    	return r;
    }
    public void packages() {
    	
            System.out.println("Menu:");
            System.out.println("1. Hyd to Bangulore");
            System.out.println("2. Hyd to Mumbai");
            System.out.println("3. Bangulore to Chennai");
            System.out.println("4. Chennai to delhi");
            System.out.println("5. Chennai  to Bangulore");
            System.out.println("6. Mumbai to Noida");
          
    	}     
           
    
    public void search() {
       

        System.out.print("Enter source: ");
        String source = scanner.nextLine();

        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter date and time (yyyy-MM-dd HH:mm): ");
        String dateTimeStr = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        System.out.print("Enter distance (in km): ");
        double distance = scanner.nextDouble();
        int pr=6;
        double packagePrice = calculatePrice(distance,pr);

        // Create transportation instances
        ByBus bus = new ByBus(source, destination, dateTime, packagePrice);
         pr=4;
         packagePrice = calculatePrice(distance,pr);
        ByTrain train = new ByTrain(source, destination, dateTime, packagePrice);
        pr=9;
        packagePrice = calculatePrice(distance,pr);
        ByPlane plane = new ByPlane(source, destination, dateTime, packagePrice);

        // Loop for menu options
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Bus");
            System.out.println("2. Train");
            System.out.println("3. Plane");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Bus: " + bus.getSource() + " to " + bus.getDestination() +
                            " at " + bus.getDateTime() + ", Package Price: " + bus.getPackagePrice());
                    break;
                case 2:
                    System.out.println("Train: " + train.getSource() + " to " + train.getDestination() +
                            " at " + train.getDateTime() + ", Package Price: " + train.getPackagePrice());
                    break;
                case 3:
                    System.out.println("Plane: " + plane.getSource() + " to " + plane.getDestination() +
                            " at " + plane.getDateTime() + ", Package Price: " + plane.getPackagePrice());
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
   
}
