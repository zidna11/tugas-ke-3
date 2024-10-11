import java.util.Scanner;

public class lulustidaklulus {
     public static void main(String[] args) { Scanner scanner = new Scanner(System.in); System.out.println("=== Menentukan Lulus ===");

    System.out.print("Masukan nilai mahasiswa : ");
    double nilaiMahasiswa = scanner.nextDouble();

    String keterangan;

    if (nilaiMahasiswa >=75) {
        keterangan = "lulus";
    } else{
        keterangan = "Tidak lulus";
    }

    System.out.println("Keterangan : " + keterangan);

    scanner.close();
}
}
    

