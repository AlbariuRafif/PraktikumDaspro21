import java.util.Scanner;

public class StudiKasus221 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = input.nextInt();

        System.out.print("Peringkat (1-3, 0 jika bukan juara): ");
        int peringkat = input.nextInt();

        System.out.print("Status pendanaan (YA/TIDAK): ");
        String statusPendanaan = input.next();

        String status;

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
                jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen >= 4) {
                    status = "Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap. Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Bukan juara 1-3. Dana penghargaan tidak diberikan.";
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            if (statusPendanaan.equalsIgnoreCase("YA")) {
                if (jumlahDokumen >= 4) {
                    status = "Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap. Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak lolos pendanaan. Dana penghargaan tidak diberikan.";
            }

        } else {
            status = "Kegiatan tidak memenuhi ketentuan.";
        }

        System.out.println("\n=== HASIL VALIDASI ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Kegiatan : " + jenisKegiatan);
        System.out.println("Dokumen  : " + jumlahDokumen);
        System.out.println("Peringkat: " + peringkat);
        System.out.println("Status   : " + status);

    }
}
