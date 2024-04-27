package uni_assignments.sem_2.prokomlan.modul_05_06;

// import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Kucing k = new Kucing();
        // System.out.println(k.getName());
        // k.makanDaging();

        // Kuda kd = new Kuda();
        // System.out.println(kd.getName());

        // UndurUndur u = new UndurUndur();
        // System.out.println(u.getName());

        // Udang ud = new Udang();
        // System.out.println(ud.getName());

        // Hewan k = new Kucing();
        // System.out.println(k.getName());
        // if(k instanceof Kucing) {
        //     ((Kucing)k).makanDaging();
        // }
        // if(k instanceof Karnivora) {
        //     ( (Karnivora) k ).makanDaging();
        // }

        // Hewan kd = new Kuda();
        // System.out.println(kd.getName());

        // Hewan u = new UndurUndur();
        // System.out.println(u.getName());

        // Hewan ud = new Udang();
        // System.out.println(ud.getName());

        Hewan [] dafHw = new Hewan[4];

        dafHw[0] = new Kucing();
        dafHw[1] = new Kuda();
        dafHw[2]  = new UndurUndur();
        dafHw[3]  = new Udang();

        for(int i=0; i<4; i++) {
            System.out.println( dafHw[i].getName() );

            if(dafHw[ i ] instanceof Karnivora) {
                ((Karnivora)dafHw[ i ]).makanDaging();
            }

            if(dafHw[ i ] instanceof Herbivora) {
                ((Herbivora)dafHw[ i ]).makanTanaman();
            }

            if(dafHw[ i ] instanceof Omnivora) {
                ((Omnivora)dafHw[ i ]).makanDaging();
                ((Omnivora)dafHw[ i ]).makanTanaman();
            }
        }

        // List<Hewan> dafHw = new ArrayList<Hewan>();

        // Hewan h = new Kucing();
        // dafHw.add(h);

        // h = new Kuda();
        // dafHw.add(h);

        // h  = new UndurUndur();
        // dafHw.add(h);

        // h  = new Udang();
        // dafHw.add(h);

        // for(int i=0; i<4; i++) {
        //     System.out.println( dafHw.get(i).getName() );
        //     if(dafHw.get(i) instanceof Omnivora) {
        //         ((Omnivora)dafHw[ i ]).makanDaging();
        //     }
        // }

    }
}
