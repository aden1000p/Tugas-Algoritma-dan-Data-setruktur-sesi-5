public class NIlaiMahasiswa{
    public static void main(String[] args){
        // Membuat daftar nilai siswa
        // seorang dosen menyimpan nilai kuis 5 mahasiswa dalam array. 
        // 1. buat array int untuk menyimpan lima nilai : 80, 75, 90, 65, dan 85

        int array[] = {80, 75, 90, 65, 85};
        // 2. tampilkan seluruh nilai menggunakan perulangan 
        System.out.println("tampilkan seluruh nilai menggunakan perulangan");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        // 3. tampilkan nilai mahasiswa pada indeks ke -2. 
        System.out.println("Tampilkan nilai mahasiswa pada indeks ke - 2");
        System.out.println(array[2]); 

        // 4. jelaskan perbedaan indeks array dengan urutan mahasiswa. 
        // indeks array = untuk mengakses data dari 0 sampai ke N 
        // urutan mahasiswa = untuk mengurutkan nilai mahasiswa dari terkecil dan terbesar 
        
    }
}