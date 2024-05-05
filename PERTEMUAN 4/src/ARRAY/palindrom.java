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
class Palindrom {

    public static void main(String[] args) {
        new Palindrom().palindrome("kasur saya rusak");
    }

    private void palindrome(String teks) {
        String palindrom = "";

        for (int i = teks.length(); i > 0; i--) {
            String test1 = teks.substring(i - 1, i);
            palindrom += test1;
        }

        if (teks.equals(palindrom)) {
            System.out.println("==== " + teks + " adalah Palindrome =====");
        } else {
            System.out.println("==== " + teks + " bukan Palindrome =====");
        }
    }
}
