package com.southstar.fuelcost;

import java.util.Calendar;
import java.util.Scanner;

public class FuelCost {

    public static void main(String[] args) {

        // Creating Scanner object

        Scanner keyboard = new Scanner(System.in);

        // Initial print

        System.out.print("Engine type (p/d): ");

        String inputEngineType = keyboard.nextLine();

        // Checking user input, printing error if applicable

        if (!"d".equals(inputEngineType) && !"p".equals(inputEngineType)) {
            System.out.print("Engine type you entered is not valid.");
            System.exit(0);
        }

        // Getting the age of the car
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int year;
        System.out.print("Year: ");
        year = keyboard.nextInt();
        int carAge = currentYear - year;

        // Getting distance
        float distance;
        System.out.print("Distance: ");
        distance = keyboard.nextFloat();

        // Printing a blank line
        System.out.println("");

        // Fuel Mileage per 100 km
        float petrolMileagePer100Km = 6.9f;
        float dieselMileagePer100Km = 5.6f;

        // Price per 1 L
        float petrolCost = 7;
        float dieselCost = 6;

        // Petrol mileage per distance
        float petrolMileage = (float) (distance * petrolMileagePer100Km) / 100;
        float dieselMileage = (float) (distance * dieselMileagePer100Km) / 100;

        // Total cost per distance
        float totalCostPetrol = petrolMileage * petrolCost;
        float totalCostDiesel = dieselMileage * dieselCost;

        // Calculating data
        String finalText = ("Total cost of fuel = ");

        if ("p".equals(inputEngineType)) {

            if (carAge <= 5) {
                System.out.println(finalText+totalCostPetrol+" TL");
            } else if (carAge > 5 && carAge <= 10) {
                totalCostPetrol = (float) (totalCostPetrol + totalCostPetrol * 0.02);
                System.out.println(finalText+totalCostPetrol+" TL");
            } else if (carAge > 10) {
                totalCostPetrol = (float) ( totalCostPetrol + (totalCostPetrol * 0.05) );
                System.out.println(finalText+totalCostPetrol+" TL");
            }

        } else if ("d".equals(inputEngineType)) {

            if (carAge <= 5) {
                System.out.println(finalText+totalCostDiesel+" TL");
            } else if (carAge > 5 && carAge <= 10) {
                totalCostDiesel = (float) (totalCostDiesel + (totalCostDiesel * 0.02));
                System.out.println(finalText+totalCostDiesel+" TL");
            } else if (carAge > 10) {
                totalCostDiesel = (float) ( totalCostDiesel + (totalCostDiesel * 0.05) );
                System.out.println(finalText+totalCostDiesel+" TL");
            }





        }
    }
}
