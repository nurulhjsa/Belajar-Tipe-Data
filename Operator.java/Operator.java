public class Operator{
    public static void main(String[] args){
        // Penjumlahan langsung
        Integer value = 20 + 22;
        System.out.println("Jumlah 20 + 22 = " +value);

        //Penjumlahan antar value
        Integer value1 = 10;
        Integer value2 = 12;
        System.out.println("Jumlah 10 + 12 = " +(value1 + value2));

        //Pengurangan langsung
        Integer valueKurang = 22-20;
        System.out.println("Jumlah 22 - 20 = " +valueKurang);

        //Pengurangan antar value
        System.out.println("Jumlah 12 - 10 = " +(value2 - value1));

        //Perkalian antar value
        System.out.println("Jumlah 10 x 12 = " +(value1 * value2));

        //Pembagian langsung
        Integer valueBagi = 60/2;
        System.out.println("Jumlah 60 / 2 = " +valueBagi);
    
        //Perbandingan
        Integer test = 10 - 20;
        System.out.println("Apakah 10 + 20 hasilnya -10 ? " +(test == -10));
    }
}