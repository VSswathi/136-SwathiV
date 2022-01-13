package com.collabera.atm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

private static Scanner scanner;

public static void main(String[] args) throws InputMismatchException {
	
	Account obj1 = new Account("Sonu",1212,10000);
	Account obj2 = new Account("Suku",1313,10000);
	Boolean x=true;
	try {
	do {
	System.out.println("Enter ID: ");
	scanner = new Scanner(System.in);
	int option = scanner.nextInt();
	if(option==obj1.custId) {
		obj1.showMenu();
		x=false;
	}else{
		if(option==obj2.custId) {
			obj2.showMenu();
			x=false;
		}
		else {
			System.out.println("Invalid ID try Again");
		}
	}
	
}while(x);}catch(InputMismatchException e) {
	System.out.println("invalid input");
}
}

}