public class DebugingHitungRata_rata{
    public static void main(String[] args){
        // Perhatikan code berikut;
        int[] scores = {80, 70, 90, 60};
        int total = 0; 

        for (int i = 0; i <= scores.length - 1; i++){
            total += scores[i];
        }
        double average = total / scores.length;

        System.out.println(average);

        // 1. Apakah program berjalan dengan benar? jelaskan. 
        // dikarenakan array berukuran 4 sedangkan ketika di loop jadi mengaksesnya indeksnya 0 sampai 5
        // nah kan indeks 5 gak ada ya di dalam array maka akan mengakibatkan error berupa index 4 out of bounds for length 4 
        // 2. Tentukan seluruh masalah pada kode
        //      a. Terdapat Ukuran array yang tidak sesuai dengan akses indeksnya contoh seperti nomor 1
        // 3. perbaiki kode  agar menghasilkan rata_rata yang tepat
        //      mudah saja tinggal menambahkan -1 ke score.length menjadi score.length - 1 untuk menyesuaikan dengan indeks. 
        // 4. karena pada umumnya rata_rata itu tidak selalu Bilangan asli tapi pasti ada bilangan desimalnya sehingga mengapa ini menjadi penting. 
        // 5. Belum tentu karena Double saja sudah disarankan karena rata_rata tidak selalu bilangan asli. 
        
    }
}