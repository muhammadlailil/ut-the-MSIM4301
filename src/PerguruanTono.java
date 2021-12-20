import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Project : desktop
 * User: muhammadlaililmahfud
 * Email: laililmahvut@gmail.com
 * Telegram : @LaililMahfud
 * Date: 20/12/2021
 * Time: 13:18
 * To change this template use File | Settings | File Templates.
 */
public class PerguruanTono {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai tono : ");
        int nilaiTono  = scan.nextInt();
        String perguruanTinggi = "";
        if (nilaiTono>=81){
            perguruanTinggi = "PT A";
        }else if (nilaiTono >= 71 && nilaiTono <= 80){
            perguruanTinggi = "PT B";
        }else if (nilaiTono >= 61 && nilaiTono <= 70){
            perguruanTinggi = "PT C";
        }else if (nilaiTono<=60){
            perguruanTinggi = "PT D";
        }
        System.out.println("Dengan nilai "+nilaiTono+", Tono akan diterima di "+perguruanTinggi);
    }
}
