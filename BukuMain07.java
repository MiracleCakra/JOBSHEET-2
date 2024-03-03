public class BukuMain07 {
    public static void main(String[] args) {
        Buku07 bk1 = new Buku07();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        int totalHarga = bk1.hitungHargaTotal(8);
        System.out.println("Toal Harga: "+ totalHarga);
        double diskon = bk1.hitungDiskon(totalHarga);
        System.out.println("Diskon: "+ diskon);
        int hargaBayar = bk1.hitungHargaBayar(totalHarga,(int) diskon);
        System.out.println("Bayar: "+ hargaBayar);

        Buku07 bk2 = new Buku07("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        
        Buku07 bukuCakra = new Buku07("Laskar Pelangi", "Andrea Hinata", 534, 19, 290000);
        bukuCakra.terjual(9);
        bukuCakra.tampilInformasi();
    }
}