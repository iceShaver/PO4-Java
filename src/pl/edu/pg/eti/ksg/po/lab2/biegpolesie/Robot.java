package pl.edu.pg.eti.ksg.po.lab2.biegpolesie;

import java.io.PrintStream;
import java.util.Random;

/**
 * @author TB
 */
public abstract class Robot implements Uczestnik {

    private final String model;
    private final int numerSeryjny;
    protected final Random czynnikiLosowe = new Random();
    protected double prawdopodoienstwoRozwiazaniaZadania;
    private PrintStream mediumKomunikacyjne;


    public Robot(String model, int numerSeryjny) {
        this.model = model;
        this.numerSeryjny = numerSeryjny;
        prawdopodoienstwoRozwiazaniaZadania = 0.05;
    }


    @Override
    public void mowDo(PrintStream ps) {
        mediumKomunikacyjne = ps;
    }


    public final String identyfikuj() {
        return model + " nr " + numerSeryjny;
    }

    protected void komunikuj(String komunikat) {
        mediumKomunikacyjne.print(identyfikuj() + " komunikuje: ");
        mediumKomunikacyjne.println(komunikat);
    }

    @Override
    public String toString() {
        return identyfikuj();
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        Random generator = new Random();
        double liczba = generator.nextDouble();
        if (liczba < prawdopodoienstwoRozwiazaniaZadania) return true;
        return false;
    }

}
