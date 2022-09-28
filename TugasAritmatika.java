/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.aritmatika;
import java.util.Scanner;


/**
 *
 * @author WINDOWS 10
 */
public class TugasAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int detik, jam, menit, sisa;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Konversi Waktu");
            System.out.println("--------------");
            System.out.println("Masukan nilai detik = ");
            detik = input.nextInt();
            
        }
        jam = detik / 3600;
        menit = (detik % 3600) / 60;
        sisa = (detik % 3600) - (menit * 60);
        System.out.println(jam + "jam" + "-" + menit + "menit" + "-" + sisa + "detik");
        // TODO code application logic here
    }
    
}
