/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010119913latihan35;

/**
 * @author
 * NAMA     : Muhammad Alvin Rizqi Ramdhan 
 * KELAS    : IF 10K
 * NIM      : 10119913
 */
public class PB010119913Latihan35 {
 public static void main(String[] args) {
	User karyawan = new User();
	System.out.println("==========Program Tunjangan==========");
	Double gajipokokKaryawan = karyawan.getGajipokok();
	String statusKaryawan = karyawan.getStatus();
    Double tunjanganKaryawan = karyawan.hitungTunjangan(statusKaryawan);
    Double totalGaji = karyawan.setTotal();
    System.out.println("\n========Hasil Perhitungan Gaji Anda========");
    System.out.printf("Gaji Pokok\t\t: Rp %.1f%n",gajipokokKaryawan);
    System.out.printf("Tunjangan\t\t: Rp %.1f%n",tunjanganKaryawan);
    System.out.printf("Total Gaji\t\t: Rp %.1f%n",totalGaji);

    }
    
}
