/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPRATOR;

/**
 *
 * @author lenovo
 */
public class ALL_OPRATOR {
    // OPRASI SELURUH OPRATOR
      public static void main(String[] args) {
        int angka1 = 20;
        int angka2 = 30;
        int addition = angka1 + angka2;
        int subtraction = angka1 - angka2;
        int multiplication = angka1 * angka2;
        int division = angka2 / angka1;
        int modulus = angka2 % angka1;

        System.out.println("==========OPERATOR==========");
        System.out.println(angka1 + " + " + angka2 + " = " + addition);
        System.out.println(angka1 + " - " + angka2 + " = " + subtraction);
        System.out.println(angka1 + " * " + angka2 + " = " + multiplication);
        System.out.println(angka2 + " / " + angka1 + " = " + division);
        System.out.println(angka2 + " % " + angka1 + " = " + modulus);
    }
}
