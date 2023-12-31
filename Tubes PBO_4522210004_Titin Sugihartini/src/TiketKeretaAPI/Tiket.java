package TiketKeretaAPI;

public class Tiket extends Customer {
    private String kode;
    private String keberangkatan;
    private int hargaTiket;
    private String jam;
    private String gerbong;

    public Tiket(String kode,String keberangkatan, int harga, String waktu, String gerbong) {
        super();
        this.kode = kode;
        this.keberangkatan = keberangkatan;
        this.hargaTiket = harga;
        this.jam = waktu;
        this.gerbong = gerbong;

    }

    public Tiket() {
    }


    public String getKode() {
        return kode;
    }
    public void setKode(String kd) {
        this.kode = kd;
    }

    public String getKeberangkatan(){
        return keberangkatan;
    }
    public void setKeberangkatan(String keberangkatan){
        this.keberangkatan = keberangkatan;
    }
    public String getGerbong() {
        return gerbong;
    }

    public void setGerbong(String gerbong) {
        this.gerbong = gerbong;
    }

    public int getHarga() {
        return hargaTiket;
    }

    public void setHarga(int hrg) {
        this.hargaTiket = hrg;
    }

    public String getWaktu() {
        return jam;
    }

    public void setWaktu(String waktu) {
        this.jam = waktu;
    }
}
