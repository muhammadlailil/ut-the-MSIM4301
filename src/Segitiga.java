/**
 * Created by IntelliJ IDEA.
 * Project : desktop
 * User: muhammadlaililmahfud
 * Email: laililmahvut@gmail.com
 * Telegram : @LaililMahfud
 * Date: 20/12/2021
 * Time: 13:43
 * To change this template use File | Settings | File Templates.
 */
public class Segitiga extends Matematika{
    public int alas;
    public int tinggi;

    @Override
    protected double luas() {
        return 0.5*alas*tinggi;
    }
}
