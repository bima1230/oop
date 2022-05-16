//default//
import java.util.*;
public class bimaap{
    public static void main(String[] args){
    int harga = 950, jumlah, total;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah tusuk sate = ");
        jumlah = scan.nextInt();

        total = jumlah * harga;
        System.out.println("Harga yang haruus dibayar adalah Rp."+total);
    }
    
}


