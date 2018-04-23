/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul5;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Anggara Diebrata
 */
public class inout {
    
    public String name;
    String tambah ="Y";
    int i = 0;
    String men[] = new String [100];
    double hargamkn[] = new double [100];
    int qty[] =new int [100] ;        
    double totalmnm[] = new double [100];
    double hargatotal;
    double bayar;
    double kembalian;
     
   public inout(){
       Scanner key= new Scanner(System.in);
       BufferedReader pesanlagi = new BufferedReader (new InputStreamReader (System.in));
       System.out.print("Order atas nama : ");
       name = key.next();
      
       while(tambah.equals("Y")|| tambah.equals("y"))
       {
       System.out.println("");
       System.out.print("Pilihan Menu (1-7) : ");
       int menu = key.nextInt();
       if (menu==1){
        men[i] = "Macaroon";
        hargamkn[i] = 15000;
    } else if (menu==2){
        men[i] = "Red Velvet Slice";
        hargamkn [i] = 18000;
    } else if (menu==3){
        men[i] = "Fruits Salad";
        hargamkn[i] = 20000;
    } else if (menu==4){
        men[i] = "Fish & Chips";
        hargamkn[i] = 30000;
    }
    else if (menu==5){
        men[i] = "Americano";
        hargamkn[i] = 14000;
    } else if (menu==6){
        men[i] = "Sparkling Water";
        hargamkn[i] = 7000;
    } else if (menu==7){
        men[i] = "Fresh Juice";
        hargamkn[i] = 10000;
    } else if (menu==8){
        men[i] = "Espresso";
        hargamkn[i] = 8000;
    }else {
        System.out.println("Maaf menu yang anda pesan tidak ada");
        men[i] = "Tidak ada";
    }
        System.out.println("Menu yang anda pesan : "+men[i]);
           System.out.println("Harga satuan : Rp." +hargamkn[i]);
           System.out.print("Banyak : ");
           qty[i] = key.nextInt();
           totalmnm[i] = hargamkn[i]*qty[i];
           System.out.println("Total        : Rp."+totalmnm[i]);
           System.out.print("Ingin tambah pesanan lagi? [Y/N]: ");
           try{
              tambah = pesanlagi.readLine(); 
           }catch (IOException e){
               System.out.println("Gagal membaca keyboard");              
           }
           i++;   
   }
       System.out.println("");
       System.out.println("************");
       System.out.println("Data Pesanan");
       System.out.println("************");
       System.out.println("Pesanan atas nama : "+name);
       System.out.println("");
   for (int a =0; a<i;a++){
            System.out.println(men[a]+ " " + qty[a]);
        }
        System.out.println("");
        for (int b =0; b<i;b++){
            hargatotal = hargatotal + totalmnm[b];            
        }
        System.out.println("Total yang harus anda bayar adalah : Rp." +hargatotal);
        System.out.print("Uang yang di bayarkan : Rp.");
        bayar = key.nextDouble();
        kembalian = bayar-hargatotal;
        System.out.println("Kembalian : Rp"+kembalian);
        System.out.println("********************************************************");
    }
      
}
