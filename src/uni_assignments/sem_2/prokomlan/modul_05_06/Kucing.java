package uni_assignments.sem_2.prokomlan.modul_05_06;

public class Kucing extends Hewan implements Karnivora {
    @Override
    public String getName() {
        return "Kucing";
    }

    @Override
    public void makanDaging() {
        System.out.println("Makan daging.");
    }

}
