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
public class Arithmetic {

    public static void main(String[] args) {
        int i, n = 0, s = 0;
        {

            System.out.println("Input the 5 numbers : ");

        }
        for (i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s += n;
        }
        System.out.println("The sum is : " + s);

    }
}
