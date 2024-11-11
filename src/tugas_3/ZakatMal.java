/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_3;

/**
 *
 * @author userh
 */
public class ZakatMal {
    private double totalHarta;
    private double zakat;

    public ZakatMal() {
        this.totalHarta = 0;
        this.zakat = 0;
    }

    public void hitungZakat(int pilihan, double jumlah) {
        switch (pilihan) {
            case 1 -> // Uang
                totalHarta = jumlah;

            case 2 -> // Emas
                totalHarta = jumlah * 1_000_000; 

            case 3 -> // Perak
                totalHarta = jumlah * 16_000;

            default -> {
                System.out.println("Pilihan tidak valid!");
                totalHarta = 0;
            }
        }
        zakat = totalHarta * 0.025;
    }

    public double getZakat() {
        return zakat;
    }

    public double getSisaHarta() {
        return totalHarta - zakat;
    }
}