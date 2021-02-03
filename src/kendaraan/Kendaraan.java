
package kendaraan;

import java.util.Scanner;


public class Kendaraan {
    //Method
    static void input(){
    //Scanner dengan variabel input
    Scanner  input=new Scanner(System.in);
    //Tipe data dan variabel
    String jenis;
    String Merek;
    String warna;
    int Plat;
        //Pelaksanaan Scanner(input oleh user)
        System.out.println("Masukan jenis kendaraan : ");
        jenis = input.nextLine();
        System.out.println("Masukan merek kendaraan : ");
        Merek=input.nextLine();
        System.out.println("Masukan warna kendaraan : ");
        warna = input.nextLine();
        System.out.println("Masukan nomor plat kendaraan : ");
        Plat=input.nextInt();
        //Menampilkan output dari masukan user
        System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>");
        System.out.println("Jenis kendaraan anda adalah : "+jenis);
        System.out.println("Merek kendaraan anda adalah : "+Merek);
        System.out.println("Plat nomor anda adalah : "+Plat);
        System.out.println("Warna kendaraan anda adalah : "+warna);
}
}
