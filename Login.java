package com.cdac;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    String uname;
	    String pword;

	    System.out.println("Log in:");
	    System.out.println("Indtast username: ");
	    uname = input.nextLine();

	    System.out.println("Indtast password: ");
	    pword = input.nextLine();

	    Users check = new Users(uname, pword);

	    if(check.auth()) 
	        System.out.println("You are logged in");

	}

	}
	

