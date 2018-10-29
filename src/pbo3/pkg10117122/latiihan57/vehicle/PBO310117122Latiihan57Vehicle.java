/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latiihan57.vehicle;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldinon Senda Seni
 * NIM   : 101171222
 * Kelas : IF-3
 * Deskripsi Program : Program ini berisi program untuk menampilkan deskripsi 
 *                     tentang macam-macam sepeda, dengan konsep pendekatan 
 *                     berbasis objek.
 */
public class PBO310117122Latiihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4fx");
        System.out.println("Brand : " + bicycle.getMyBrand());
        System.out.println("Model : " + bicycle.getMyModel());
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());
        
        Skateboard skateboard = new Skateboard();
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        System.out.println("Brand : " + skateboard.getMyBrand());
        System.out.println("Model : " + skateboard.getMyModel());
        System.out.println("Panjangnya Board : "+skateboard.getMyBoardLength());
        
        System.out.println("\n(Developed By : Bonaventura Aldino Senda Seni)");
    }
    
}
