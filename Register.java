package com.cdac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class Register {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Registration Page");
	        System.out.println("NOTE: your username is a unique one so it cannot be changed.");
	        System.out.printf("Username: ");
	        String user = input.next();
	        System.out.printf("Password: ");
	        String pass = input.next();
	        System.out.printf("Confirm Password: ");
	        String conf = input.next();
	        int length = pass.length();
	        int passInt = Integer.parseInt(pass);
	        int confInt = Integer.parseInt(conf);
	        File file = new File("C:"+File.separator + "Users"+File.separator + "فاطمة"+File.separator + "Downloads"+File.separator + "accounts.txt");
	        if (length < 6) {
	            System.out.println("Too short password, password must be 6 characters or more");
	        } else {
	            if (passInt == confInt) {

	                try {
	                    BufferedReader br = new BufferedReader(new FileReader(file));
	                    String current;
	                    boolean checkname = false;
	                    while ((current = br.readLine()) != null) {
	                        if(current.equalsIgnoreCase(user)){
	                            checkname = true;
	                    }
	                }
	                if (checkname) {
	                    System.out.println("Username is already exists and used, please type another one");
	                } else {
	                    Formatter x = null;
	                    try {
	                        FileWriter f = new FileWriter(file.getAbsoluteFile());
	                        BufferedWriter bw = new BufferedWriter(f);
	                        bw.write(user);
	                        bw.close();
	                        x = new Formatter(f);
	                        x.format("%s %s%n", user.toUpperCase(), pass);
	                        System.out.println("You registered succesfully");
	                        x.close();
	                    } catch (Exception e) {
	                        e.printStackTrace();
	                    }
	                }
	            } 
	            catch (Exception e) {
	            }
	        } else {
	            System.out.println("Password and confirm password are not matching");
	        }
	     }
	  }
	}
