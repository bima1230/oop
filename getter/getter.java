import java.util.*;
public class getter{
    private int harga ;
    private int jumlah;

    public getter(int harga, int jumlah){
        this.harga = harga ;
        this.jumlah = jumlah;
    }
    public int getharga(){
        return harga;
    } 
    public void setharga(int harga){
        this.harga = harga;
    }
    public int getjumlah(){
        return jumlah;
    }
    public void setjumlah(int beli){
        this.jumlah = jumlah;
    }
    public void infosate(){
        System.out.println("Harga 1 sate = " +harga);
        System.out.println("Jumlah sate yang dibeli = " +jumlah);
        System.out.println("Harga yang harus dibayar = " +jumlah*harga);
        System.out.println("");

    }
    public static void main(String[] args){
        getter sate = new getter(950, 12);
        sate.setharga(950);
        sate.setjumlah(12);
        sate.infosate();
    }
}