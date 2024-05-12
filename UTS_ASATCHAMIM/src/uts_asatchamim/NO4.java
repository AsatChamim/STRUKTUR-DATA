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
public class NO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO hilangkan duplikat elemen array
        Scanner arr = new Scanner(System.in);

        int pjg = 10;
        int[] array = new int[pjg];
        System.out.print("Masukkan data array (di pisah '.', max 10): ");
        String input = arr.nextLine();
        String[] data = input.split("\\.");
        for (int a = 0; a < data.length; a++) {
            //array[a] = scn.nextInt();
            array[a] = Integer.parseInt(data[a]);
        }
        arr.close();
        int panjang = data.length;
        int[] uniqueArray = new int[panjang];
        int newIndex = 0;

        for (int i = 0; i < panjang; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newIndex; j++) {
                if (array[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[newIndex++] = array[i];
            }
        }
        System.out.println("array akhir tanpa duplikat:");
        for (int nmr : uniqueArray) {
            if (nmr != 0) {
                System.out.print(nmr);
                if (nmr != uniqueArray[newIndex - 1]) {
                    System.out.print(", ");
                }
            }
        }

    }

}
