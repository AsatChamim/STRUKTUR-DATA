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
public class NO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TO gabungkan 2 array
       Scanner arr = new Scanner(System.in);
		
		int pjg = 5;
		int [] arraya = new int[pjg];
		int [] arrayb = new int[pjg];
		System.out.print("Masukkan data array 1 (di pisah '.', max 5): ");
		String input = arr.nextLine();
		String [] data = input.split("\\.");
		for (int a = 0; a < data.length; a++) {
			//array[a] = scn.nextInt();
			arraya[a] = Integer.parseInt(data[a]);
		}
		System.out.print("Masukkan data array 2 (di pisah '.', max 5): ");
		String inputb = arr.nextLine();
		String [] datab = inputb.split("\\.");
		for (int b = 0; b < datab.length; b++) {
			//array[a] = scn.nextInt();
			arrayb[b] = Integer.parseInt(datab[b]);
		}
		arr.close();
		int [] mixarr = new int[data.length + datab.length];
		System.arraycopy(arraya, 0, mixarr, 0, data.length);
		System.arraycopy(arrayb, 0, mixarr, data.length, datab.length);
		System.out.print("Keluaran: ");
		for (int b = 0; b < mixarr.length; b++) {
			System.out.print(mixarr[b]);
			if (b != mixarr.length - 1) {
				System.out.print(", ");
			}
		}

	}

}