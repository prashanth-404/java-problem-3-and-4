package javafile;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5 {
	
	static Reception recep = new Reception();
	static Billing bill = new Billing();
	static Dispatch disp = new Dispatch();
	static BioChemLab biochemlab = new BioChemLab();
	static PathLab pathlab = new PathLab();

	public static void main(String[] args) {
		
		int num;
		String str;

		Scanner s = new Scanner(System.in); 
		num = s.nextInt();
		
		for(int i = 0 ; i < num ; i++) {
			str = s.next();
			Lab5.getRecep().addRequest(str);
		}
		s.close();
		
		System.out.print("Total billed: ");                             // get all bills from Billing and print out the total for the day
		System.out.println(Lab5.getBill().getTotal());
		System.out.println("Reports:");
		for (String t:Lab5.getDispatch().getAllResults()) {
			System.out.println(t);
		}
		System.out.println("Total tests: ");
		System.out.println("BioChem: "+ Lab5.getBioChem().getbiotests());
		System.out.println("Path: "+ Lab5.getPathLab().getpathtests());
		
		
																		// get all reports from Dispatch and print out one line at a time
																		// Each line will have: Patient ID, Test ID, result string
																		
																		
																		// get list of tests from each lab, and print out total tests per lab
		
	}
	
	static Reception getRecep() {
		return recep;
	}
	
	static Billing getBill() {
		return bill;
	}
	
	static Dispatch getDispatch() {
		return disp;
	}
	
	static BioChemLab getBioChem() {
		return biochemlab;
	}
	
	static PathLab getPathLab() {
		return pathlab;
	}

}

