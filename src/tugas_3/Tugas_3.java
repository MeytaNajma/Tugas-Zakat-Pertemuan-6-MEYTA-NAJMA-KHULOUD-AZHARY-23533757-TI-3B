package tugas_3;

import java.util.Scanner;

public class Tugas_3 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("      KALKULATOR ZAKAT MAL       ");
        System.out.println("=================================");

        while (true) {
            System.out.println("\nLengkapi Data Dibawah Ini");

            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            Donatur donatur = new Donatur(nama, alamat);

            System.out.println("\nPilih jenis harta:");
            System.out.println("1. Uang");
            System.out.println("2. Emas");
            System.out.println("3. Perak");
            System.out.print("Masukkan pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Masukkan jumlah harta yang dimiliki: ");
            double jumlah = scanner.nextDouble();
            scanner.nextLine();

            ZakatMal zakatMal = new ZakatMal();
            zakatMal.hitungZakat(pilihan, jumlah);
            
            System.out.println("\n------ Hasil Perhitungan Zakat ------");
            System.out.println("Nama: " + donatur.getNama());
            System.out.println("Alamat: " + donatur.getAlamat());
            System.out.println("Jumlah zakat yang harus dibayarkan: Rp. " + zakatMal.getZakat());
            System.out.println("Sisa harta setelah zakat: Rp. " + zakatMal.getSisaHarta());

            System.out.println("\n======================================================");

            System.out.print("Apakah Data Anda Sudah Benar? (y/t): ");
            String jawaban = scanner.nextLine().trim().toLowerCase();
            
            if (jawaban.equals("y")) {
                break;
            } else if (jawaban.equals("t")) {
                System.out.println("\n------ Perbarui Data Anda ------");

                System.out.print("Nama: ");
                String namaBaru = scanner.nextLine();
                donatur.setNama(namaBaru);

                System.out.print("Alamat: ");
                String alamatBaru = scanner.nextLine();
                donatur.setAlamat(alamatBaru);

                System.out.println("\n------ Data Donatur Telah Diperbarui ------");
                System.out.println("Nama: " + donatur.getNama());
                System.out.println("Alamat: " + donatur.getAlamat());
                System.out.println("Jumlah zakat yang harus dibayarkan: Rp. " + zakatMal.getZakat());
                System.out.println("Sisa harta setelah zakat: Rp. " + zakatMal.getSisaHarta());
            }
            
            System.out.print("\nApakah Data Ini Sudah Benar ? (y/t): ");
            jawaban = scanner.nextLine().trim().toLowerCase();

            if (jawaban.equals("y")) {
                break;
            }
        }

        System.out.println("\nTerima kasih, telah menggunakan kalkulator zakat mal!");
        scanner.close();
    }
}