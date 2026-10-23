public class AnalisisNilaiUjian{
    public static void main(String[] args) {
        // nilai 8 mahasiswa adalah {75, 80, 65, 90, 55, 85, 70, 95}
        // Hitung rata_rata nilai. 
        // Tampilan data 
        System.out.println("tampilkan data");
        int NilaiMahasiswa[]  = {75, 80, 65, 90, 55, 85, 70, 95};
        for (int i = 0; i < NilaiMahasiswa.length; i++){
            System.out.println(NilaiMahasiswa[i] + " ");
        }
        // 1. Hitung Rata-rata nilai. 
        System.out.println("1. Hitung Rata_rata Nilai");
        int Count = 0;
        for (int IndexNumber = 0; IndexNumber < NilaiMahasiswa.length; IndexNumber++){
            Count += NilaiMahasiswa[IndexNumber];
        }
        int Rata_rata = Count / NilaiMahasiswa.length;
        System.out.println("Rata_rata dari nilai mahasiswa: " + Rata_rata);

        // 2. Tampilkan Nilai yang lebih besar dari rata_rata. 
        System.out.println("2. Tampilkan nilai lebih besar dari rata_rata");
        for (int i = 0; i < NilaiMahasiswa.length; i++){
            System.out.print(NilaiMahasiswa[i]  + " ");
            if (NilaiMahasiswa[i] >= Rata_rata){
                System.out.println("nilai tertinggi dari rata_rata adalah:  " + NilaiMahasiswa[i]);
            }
        }

        // 3. Hitung jumlah mahasiswa yang lulus dengan nllai minimal 70; 
        System.out.println("3. Hitung jumlah mahasiswa dengan nilai minimal 70");
        int JumlahMahasiswaKurangdari70 = 0;
        for (int i = 0; i < NilaiMahasiswa.length; i++){
            if (NilaiMahasiswa[i] <= 70){
                JumlahMahasiswaKurangdari70 += NilaiMahasiswa[i];
            }
        }
        System.out.println("Jumlah mahasiswa yang nilainya kurang dari 70 : " + JumlahMahasiswaKurangdari70);

        // 4. tampilkan presentase mahasiswa yang lulus 
        // presentase = jumlah lulus minimal 70 / keseluruhan nilai * 100 
        System.out.println("tampilkan presentase mahasiswa yang lulus");
        int JumlahMahasiswaLulus = 0;
        for (int i = 0; i < NilaiMahasiswa.length; i++){
            if (NilaiMahasiswa[i] >= 70){
                JumlahMahasiswaLulus += 1;
            }
        }

        double Presentase = (double) JumlahMahasiswaLulus / NilaiMahasiswa.length * 100;

        System.out.println("Presentase mahasiswa yang lulus: " + Presentase + "%");
    }
}