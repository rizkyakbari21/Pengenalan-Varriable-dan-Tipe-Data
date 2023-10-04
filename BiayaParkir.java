package biayaparkir;
import java.util.Scanner;
public class BiayaParkir { 
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        //Input Jenis Kendaraan (Motor/Mobil)
        System.out.print("Masukan Jenis Kendaraan (Motor/Mobil): ");
        String jenisKendaraan = input.nextLine().toLowerCase();
        
        //  Input Waktu Masuk Parkir (jam)
        System.out.print("Masukan Waktu Masuk Parkir(jam): ");
        int waktuMasuk = input.nextInt();
        
        //Input waktu keluar parkir (jam)
        System.out.print("Masukan waktu keluar parkir (jam): ");
        int waktuKeluar = input.nextInt();
        
        //Menghitung durasi parkir
        int durasiParkir = waktuKeluar - waktuMasuk;
        
        //Tarif Per jam
        int tarifMotor = 3000;
        int tarifMobil = 5000;
        
        //Menghitung biaya parkir
        int biayaParkir = 0;
        
        if (jenisKendaraan.equals("motor")) {
            biayaParkir = durasiParkir * tarifMotor;
        }else if (jenisKendaraan.equals("mobil")) {
            biayaParkir = durasiParkir * tarifMobil;            
        }else {
            System.out.println("Jenis kendaraan tidak valid");
            System.exit(1);
        }
        
        System.out.println("Biaya parkir untuk "+ jenisKendaraan +" selama "+ durasiParkir + "jam adalah: " + biayaParkir + " Rupiah ");
        input.close();
}}