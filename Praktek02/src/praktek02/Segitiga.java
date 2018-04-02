
package praktek02;

public class Segitiga {
    double alas;
    double tinggi;
    
    void cetakinfo(){
        System.out.println("alas : "+alas);
        System.out.println("tinggi : "+tinggi);
       
    }
    
    double hitungluas(){
        double luas;
        luas=1/2*alas*tinggi;
        return luas;
    }
}
