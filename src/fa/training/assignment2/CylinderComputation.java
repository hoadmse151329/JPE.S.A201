/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.assignment2;

import java.util.Scanner;

public class CylinderComputation {
	private static Scanner sc;

	public static void main(String[] args) {
		// L = Lateral Surface Area of a Cylinder, T = Top Surface Area
		double radius, surfaceArea, volume, height, baseArea;
		sc = new Scanner(System.in);
		
		System.out.print(" radius : ");
		radius = sc.nextDouble();
		System.out.print(" height : ");
		height = sc.nextDouble();
		
		surfaceArea = 2 * Math.PI * radius * (radius + height);
		volume = Math.PI * radius * radius * height;
		baseArea = Math.PI * radius * radius;
		
		System.out.format(" Surface area = %.10f%n", surfaceArea);
                System.out.format(" Base area = %.10f%n", baseArea);
                System.out.format(" Volume = %.10f%n", volume);
	}
}