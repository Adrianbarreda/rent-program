package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent_room;

public class Rent {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented?: ");
		int n = sc.nextInt();
		Rent_room[] vect = new Rent_room[10];

		for (int i = 1; i <= n; i++) {
			int Rent = i;
			System.out.println();
			System.out.println("Rent#:" + Rent + ":");			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();			
			System.out.print("Email: ");
			String email = sc.nextLine();			
			System.out.print("Room: ");
			int room = sc.nextInt();			
			vect[room] = new Rent_room(name, email);

		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();

	}

}
