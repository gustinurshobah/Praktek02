
package praktek02;

public class Segitiga {
    double alas;
    double tinggi;

    public Segitiga() {
        alas=2;
        tinggi=5;
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    
    
    void cetakinfo(){
        System.out.println("alas : "+alas);
        System.out.println("tinggi : "+tinggi);
       
    }
    
    double hitungluas(){
        double luas;
        luas=1/2*alas*tinggi;
        return luas;
    }
    
    void cetakluas(){
        System.out.println("Luasnya adalah: "+hitungluas());
    }
}
