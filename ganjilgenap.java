import java.util.Scanner;

public class ganjilgenap { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

    System.out.println("=== Menentukan Bilangan Ganjil Genap === ");
    System.out.print("Masukan sebuah angka: ");
    int angka = input.nextInt();

    if (angka % 2 == 0){
        System.out.println(angka + " adalah bilangan genap. ");
    } else {
        System.out.println(angka + " adalah bilangan ganjil. ");
 }

 input.close();
 }
}