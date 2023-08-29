package com.Homepage;

import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
	    Excel ex = new Excel();
	        ex.readData();
	        Login log=new Login();
	        TravelApp t=new TravelApp();
	        // System.out.println("enter phone number");
			log.verify();
	       try (// Menu for accessing customer and account info
	    	        Scanner scanner = new Scanner(System.in)) {
	    	            while (true) {
	    	                System.out.println("Menu:");
	    	                System.out.println("1. Transport");
	    	                System.out.println("2. Packages");
	    	               // System.out.println("3. Bookings");
	    	                System.out.println("3. Review & Ratings");
	    	                System.out.println("4. Exit");
	    	                System.out.print("Enter your choice: ");
	    	                int choice = scanner.nextInt();

	    	                if (choice == 4) {
	    	                    break;
	    	                }
	    	                else if (choice == 1) {
	    	                   t.search();
	    	                }
	    	                else if (choice == 2) {
	    	                	   
	    	                }
	    	                else if (choice == 3) {
	    	                	t.rating();  
	    	                }
	    	                
	    	                else 
	    	                	System.out.println("Something went wrong try after some time....");
	    	            }    }
}
}