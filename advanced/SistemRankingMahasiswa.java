public class SistemRankingMahasiswa {
    public static void main(String[] args){
        // sebuah kelas memiliki nilai ujian {78, 90, 65, 90, 85, 72, 95, 85}
        int nilai[] = {78, 90, 65, 90, 85, 72, 95, 85};

        // 1. urutkan nilai dari tertinggi ke terendah tanpa array sort.  
        for (int i = 0; i < nilai.length - 1; i++){
            for (int j = 0; j < nilai.length - 1 - i; j++){
                if (nilai[j] < nilai[j+1]){
                    int temp = nilai[j];
                    nilai[j] = nilai[j+1];
                    nilai[j+1] = temp;
                }
            }
        }

        System.out.println("\n");
        System.out.print("1. urutkan nilai dari tertinggi ke terendah tanpa array sort.");
        System.out.println("\n");

        for (int i = 0; i < nilai.length; i++){
            System.out.print(nilai[i] + " ");
        }

        // 2. tampilka tiga nilai tertinggi yang berbeda; 
        int jumlahUnik = 0;
        int sebelumnya = 0; 
        
        System.out.println("\n");
        System.out.print("2. tampilkan tiga nilai tertinggi yang berbeda");
        System.out.println("\n");
        
        for (int i = 0; i < nilai.length; i++){
            if (nilai[i] != sebelumnya){
                System.out.print(nilai[i] + " ");
                sebelumnya = nilai[i];
                jumlahUnik++;
            }

            if (jumlahUnik == 3){
                break;
            }
        }

        System.out.println("");
        // 3 dan 4 tampilkan peringkat setiap mahasiswa dan tangani nilai yang sama tanpa memberikan peringkat yang berbeda keapda mahasiswa yang nilainya identik; 
        System.out.println("3 dan 4 tampilkan peringkat setiap mahasiswa dan tangani nilai yang sama tanpa memberikan peringkat yang berbeda keapda mahasiswa yang nilainya identik ");
        int peringkat = 1; 
        for (int i = 0; i < nilai.length; i++){
            if (i > 0 && nilai[i] != nilai[i - 1]){
                peringkat = i + 1;
            }
            System.out.println(
                " Nilai " + nilai[i]+
                " Peringkat " + peringkat
            );
        }
    }
}