package uni_assignments.sem_2.prokomlan.modul_05_06;

public class Kuda extends Hewan implements Herbivora {
    @Override
    public String getName() {
        return "Kuda";
    }

    @Override
    public void makanTanaman() {
        System.out.println("Makan tanaman.");
    }

}


