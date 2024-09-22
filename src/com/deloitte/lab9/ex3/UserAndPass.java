package com.deloitte.lab9.ex3;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class UserAndPass {
	public static void main(String[] args) {
		BiConsumer<String, String> login = (username, password) -> {
			if (username.equals("Adi") && password.equals("123")) {
				System.out.println("Login Sucesfully");
			} else {
				System.out.println("Invalid Credentials");
			}
		};

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Username: ");
		String username = scan1.nextLine();
		System.out.println("Password: ");
		String password = scan1.nextLine();

		login.accept(username, password);

	}
}
