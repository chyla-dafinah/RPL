//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = newConstructor();
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa bella  = new Siswa();
        Siswa kiya = new Siswa();
        Siswa aya = new Siswa();

        sabrina.id = 32;
        sabrina.nama = "Sabrina";
        sabrina.ipk = 85.7;
        rasyid.id = 30;
        rasyid.nama = "Rasyid";
        rasyid.ipk = 85.5;
        bella.id = 7;
        bella.nama = "Bella";
        bella.ipk = 86.5;
        kiya.id = 13;
        kiya.nama = "Kiya";
        kiya.ipk = 87.0;
        aya.id = 36;
        aya.nama = "Aya";
        aya.ipk = 89.9;

        sabrina.print();
        rasyid.print();
        bella.print();
        kiya.print();
        aya.print();
        
    }
}
