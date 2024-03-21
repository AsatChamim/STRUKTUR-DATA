/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BIODATA;

/**
 *
 * @author lenovo
 */
public class TIPE_DATA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO MEMBUAT BIODATA DENGAN TIPE DATA
        String nim = "2355201003";
        String nama = "As'at Chamim Mungdzirin";
        Double BB = 47.8;
        int umur = 19;
        char goldar = 'B';
        boolean lakilaki = true;

        System.out.println("=============================");
        System.out.println("=          BIODATA          =");
        System.out.println("=============================");
        System.out.println("NIM         : " + nim);
        System.out.println("NAMA        : " + nama);
        System.out.println("BERAT BADAN : " + BB);
        System.out.println("UMUR        : " + umur);
        System.out.println("GOLDAR      : " + goldar);
        if (lakilaki == true) {
            System.out.println("GENDER      : Laki-Laki");
        }
    }

}
