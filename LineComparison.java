package com.bridgelab.linecomparison;

import java.util.Scanner;
// UC4 -comparison of line using oops concept
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
		public static void compareOfLenght(double lenght1, double lenght2) {
			Double x=lenght1;
			Double y=lenght2;
			if (x.compareTo(y)== 0) {
				System.out.println("Two lines are of equal lenght");
			}
			else if (x.compareTo(y)>0) {
				System.out.println("lenght of First line is greater than second lenght of second line");
			}
			else {
				System.out.println("lenght of First line is smaller than second lenght of second line");
			}
			
		
	}

	public static void main(String[] args) {
		System.out.println("Well come to Line Comparison Program");
		LineComparison line1 = new LineComparison();
		System.out.println("Enter details of first line");
		double Length1 = line1.calculateLength();
		System.out.println("Lenght of line1 = " + Length1);
		//LineComparison line2 = new LineComparison();
		System.out.println("Enter details of second line");
		double Length2 = line1.calculateLength();
		System.out.println("Lenght of line2 = " + Length2);
		compareOfLenght(Length1,Length2);
		
	}
}
