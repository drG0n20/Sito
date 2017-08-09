import java.util.Arrays;

public class Sito {
    private boolean tab[];

    public Sito() {
        this(10000);
        tab = new boolean[10000];
    }

    public Sito(int n) {
        tab = new boolean[n];
    }

    public void generujSito() {

        int zakres = 100;
        Arrays.fill(tab, true);
        tab[0] = false;
        tab[1] = false;

        for (int i = 2; i < zakres; i++) {
            if (tab[i]) {
                for (int j = i + i; j < zakres; j = j + i) {
                    tab[j] = false;
                }
            }
        }
    }

    public void drukujSito() {
        int zakres = 100;
        for (int i = 0; i < zakres; i++) {
            if (tab[i] == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Sito sito = new Sito();

        sito.generujSito();
        sito.drukujSito();
    }
}