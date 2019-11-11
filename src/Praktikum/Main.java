package Praktikum;
import java.util.Scanner;
public class Main {
    static void Kegiatan1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Deret Fibonanci : ");
        int n = scan.nextInt();
        int fib[] = new int[n];

        fib[0] = 0;
        fib[1] = 1;
        //untuk menginisialisasikan nilai dari index 0 adalah 0 dan nilai dari index 1 adalah 1

        for (int i = 2; i < n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < n ; i++){
            System.out.println(fib[i]+" ");
        }
    }

    static int faktorial(int num){
        if(num == 0){
            //cek kondisi jika variabel num adalah 0 dan mengembalikan nilai 1
            return 1;
        }
        return num*faktorial(num-1);
        //melakukan rekursif dengan nilai num dibalikkan dengan hasil faktorial num-1
    }

    static void Kegiatan2(){
        int bilangan, hasil;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkin Bilangannya beb : ");
        bilangan = scan.nextInt();
        hasil = faktorial(bilangan);

        System.out.println("Faktorial dari "+bilangan+" adalah "+hasil);
    }

    static void mains(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Pilih Beb : " +
                "\n1. Kegiatan 1" +
                "\n2. Kegiatan 2" +
                "\n>>>>>> ");

        int inp = scan.nextInt();
        switch (inp){
            case 1:
                Kegiatan1();
                break;
            case 2:
                Kegiatan2();
                break;
            default:
                System.out.println("Cuma dua sayang pilihannya");
        }
        System.out.print("\nMaw Lagi beb ? Y/N >>> ");
        String maneh = scan.next();
        if(maneh.equals("Y") || maneh.equals("y")){
            mains();
        }else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        mains();
    }
}
