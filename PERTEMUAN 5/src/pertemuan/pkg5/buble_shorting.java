/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg5;

/**
 *
 * @author lenovo
 */
public class buble_shorting {

    /**
     *
     * @param data
     */
    public static void sort(int[] data) {

   
        for (int i = 0; i < data.length - 1; i++) {
            boolean swapped = false;  

            // Untun mengulangi elemen yang berdekatan, bandingkan dan tukar
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;  //  menunjukkan pertukaran
                }
            }
            if (!swapped) {
                break; 
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {60, 30, 20, 10, 40, 70, 90};

        System.out.println("Original data:");
        for (int element : data) {
            System.out.print(element + " ");
        }

        sort(data);  // Sort data

        System.out.println("\nSorted data:");
        for (int element : data) {
            System.out.print(element + " ");
        }
    }
}
