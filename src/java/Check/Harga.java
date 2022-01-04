/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Check;
import java.io.Serializable;
/**
 *
 * @author Dedi Wardani
 */
public class Harga {
    String s;
    
    public void setsatu(String masukan){
        this.s = masukan;
    }
    public String getsatu(){
       // return "makanan yang anda pesan adalah : " + this.s;
       String hasil; 
       if (null == this.s)
       {
           hasil = "Bukan Bangun datar";
       }
       else switch (this.s) {
            case "persegi":
            case "Persegi":
                hasil = "Rumus Luas persegi adalah Sisi * Sisi";
                break;
            case "segitiga":
            case "Segitiga":
                hasil = "Rumus Luas Segitiga adalah 1/2 * Alas * Tinggi";
                break;
            case "persegi panjang":
            case "persegi Panjang":
                hasil = "Rumus Luas Persegi Panjang adalah Panjang * Lebar";
                break;
            default:
                hasil = "Bukan Bangun datar";
                break;
        }
       return hasil;
    }
}
