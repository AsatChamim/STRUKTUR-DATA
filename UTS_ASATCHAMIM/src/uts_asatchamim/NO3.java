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
public class NO3 {

     /* @param args the command line
    /** arguments
     */
    public static void main(String[] args) {
        int[] array;
        try ( // TO KEMUNCULAN JUMLAH ANGKA ARRAY
                Scanner arr = new Scanner(System.in)) {
            int pjg = 10;
            array = new int[pjg];
            System.out.print("Masukkan data array (di pisah dengan '.', max 10): ");
            String input = arr.nextLine();
            String[] data = input.split("\\.");
            for (int a = 0; a < data.length; a++) {
                //array[a] = scn.nextInt();
                array[a] = Integer.parseInt(data[a]);
            }
        }
        HashMap<Integer, Integer> munculan = new HashMap<>();
        for (int nmr : array) {
            if (munculan.containsKey(nmr)) {
                munculan.put(nmr, munculan.get(nmr) + 1);
            } else {
                munculan.put(nmr, 1);
            }
        }

        System.out.println("Jumlah kemunculan setiap elemen dlm array:");
        for (int ky : munculan.keySet()) {
            if (ky != 0) {
                System.out.println(ky + " muncul " + munculan.get(ky) + " kali");
            }
        }

    }

}
