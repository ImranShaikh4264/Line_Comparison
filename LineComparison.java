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

	public static void main(String[] args) {
		System.out.println("Well come to Line Comparison Program");
		LineComparison line = new LineComparison();
		double Length = line.calculateLength();
		System.out.println("Lenght of line = " + Length);
	}
}
