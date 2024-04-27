package uni_assignments.sem_2.prokomlan.modul_05_06;

public class Udang extends Hewan implements Omnivora {
    @Override
    public String getName() {
        return "Udang";
    }

    @Override
    public void makanDaging() {
        System.out.println("Makan daging.");
    }

    @Override
    public void makanTanaman() {
        System.out.println("Makan tanaman.");
    }

}


