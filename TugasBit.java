/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.bit;

/**
 *
 * @author WINDOWS 10
 */
public class TugasBit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3, b = 4, c;
        c = a & b;
        System.out.println("a AND b = " + c);
        c = a | b;
        System.out.println("a OR b = " + c);
        c = a ^ b;
        System.out.println("a X OR b = " + c);
        c = ~a;
        System.out.println("NOT a X OR b = " + c);
        c = a << 2;
        System.out.println("a geser ke kiri + " + c);
        c = a >> 2;
        System.out.println(" a geser ke kanan = " + c);
        
        
        // TODO code application logic here
    }
    
}
