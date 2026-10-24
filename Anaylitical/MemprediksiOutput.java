public class MemprediksiOutput{
    public static void main(String[] args){
        int data[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < data.length; i++){
            data[i]= data[i] + data[data.length - 1 - i];
        }

        System.out.println(java.util.Arrays.toString(data));

         // 1. Apa output program 
        //  array awal adlaah {1, 2, 3, 4, 5} indeks array java dimulai dari 0. 
        // jadi indeksnya adalah 0, 1, 2, 3, 4 
        // kita bisa telusuri setiap iterasi 
        // kalau iterasinya 0 maka perhitungannya menjadi data[0] = 1 + 5 = 6 jadi perubahan arraynya adalah {6, 2, 3, 5, 6}
        // begitupun seterusnya sampai ke terakhir dan arraynya menjadi {6, 6, 6, 10, 11}

        // 2. apakah program menghasilkan pasnagan nilai yang simetris? 
        // tidak sepenuhnya karena pasangan simetris berada pada posisi yang berlawanan dari kedua ujung array: 
        // data[0] berpasangan dengan data[4] = 1 + 5 = 6
        // data[1] berpasangan dengan data[3]  = 2 + 4 = 6
        // data[2] berpasagan dengan diri sendiri = 3 + 3 = 6

        // jadi sehrarusnya kalau semua nya smiteris menjadi [6, 6, 6, 6, 6]
        // namun program menghaislkan [6, 6, 6, 10, 11] karena nilia array yang sudah diubah
        // digunakan kembali dalam perhitungan berikutnya. 


        // 3.mengapa perubahan elemen awal memengaruhi perhitungan elemen berikutnya? 
        // karena program mengubah array secara langsung melalui perintah: 
        // data[i] = data[i] + data[data.length - i]
        // artinya, nilai hasil perhitungan langsung di simpan ke dalam array data. 
        // contoh i = 0 dimana data[0]berubah menjadi 1 menjadi 6 
        // kalau i = 3 program membaca data[0]yang sudah bernilai 6 bukan satu 
        // i = 4 program membaca data[4] yagn sudah berubah menjadi 11 sebelumnya. 

        // 4.perbaikan agara setiap pasangan dihitung berdasarkan nilai awal array. 
        // nah cara paling masuk akal adana membuat salinan array sebelum melakkuan perhitunga; 
        int datas[] = {1, 2, 3, 4, 5};
        int awal[] = datas.clone();

        for (int i = 0; i < datas.length; i++){
            data[i] = awal[i] + awal[datas.length - 1 - i];
        }
        System.out.println(java.util.Arrays.toString(data));

        // outputnya menjadi [6, 6, 6, 6, 6]
    }

}