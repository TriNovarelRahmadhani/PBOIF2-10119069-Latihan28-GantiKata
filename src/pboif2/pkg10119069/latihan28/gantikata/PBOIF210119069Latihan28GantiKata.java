/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : program ini berisi program ganti kata
 */
public class PBOIF210119069Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        String kalimat,ganti,menjadi;
        
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = input.nextLine();
        System.out.print("Menjadi Kata : ");
        menjadi = input.nextLine();
        
        System.out.println("===Hasil Formating===");
        System.out.println("Kalimat Awal : " +kalimat);
        System.out.println("Kalimat Baru : " +kalimat.replace(ganti,menjadi));
        
        System.out.println("-------------------------------------");
        System.out.println("Developed by : Tri Novarel Rahmadhani");
    }
    
}
