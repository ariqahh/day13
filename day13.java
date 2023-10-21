package perulanggan_looping;

import java.util.Scanner;

public class Perulanggan_looping {

    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Perulangan hitung mundur");
        int awal,akhir;
        System.out.print("awal : ");
        awal = java.nextInt();
        System.out.print("akhir : ");
        akhir = java.nextInt();
        if(akhir > awal){
            System.out.println("Input tidak valid");  
        }else{
                int b = awal;
                while(b >= akhir){
                System.out.print(b+" ");
                b--;
        
        }
           System.out.println(" "); 
       
        }
     }   
        
    }
    

