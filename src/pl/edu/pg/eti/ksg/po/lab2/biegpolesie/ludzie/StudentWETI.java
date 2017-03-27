package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;

/**
 * Created by kamil on 27.03.17.
 */
public class StudentWETI extends StudentPolitechniki {
    public StudentWETI(String imie, String nazwisko, Plec plec, DziedzinaZadania kierunekStudiowania) {
        super(imie, nazwisko, plec, kierunekStudiowania);
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        if (dziedzinaZadania == DziedzinaZadania.INFORMATYKA)
            prawdopodoienstwoRozwiazaniaZadania = 1;
        return super.rozwiazZadanie(dziedzinaZadania);

    }
}
