package com.dio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		int n;
		
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
	        sc.nextLine();
			System.out.printf("\nRent #%d: \nName: ", i);
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}
		
		System.out.println("\nBusy rooms: ");
		for (int i=0; i< vect.length; i++) {
			if(vect[i] != null){
				System.out.println(i + ": " + vect[i]);
			}
		}	
		sc.close();

		
	}

}
