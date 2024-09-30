/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        KeranjangBelanja customer = new KeranjangBelanja(3);
        
        customer.keranjangBelanja(new Buku("Bulan", 90000));
        customer.keranjangBelanja(new Elektronik("Kulkas", 3000000));
        customer.keranjangBelanja(new Pakaian("Jaket", 250000));
        
        customer.detailBarang();
        
        double totalHarga = customer.hitungHarga();
        System.out.println("Total harga sebelum diskon : " + totalHarga);
        double totalHargaDiskon = customer.hitungHargaDiskon();
        System.out.println("Total harga setelah diskon :" + totalHargaDiskon);
    }
    
}
