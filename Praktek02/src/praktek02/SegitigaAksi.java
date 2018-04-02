
package praktek02;

public class SegitigaAksi {
    public static void main(String[] args) {
        Segitiga s1= new Segitiga();
        
        s1.alas = 2;
        s1.tinggi = 5;
        
        s1.cetakinfo();
        System.out.println("Luas Segitiga = "+s1.hitungluas());
        s1.cetakluas();
    }
    
}
