package TiketKeretaAPI;

import java.util.ArrayList;
import java.util.List;

public class Kereta {
    private String nama;
    private List<Gerbong> gerbongs;

    public Kereta(String nama) {
        this.nama = nama;
        this.gerbongs = new ArrayList<>();
    }

    public void addGerbong(Gerbong gerbong) {
        gerbongs.add(gerbong);
    }

    public void displayInfo() {
        System.out.println("Info Kereta: " + nama);
        for (Gerbong gerbong : gerbongs) {
            gerbong.displayInfo();
        }
    }

    public String displayInfoGerbong(int pilihanGerbong) {
        if (pilihanGerbong >= 1 && pilihanGerbong <= gerbongs.size()) {
            return gerbongs.get(pilihanGerbong - 1).displayInfo();
        } else {
            return "Pilihan gerbong tidak valid.";
        }
    }
}
