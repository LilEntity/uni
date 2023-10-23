package uni_projects;

// import java.util.ArrayList;
// import java.util.Iterator;

public class PercobaanArrayList {
    public static void main(String[] args) {

        double[][] suhuPalembang = new double[4][7];
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};

        int minggu = suhuPalembang.length;
        int hari = suhuPalembang[0].length;

        for (int i=0; i<hari; ++i) {
            suhuPalembang[0][i] = 30;
        }
        for (int i=0; i<hari; ++i) {
            suhuPalembang[1][i] = 31 + i;
        }
        for (int i=0; i<hari; ++i) {
            suhuPalembang[2][i] = 31 - 1.25 * i;
        }
        for (int i=0; i<hari; ++i) {
            if (i<4) {
                suhuPalembang[3][i] = 30 - 2.125 * i;
            }
            else {
                suhuPalembang[3][i] = suhuPalembang[3][i-1] + 2 + 0.125 * i;
            }
        }

        for (int i=0; i<hari; ++i) {
            System.out.print(namaHari[i] + "\t");
        }

        System.out.println();

        for (int i=0; i<minggu; ++i) {
            for (int j=0; j<hari; ++j) {
                System.out.print(suhuPalembang[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
