import java.util.*;
public class konstruktor {
        int harga = 950;
        int jumlah;
        int total;
    
        public konstruktor (){
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukan jumlah tusuk sate = ");
            jumlah = scan.nextInt();
            this.total =this.harga * this.jumlah;
            System.out.print("Total harga yang harus dibayar adalah Rp. " +total);
            
    }

public static void main(String[] args){
    new konstruktor();

}
}
