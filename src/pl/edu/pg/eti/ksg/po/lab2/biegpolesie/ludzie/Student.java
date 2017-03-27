package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.Czlowiek;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;

import java.util.Random;

/**
 * Created by kamil on 27.03.17.
 */
public class Student extends Czlowiek {
    DziedzinaZadania kierunekStudiowania;

    public Student(String imie, String nazwisko, Plec plec, DziedzinaZadania kierunekStudiowania) {
        super(imie, nazwisko, plec);
        prawdopodoienstwoRozwiazaniaZadania *= 2;
        this.kierunekStudiowania = kierunekStudiowania;
    }

    @Override
    public void przedstawSie() {
        wypowiedzSie("Cześć! Jestem " + getImie() + " " + getNazwisko() + " - student");
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        return super.rozwiazZadanie(dziedzinaZadania);
    }

}
