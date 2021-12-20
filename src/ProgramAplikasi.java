import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Project : desktop
 * User: muhammadlaililmahfud
 * Email: laililmahvut@gmail.com
 * Telegram : @LaililMahfud
 * Date: 20/12/2021
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */
public class ProgramAplikasi {
    private static Statement DB;

    public static void main(String[] args) throws SQLException {
        initconnectionDB();
        showMenu();
    }

    private static void showMenu() throws SQLException {
        Scanner scn = new Scanner(System.in);
        String optionMenu = "========= MENU UTAMA =========\n";
        optionMenu += "1. Insert Data\n";
        optionMenu += "2. Show Data\n";
        optionMenu += "3. Delete Data\n";
        optionMenu += "0. Keluar\n";
        optionMenu += "\n";
        optionMenu += "PILIHAN> ";
        System.out.print(optionMenu);
        int opt = scn.nextInt();
        switch (opt) {
            case 0:
                System.exit(0);
                break;
            case 1:
                insertData();
                break;
            case 2:
                showData();
                break;
            case 3:
                deleteData();
            default:
                System.out.println("Pilihan salah!");
        }
    }

    private static void insertData() throws SQLException {
        Scanner scn = new Scanner(System.in);
        String kode, nama, kategori;
        int stok, harga;
        System.out.println("1.  Insert Data");
        System.out.print("Masukkan kode : ");
        kode = scn.nextLine();
        System.out.print("Masukkan nama : ");
        nama = scn.nextLine();

        System.out.print("Masukkan kategori : ");
        kategori = scn.nextLine();

        System.out.print("Masukkan stok : ");
        stok = scn.nextInt();

        System.out.print("Masukkan harga : ");
        harga = scn.nextInt();

        String sql = "INSERT INTO `barang` (`id`, `kode`, `nama`, `kategori`, `stok`, `harga`) VALUES (NULL, '%s', '%s', '%s', '%s', '%s')";
        sql = String.format(sql, kode, nama, kategori, stok, harga);
        DB.execute(sql);
        System.out.println("Data barang berhasil dimasukkan !");
        showMenu();
    }

    private static void showData() throws SQLException {
        ResultSet rs = DB.executeQuery("select * from barang");
        String leftAlignFormat = "| %-4s | %-12s | %-20s | %-15s | %-10d | %-19d |%n";
        System.out.format("+------+--------------+----------------------+-----------------+------------+---------------------+%n");
        System.out.format("| ID   | Kode         | Nama                 | Kategori        | Stok       | Harga               |%n");
        System.out.format("+------+--------------+----------------------+-----------------+------------+---------------------+%n");
        while (rs.next()) {
            System.out.format(
                    leftAlignFormat,
                    rs.getInt("id"),
                    rs.getString("kode"),
                    rs.getString("nama"),
                    rs.getString("kategori"),
                    rs.getInt("stok"),
                    rs.getInt("harga")
            );
        }
        System.out.format("+------+--------------+----------------------+-----------------+------------+---------------------+%n");
        showMenu();
    }

    private static void deleteData() throws SQLException {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan ID Barang : ");
        int id = scn.nextInt();
        String sql = String.format("DELETE FROM barang WHERE id=%d", id);
        DB.execute(sql);
        System.out.println("Data barang berhasil dihapus !");
        showMenu();
    }

    private static void initconnectionDB() throws SQLException {
        try {
            String connection = "jdbc:mysql://localhost:3306/msim4301";
            String user = "root"; // user database
            String pass = ""; // password database
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection mysql = (Connection) DriverManager.getConnection(connection, user, pass);
            DB = mysql.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal koneksi");
        }
    }
}
