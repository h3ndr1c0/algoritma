/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.scanner;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class TugasScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nik, nama, tmplahir, tgllahir, alamat;
        int usia;
        String jkel;
        try (Scanner in = new Scanner(System.in)){
            System.out.println("Masukan NIK : ");
            nik = in.nextLine();
            System.out.println("Masukan Nama : ");
            nama = in.nextLine();
            System.out.println("Masukan TMP Lahir : ");
            tmplahir = in.nextLine();
            System.out.println("Masukan TGL Lahir : ");
            tgllahir = in.nextLine();
            System.out.println("Masukan Alamat : ");
            alamat = in.nextLine();
            System.out.println("Masukan JKel : ");
            jkel = in.nextLine();
            System.out.println("Masukan Usia : ");
            usia = in.nextInt();
           
        }
           
        System.out.println("Masukan Data Diri Kamu : ");
        System.out.println("===============");
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Tempat Tanggal Lahir : " + tmplahir);
        System.out.println("Tanggal Lahir : " + tgllahir);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia);
        System.out.println("Jenis Kelamin : " + jkel);
        
        
        
        // TODO code application logic here
    }
    
}
