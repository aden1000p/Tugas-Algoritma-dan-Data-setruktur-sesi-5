public class PersediaanBarang {
    public static void main(String[] args){
        // sebuah toko mencatat 4 stok produk dalam array berikut: 
        int stock[] = {12, 8, 15, 6};
        
        for (int i = 0; i < stock.length; i++){
            System.out.print(stock[i]+ " ");
        }

        // 1. tampilkan stok produk pertama dan terakhir.
        System.out.println("Stok produk pertama : " + stock[0]);
        System.out.println("Stop produk Terakhir : " + stock[3]);

        // 2. tampilkan stok produk kedua menjadi 10; 
        stock[1] = 10;
        // 3. Tampilkan stok setelah perubahan
        for (int i = 0; i < stock.length; i++){
            System.out.print(stock[i]+ " ");
        }
        // 4 apa yang terjadi jika  proram mengakses stock[4]
        // jawaban jika mengakses stock 4 maka hasilnya akan error karena
        // tidak ada valuenya kan di dalam array meskipun ada 4 tapi indeksnya
        // hanya mengakses 0 sampai 3 jika ingin paling terakhir ketik saja 3
        



    }
}
