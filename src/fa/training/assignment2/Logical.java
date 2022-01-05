/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.assignment2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Logical {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
         int num1 = in.nextInt();
         System.out.print("Input second number: ");
         int num2 = in.nextInt();
		 System.out.print("Input third number: ");
         int num3 = in.nextInt();
         System.out.print("Input fourth number: ");
         int num4 = in.nextInt();		
		
		if (num1 == num2 && num2 == num3 && num3 == num4) 
		  {
			System.out.println("Numbers are equal.");
                               }
		else
			{
			System.out.println("Numbers are not equal!");
		}
	}
}