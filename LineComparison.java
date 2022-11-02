package com.bridgelab.linecomparison;

import java.util.Scanner;

public class LineComparison {
	int x1, x2, y1, y2;
	double distance;

	public double calculateLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 point");
		x1 = sc.nextInt();
		System.out.println("enter y1 point");
		y1 = sc.nextInt();
		System.out.println("enter x2point");
		x2 = sc.nextInt();
		System.out.println("enter y2 point");
		y2 = sc.nextInt();
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return distance;
	}
	public static void equalityCheck(double L1,double L2) {
		String str1=String.valueOf(L1);
			String str2=String.valueOf(L2);
    if (str1.equals(str2)) {
    	System.out.println("Two Lines are of equal lenght");
    }
    else {
    	System.out.println("Two Lines are of not equal lenght");
    }
		
	}

	public static void main(String[] args) {
		System.out.println("Well come to Line Comparison Program");
		LineComparison line1 = new LineComparison();
		System.out.println("Enter details of first line");
		double Length1 = line1.calculateLength();
		System.out.println("Lenght of line1 = " + Length1);
		LineComparison line2 = new LineComparison();
		System.out.println("Enter details of second line");
		double Length2 = line2.calculateLength();
		System.out.println("Lenght of line2 = " + Length2);
		equalityCheck(Length1,Length2);
		
	}
}
