package uni_assignments.sem_1;

class Persegi {
    private double sisi;
    private double luas;
    private double keliling;

    // Set sisi persegi dapat dilakukan dengan konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
        hitungKeliling();
        hitungLuas();
    }

    public double getSisi() {
        return this.sisi;
    } public void setSisi(double sisi) {
        this.sisi = sisi;
        hitungKeliling();
        hitungLuas();
    }

    public double getLuas() {
        return this.luas;
    } public double getKeliling() {
        return this.keliling;
    }

    private void hitungLuas() {
        this.luas = sisi * sisi;
    } private void hitungKeliling() {
        this.keliling = 4 * sisi;
    }
}

public class Modul10 {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(7);
        System.out.println(P1.getSisi());
        System.out.println(P1.getLuas());
        System.out.println(P1.getKeliling());

        // Terjadi floating point error dalam kalkulasi perkalian dua double
        P1.setSisi(12.3);
        System.out.println(P1.getSisi());
        System.out.println(P1.getLuas());
        System.out.println(P1.getKeliling());
    }
}
