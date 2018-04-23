/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul5;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Anggara Diebrata
 */
public class proses {
    String namakasir;
    int lay;
    String id;
    String nomor;
    String menu;
    
    public proses(){
        System.out.println("");
    }
    public proses (String namakasir, String id){
        this.namakasir=namakasir;
        this.id=id;
    } 
    public String data(){
        return "Nama Kasir  : "+ namakasir+"\nEmployee ID : "+id;
    }
    public void nomoradu(){
        System.out.println("Apabila ada keluhan atas pelayanan kami, silahkan hubungi:");
        System.out.println("081234567891");
    }
    public void menucafe(){
        System.out.println("----------------------------------");
        System.out.println("|           Siska's Cafe         |");
        System.out.println("----------------------------------");
        System.out.println("|      Daftar Menu Makanan       |");
        System.out.println("|1. Macaroon                15K  |");
        System.out.println("|2. Red Velvet Slice        18K  |");
        System.out.println("|3. Fruit Salad             20K  |");
        System.out.println("|4. Fish & Chips            30K  |");
        System.out.println("|      Daftar Menu Minuman       |");
        System.out.println("|5. Americano               14K  |");
        System.out.println("|6. Sparkling Water         7K   |");
        System.out.println("|7. Fresh Juice             10K  |");
        System.out.println("|8. Espresso                8K   |");
        System.out.println("----------------------------------");  
        System.out.println("");
    }
    public void layanan(int layanan){
        
        Scanner inp = new Scanner (System.in);
        System.out.println("Kualitas Layanan : ");
        System.out.println("1. Buruk sekali");
        System.out.println("2. Buruk");
        System.out.println("3. Cukup");
        System.out.println("4. Baik");
        System.out.println("5. Baik Sekali");
        System.out.print("pilihan anda : ");
        lay = inp.nextInt();
        if (lay>2){
            System.out.println("Terimakasih atas Respon Anda :D");
    }else {
            System.out.println("Maaf atas ketidaknyamanan Anda :(");
        }
}
}