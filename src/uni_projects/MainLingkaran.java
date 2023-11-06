package uni_projects;

class Lingkaran {
    private double jarijari;

    public double getJariJari() {
        return this.jarijari;
    } public void setJariJari(double newJariJari) {
        if (newJariJari > 0) this.jarijari = newJariJari;
    }

    public double hitungLuasLingkaran() {
        return Math.PI * jarijari * jarijari;
    } public double hitungKelilingLingkaran() {
        return 2 * Math.PI * jarijari;
    }

    /*
     * setJarijari – mengganti nilai jari-jari dengan nilai baru
     * hitungLuasLingkaran – menghitung luas lingkaran
     * hitungKelilingLingkaran – menghitung keliling lingkaran
     */
}

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaranKecil = new Lingkaran();
        Lingkaran lingkaranBesar = new Lingkaran();

        lingkaranKecil.setJariJari(4);
        lingkaranBesar.setJariJari(10);

        System.out.println(lingkaranKecil.hitungLuasLingkaran());
        System.out.println(lingkaranKecil.hitungKelilingLingkaran());
        System.out.println(lingkaranBesar.hitungLuasLingkaran());
        System.out.println(lingkaranBesar.hitungKelilingLingkaran());
    }
}
