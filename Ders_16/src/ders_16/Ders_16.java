/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders_16;

import java.util.Scanner;

/**
 *
 * @author Barış Adsız
 */
public class Ders_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in, "ISO-8859-9");
        System.out.print("Coğrafi Bölgenizi Giriniz: ");
        String bolge = input.nextLine();
        
        switch(bolge){
            case "Marmara":
                System.out.println("Marmara bölgesi için yatacak burs miktarı 600 TL/Ay");
                break;
            case "Ege":
                System.out.println("Ege bölgesi için yatacak burs miktarı 500 TL/Ay");
                break;
            case "Karadeniz":
                System.out.println("Karadeniz bölgesi için yatacak burs miktarı 400 TL");
                break;
            case "Doğu Anadolu":
                System.out.println("Doğu Anadolu bölgesi için yatacak burs miktarı 400 TL");
                break;
            case "İç Anadolu":
                System.out.println("İç Anadolu bölgesi için yatacak burs miktarı 500 TL");
                break;
            case "Akdeniz":
                System.out.println("Akdeniz bölgesi için yatacak burs miktarı 500 TL");
                break;
            case "Güneydoğu Anadolu":
                System.out.println("Güneydoğu Anadolu bölgesi için yatacak burs miktarı 400 TL");
                break;
            default :
                System.out.println("Geçerli bir bölge giriniz veya girdiğiniz bölgenin ilk harfini büyük yazınız!");
        }
    }
    
}
