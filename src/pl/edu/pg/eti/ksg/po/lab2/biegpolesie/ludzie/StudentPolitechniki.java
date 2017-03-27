package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;

import java.util.Random;

/**
 * Created by kamil on 27.03.17.
 */
public class StudentPolitechniki extends Student {
    public StudentPolitechniki(String imie, String nazwisko, Plec plec, DziedzinaZadania kierunekStudiowania) {
        super(imie, nazwisko, plec, kierunekStudiowania);
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        switch (dziedzinaZadania) {
            case FIZYKA:
                prawdopodoienstwoRozwiazaniaZadania = 0.5;
                break;
            case INFORMATYKA:
                prawdopodoienstwoRozwiazaniaZadania = 0.7;
                break;
            case MATEMATYKA:
                prawdopodoienstwoRozwiazaniaZadania = 0.7;
                break;
        }
        return super.rozwiazZadanie(dziedzinaZadania);
    }
}
