/**
 * Created by IntelliJ IDEA.
 * Project : desktop
 * User: muhammadlaililmahfud
 * Email: laililmahvut@gmail.com
 * Telegram : @LaililMahfud
 * Date: 20/12/2021
 * Time: 13:42
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 13;
        persegiPanjang.lebar = 7;
        System.out.println(
                "Luas persegi panjang yang memiliki " +
                        "panjang " + persegiPanjang.panjang + " dan" +
                        " lebar " + persegiPanjang.lebar + " adalah " + persegiPanjang.luas()
        );

        System.out.println("===================================================================");

        Segitiga segitiga = new Segitiga();
        segitiga.alas = 8;
        segitiga.tinggi = 22;
        System.out.println(
                "Luas segitia yang memiliki " +
                        "alas " + segitiga.alas + " dan" +
                        " tinggi " + segitiga.tinggi + " adalah " + segitiga.luas()
        );
    }
}
