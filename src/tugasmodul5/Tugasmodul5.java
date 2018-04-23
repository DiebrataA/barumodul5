/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul5;
import java.util.Scanner;
import java. io.*;
/**
 *
 * @author Anggara Diebrata
 */
public class Tugasmodul5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println(" Hai, Selamat Datang di Cafe Kami ");
        System.out.println("");
        System.out.println("Berikut daftar Menu kami");
        proses func = new proses();
        func.menucafe();
        inout objek = new inout();  
        System.out.println("");
        proses one = new proses("Anggara Diebrata","21120117140008");
        System.out.println(one.data());
        func.layanan(1-5);
        System.out.println("");
        func.nomoradu();
        
        
        
       
      // TODO code application logic here
    }
    
}
