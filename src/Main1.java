/**
 * Created by IntelliJ IDEA.
 * Project : desktop
 * User: muhammadlaililmahfud
 * Email: laililmahvut@gmail.com
 * Telegram : @LaililMahfud
 * Date: 20/12/2021
 * Time: 13:08
 * To change this template use File | Settings | File Templates.
 */
public class Main1 {
    public static void main(String[] argh) //[1]
    {
        double waktu; //[2]
        int jarakTempuh, kecepatan, ubahWaktu, jarak, k;
        int totalJam, totalMenit, totalDetik, modWaktu;

        jarak = 444; //[3]
        k = 80; //[4]

        // start [5]
        // Ubah jarak dan k
        jarakTempuh = jarak * 1000;
        kecepatan   = k * 1000;

        waktu       = jarakTempuh / ((double) kecepatan / 3600);
        ubahWaktu  = (int) waktu; // jadikan int

        modWaktu    = ubahWaktu % 3600; // cari sisa bagi
        totalJam    = (ubahWaktu - modWaktu) / 3600; // hitung untuk jam
        totalMenit  = (modWaktu - modWaktu % 60) / 60; // hitung untuk menit
        // end [5]

        System.out.printf("Jarak (km): %d \n", jarak);
        System.out.printf("Kecepatan (km/jam): %d\n", k);
        System.out.println("\nWaktu tempuh yang dibutuhkan:");
        System.out.printf("%d jam %d menit%n", totalJam, totalMenit);
    }
}
