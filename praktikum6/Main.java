/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        Hewan kucing = new Hewan();
        kucing.bersuara();         // Output: Hewan bersuara
        kucing.makan("ikan");      // Memanggil metode makan() dari kelas Hewan
        kucing.makan(" ikan", 3);   // Memanggil metode makan() yang overloaded
        System.out.println();
        
        Hewan hewan = new Kucing();
        hewan.bersuara();               // Output: meowwww
        
        Kucing meong = new Kucing();
        meong.makan("ikan");            // Memanggil metode makan() dari kelas Hewan
        meong.makan(" ikan", 3);         // Memanggil metode makan() yang overloaded
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.bersuara();              // Outpur: Guk Guk Guk
        anjing.makan(" daging", 3);      // Memanggil metode makan() yang overloaded
    }
}
