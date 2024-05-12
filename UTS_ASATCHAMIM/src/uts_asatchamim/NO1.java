/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_asatchamim;

import java.util.*;

/**
 *
 * @author lenovo
 */
public class NO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TO membalik urutan array
                Scanner arr = new Scanner(System.in)) {
            int pjg = 5;
            int[] array = new int[pjg];
            System.out.print("Masukkan data array (di pisah dengan '.', max 5): ");
            String input = arr.nextLine();
            String[] data = input.split("\\.");
            for (int a = 0; a < data.length; a++) {
                //array[a] = scn.nextInt();
                array[a] = Integer.parseInt(data[a]);
            }

            System.out.print("Keluaran: ");
            for (int b = data.length - 1; b >= 0; b--) {
                System.out.print(array[b]);
                if (b != 0) {
                    System.out.print(", ");
                }
            }
        }

    }

}
