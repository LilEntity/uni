package uni_assignments;

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

    private void hitungKeliling() {
        this.keliling = 4 * sisi;
    } private void hitungLuas() {
        this.luas = sisi * sisi;
    }

    /* public void setLuas(double luas) {
        this.luas = luas;
        this.sisi = Math.sqrt(luas);
        this.keliling = sisi * 4;
    } public void setKeliling(double keliling) {
        this.keliling = keliling;
        this.sisi = keliling * 0.25;
        this.luas = sisi * sisi;
    } */
}

public class Modul10 {
    public static void main(String[] args) {
        Persegi P1;

        P1 = new Persegi(7);
        System.out.println(P1.getSisi());
        System.out.println(P1.getLuas());
        System.out.println(P1.getKeliling());

        P1.setSisi(12.3);
        System.out.println(P1.getSisi());
        System.out.println(P1.getLuas());
        System.out.println(P1.getKeliling());
    }
}
