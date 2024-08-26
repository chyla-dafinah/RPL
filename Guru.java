public class Guru {
    int nip;
    String nama;
    String mapel;
    String status;

    public Guru(int i, String n, String m, String s) {
        nip = i;
        nama = n;
        mapel = m;
        status = s;
    }

    public void print() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("MAPEL : " + mapel);
        System.out.println("STATUS : " + status);
    }
}