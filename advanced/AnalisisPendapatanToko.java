public class AnalisisPendapatanToko {
    public static void main(String[] args) {
        int[] data = {250, 300, 180, 420, 350, 300, 500, 150, 420, 380}; // ribuan Rp

        // 1. Total & rata-rata
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        double rata = (double) total / data.length;
        System.out.println("1. Total = " + total + ", Rata-rata = " + rata);

        // 2. Hari di atas rata-rata
        System.out.println("2. Di atas rata-rata:");
        for (int i = 0; i < data.length; i++) {
            if (data[i] > rata) {
                System.out.println("   Hari " + (i + 1) + " = " + data[i]);
            }
        }

        // 3. Modus (angka yang paling sering muncul)
        int[] hitung = new int[data.length]; // hitung[i] = berapa kali data[i] muncul
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    hitung[i]++;
                }
            }
        }
        int maxHitung = 0;
        for (int i = 0; i < data.length; i++) {
            if (hitung[i] > maxHitung) {
                maxHitung = hitung[i];
            }
        }
        System.out.println("3. Modus (muncul " + maxHitung + "x):");
        for (int i = 0; i < data.length; i++) {
            if (hitung[i] == maxHitung) {
                boolean sudahAda = false; // biar angka yang sama nggak dicetak 2x
                for (int j = 0; j < i; j++) {
                    if (data[j] == data[i]) {
                        sudahAda = true;
                    }
                }
                if (!sudahAda) {
                    System.out.println("   " + data[i]);
                }
            }
        }

        // 4. Dua hari tertinggi
        int pertama = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > data[pertama]) {
                pertama = i;
            }
        }
        int kedua = -1;
        for (int i = 0; i < data.length; i++) {
            if (i != pertama && (kedua == -1 || data[i] > data[kedua])) {
                kedua = i;
            }
        }
        System.out.println("4. Tertinggi 1: Hari " + (pertama + 1) + " = " + data[pertama]);
        System.out.println("   Tertinggi 2: Hari " + (kedua + 1) + " = " + data[kedua]);

        // 5. Hari yang lebih rendah dari hari sebelumnya
        int turun = 0;
        for (int i = 1; i < data.length; i++) { // mulai dari 1, bukan 0!
            if (data[i] < data[i - 1]) {
                turun++;
            }
        }
        System.out.println("5. Jumlah hari turun = " + turun);
    }
}