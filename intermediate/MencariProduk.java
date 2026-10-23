import java.util.Scanner;

public class MencariProduk {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Sebuah toko memiliki kode produk {101, 105, 110, 115, 120, 125}. Program menerima satu kode produk dari pengguna.
        int array[] = {101, 105, 110, 115, 120, 125};

        // 1. cari apakah kode tersebut dalam array; 
        System.out.print("Masukan Kode produk anda: ");
        int Kode = input.nextInt();

        int index = 0;
        int diperiksa = 0;

        for (int i = 0; i < array.length; i++){
            diperiksa  += 1;
            if (array[i] == Kode){
                index += 1;
            }
        }

        if (index != 0){
            // 2.ika ditemukan, tampilkan indeksnya
            System.out.print("Kode ditemukan yang berada pada index " + index);
        }else{
            // 3.jika tidak ditemukan tmapilkan pesan bahwa produk tidak tersedia 
            System.out.print("maaf produk tidak tersedia");
        }

        // 4. htiung berapa kali diperiksa sebelum pencarian 
        System.out.print(" berapa kali diperiksa sebelum pencarian : " + diperiksa);

    }
}
