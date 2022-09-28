/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.buffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WINDOWS 10
 */
public class TugasBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String nama;
        int usia;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Masukan Nama : ");
        nama = br.readLine();
        System.out.println("Masukan Usia : ");
        usia = Integer.parseInt(br.readLine());
        
        
        System.out.println("Namamu adalah : " + nama);
        System.out.println("Usiamu : " + usia);
        
        
        // TODO code application logic here
    }
    
}
