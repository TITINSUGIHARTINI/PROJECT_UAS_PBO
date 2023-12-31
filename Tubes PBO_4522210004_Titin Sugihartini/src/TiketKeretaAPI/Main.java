package TiketKeretaAPI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kode;
        String keberangkatan;
        String jam;
        int harga = 120000;
        Scanner input = new Scanner(System.in);
        Tiket user = new Tiket();
        System.out.println("Pemesanan Tiket Kereta Api");
        System.out.println("Masukkan Nama           :");
        String nama = input.next();
        System.out.println("Masukkan Nomor Telepon  :");
        String nomor = input.next();

        user.setName(nama);
        user.setTelepon(nomor);

        System.out.println("Pilihan Keberangkatan :");
        System.out.println("1. Manggarai ");
        System.out.println("2. Pasar Senen");
        System.out.println("3. Gambir ");
        System.out.print("Masukkan pilihan :");
        int a = input.nextInt();
        if (a == 1) {
           keberangkatan  = "M4994r41";
        } else if (a == 2) {
            keberangkatan = "P454r 53n3n";
        } else {
            keberangkatan = "64m31r";
        }

        System.out.println("Pilihan Tujuan :");
        System.out.println("1. Jakarta ");
        System.out.println("2. Yogya");
        System.out.println("3. Bandung ");
        System.out.print("Masukkan pilihan :");
        int c = input.nextInt();
        if (c == 1) {
            kode = "74k4rt4";
        } else if (c == 2) {
            kode = "Y09y4";
        } else {
            kode = "34nd03n9";
        }

        Kereta kereta = new Kereta("Argo Dwipangga"); // Ganti dengan nama kereta yang sesuai
        Gerbong gerbong1 = new Gerbong("Gerbong Eksekutif");
        Gerbong gerbong2 = new Gerbong("Gerbong Ekonomi");
        System.out.println("Pilih Gerbong:");
        System.out.println("1. " + gerbong1.getNama());
        System.out.println("2. " + gerbong2.getNama());
        System.out.print("Masukkan pilihan gerbong: ");
        int pilihanGerbong = input.nextInt();

        if (pilihanGerbong == 1) {
            kereta.addGerbong(gerbong1);
        } else if (pilihanGerbong == 2) {
            kereta.addGerbong(gerbong2);
        } else {
            System.out.println("Pilihan gerbong tidak valid.");
            return;
        }

        System.out.println("Pilihan Jam Keberangkatan");
        System.out.println("1.  15:00");
        System.out.println("2.  18:00");
        System.out.println("3.  21:00");
        System.out.print("Masukkan Pilihan :");
        int b = input.nextInt();
        if (b == 1) {
            jam = "15:00";
        } else if (b == 2) {
            jam = "18:00";
        } else {
            jam = "20:00";
        }
        user.setKode(kode);
        user.setKeberangkatan(keberangkatan);
        user.setWaktu(jam);
        user.setHarga(harga);

        System.out.println("=======================PEMESANAN==========================");
        System.out.println("==========================================================");
        System.out.println(" Costumer Nama \t\t: " + user.getName());
        System.out.println(" Costumer Phone\t\t: " + user.getTelepon());
        System.out.println("==========================================================");
        System.out.println("Kode Keberangkatan  \t\t: " + user.getKeberangkatan());
        System.out.println("Kode Tujuan         \t\t: " + user.getKode());
        System.out.println("Info Gerbong        \t\t: " + kereta.displayInfoGerbong(pilihanGerbong));
        System.out.println("Jam Berangkat       \t\t: " + user.getWaktu());
        System.out.println("Harga Tiket         \t\t: " + user.getHarga() + "Rupiah");
        System.out.println("===========================================================");
        System.out.println("\n");
    }
}
