package uni_assignments.sem_2.prokomlan.uts;

public class Krayon {
    String[] warnaku;
    String[] temp;
    int length;

    Krayon() {
        this.warnaku = new String[]
        {"merah", "kuning", "kelabu", "merah muda", "biru"};
        this.temp = new String[]
        {"merah", "kuning", "kelabu", "merah muda", "biru"};
        this.length = warnaku.length;
    }

    public void tampilkanWarna() {
        int i;
        for (i=0; i<length-1; i++) {
            System.out.print(warnaku[i] + ", ");
        }
        System.out.println(warnaku[i]);
    }

    public void lagu() {
        if (length == 0) {
            System.out.println("Warna Habis");
            warnaku = temp;
            length = warnaku.length;
        }
        else {
            System.out.print("Krayonku ada ");
            System.out.println(length);
            tampilkanWarna();
            String[] warnaBaru = new String[length-1];
            for (int i=1; i<length; i++) {
                warnaBaru[i-1] = warnaku[i];
            }
            warnaku = warnaBaru;
            length--;
            System.out.print("Krayonku tinggal ");
            System.out.println(length);
        }
    }

    public static void main(String[] args) {
        Krayon k = new Krayon();
        k.tampilkanWarna();

        for (int i=0; i<=5; i++) {
            k.lagu();
        }

        k.tampilkanWarna();
    }
}
