/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_asatchamim;

/**
 *
 * @author lenovo
 */
public class NO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO URUTKA NAMA
        String[] nameArray = {"Asat", "Airi", "Bagas", "Koyuki", "Himawari", "Mikaku", "Shiro"};

        System.out.println("Nama yang diurutkan (Insertion Sort):");
        String[] urutNamaInsertion = insertionSort(nameArray.clone());
        writeArray(urutNamaInsertion);

        System.out.println("\nNama yang diurutkan (Selection Sort):");
        String[] urutNamaSelection = selectionSort(nameArray.clone());
        writeArray(urutNamaSelection);

        System.out.println("\nNama yang diurutkan (Bubble Sort):");
        String[] urutNamaBubble = bubbleSort(nameArray.clone());
        writeArray(urutNamaBubble);
    }

    public static String[] insertionSort(String[] array) {
        for (int a = 1; a < array.length; a++) {
            String key = array[a];
            int b = a - 1;
            while (b >= 0 && array[b].compareTo(key) > 0) {
                array[b + 1] = array[b];
                b = b - 1;
            }
            array[b + 1] = key;
        }
        return array;
    }

    public static String[] selectionSort(String[] array) {
        for (int c = 0; c < array.length - 1; c++) {
            int Index = c;
            for (int d = c + 1; d < array.length; d++) {
                if (array[d].compareTo(array[Index]) < 0) {
                    Index = d;
                }
            }
            String temp = array[Index];
            array[Index] = array[c];
            array[c] = temp;
        }
        return array;
    }

    public static String[] bubbleSort(String[] array) {
        int n = array.length;
        for (int d = 0; d < n - 1; d++) {
            for (int e = 0; e < n - d - 1; e++) {
                if (array[e].compareTo(array[e + 1]) > 0) {
                    String temp = array[e];
                    array[e] = array[e + 1];
                    array[e + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void writeArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }

	}

}