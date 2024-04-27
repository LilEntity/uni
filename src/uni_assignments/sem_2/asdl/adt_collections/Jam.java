package uni_assignments.sem_2.asdl.adt_collections;

public class Jam {
    private int jam, menit, detik;

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23)
        this.jam = jam;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59)
        this.menit = menit;
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59)
        this.detik = detik;
    }
}
