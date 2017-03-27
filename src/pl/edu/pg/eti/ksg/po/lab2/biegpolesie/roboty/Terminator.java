package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.roboty;

import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.Robot;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.RodzajTerenu;

import java.util.Random;

/**
 * Created by kamil on 27.03.17.
 */
public class Terminator extends Robot {
    public Terminator(int numerSeryjny) {
        super("Terminator", numerSeryjny);
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        switch (rodzajTerenu) {
            case DROGA:
                komunikuj("Wykryto teren: " + rodzajTerenu + ". Rozwijanie maksymalnej prędkości.");
                return czynnikiLosowe.nextDouble() * 0.3 + 0.95; //Od 0.95 do 1.5
            case SCIEZKA:
                komunikuj("Wykryto teren: " + rodzajTerenu + ". Prędkość umiarkowana.");
                return czynnikiLosowe.nextDouble() * 0.3 + 0.85; //Od 0.85 do 0.95
            case WYSOKI_LAS:
                komunikuj("Wykryto teren: " + rodzajTerenu + ". Nieprzyjazne warunki.");
                return czynnikiLosowe.nextDouble() * 0.3 + 0.4; //Od 0.4 do 0.5
            case NISKI_LAS:
                komunikuj("Wykryto teren: " + rodzajTerenu + ". Wykryto znaczną liczbę przeszkód.");
                return czynnikiLosowe.nextDouble() * 0.3 + 0.2; //Od 0.2 do 0.4
            case BAGNO:
            default:
                komunikuj("Wykryto teren: " + rodzajTerenu + ". Wykryto znaczną liczbę przeszkód.");
                return czynnikiLosowe.nextDouble() * 0.3 + 0.2; //Od 0.2 do 0.4
        }
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        if (dziedzinaZadania == DziedzinaZadania.MATEMATYKA
                || dziedzinaZadania == DziedzinaZadania.FIZYKA
                || dziedzinaZadania == DziedzinaZadania.INFORMATYKA)
            prawdopodoienstwoRozwiazaniaZadania = 1;
        return super.rozwiazZadanie(dziedzinaZadania);
    }
}
