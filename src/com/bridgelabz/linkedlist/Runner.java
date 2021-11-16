package com.bridgelabz.linkedlist;


import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        switch(scanner.nextInt()) {
            case 1:
                Operations.addDataAtStart();
                scanner.close();
        }
		
	

	}

}
