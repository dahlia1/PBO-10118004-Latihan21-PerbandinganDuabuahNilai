/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author ASUS A411UF
 */
public class PerbandinganDuabuahNilai {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        System.out.println("__________Program Perbandingan Nilai__________");
		Scanner scanner = new Scanner(System.in);
		String ulangi = "Ya";	
		while (ulangi.equals("Ya")){
			System.out.print("Masukkan nilai pertama : ");
			int[] nilai = new int[2];
			nilai[0] = scanner.nextInt();
			System.out.print("Masukkan nilai kedua : ");
			nilai[1] = scanner.nextInt();
			System.out.println("Hasil : " + nilai[0] + ((nilai[0] < nilai[1]) ? " Lebih Kecil " : ((nilai[0] == nilai[1]) ? " Sama Dengan " : " Lebih Besar ")) + nilai[1] );
			System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
			ulangi = scanner.next();
                }
    }
                
}


