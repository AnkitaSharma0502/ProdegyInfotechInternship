package ProdegyInfoTechInternship;

import java.util.Scanner;

public class Task_1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);


	        System.out.print("Given temperature value: ");
	        double temperature = scanner.nextDouble();

	       
	        System.out.print("Enter original unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
	        char originalUnit = scanner.next().charAt(0);

	        convertAndDisplay(temperature, originalUnit);

	        scanner.close();
	    }

	    private static void convertAndDisplay(double temperature, char originalUnit) {
	        double celsius, fahrenheit, kelvin;

	        switch (originalUnit) {
	            
	            case 'K':
	                celsius = temperature - 273.15;
	                break;
	            case 'F':
	                celsius = (temperature - 32) * 5 / 9;
	                break;
	            default:
	                celsius = temperature;
	        }

	        fahrenheit = (celsius * 9 / 5) + 32;

	        kelvin = celsius + 273.15;

	        System.out.println("Temperature in:");
	        System.out.println("Celsius is: " + celsius);
	        System.out.println("Fahrenheit is: " + fahrenheit);
	        System.out.println("Kelvin is: " + kelvin);
	    }
	}

