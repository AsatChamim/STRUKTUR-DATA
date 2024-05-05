/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY;

/**
 *
 * @author lenovo
 */
public class string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // cek similaritas suatu kalimat
     System.out.println("Program cek similarity ");
     String string1 = "Kasur Rusak";
        String string2 = "Kasur Saya Rusak";

        double similarity = calculateSimilarity(string1, string2);
        
        System.out.println("KALIAMAT YG DI BANDINGKAN : " );
        System.out.println("KALIMAT PERTAMA : " + string1);
        System.out.println("KALIMAT KEDUA : " + string2 );
        
        System.out.println("SIMILARITAS : " + similarity);
    }

    public static double calculateSimilarity(String string1, String string2) {
        int sameCharCount = 0;

        for (char c : string1.toCharArray()) {
            if (string2.indexOf(c) != -1) {
                sameCharCount++;
            }
        }
        return (double) sameCharCount / Math.max(string1.length(), string2.length()) * 100;
    }
}
         