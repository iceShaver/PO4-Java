package pl.edu.pg.eti.ksg.po.lab2.biegpolesie;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kamil on 3/26/17.
 */
public class Zadanie implements ElementTrasy {
    private DziedzinaZadania dziedzinaZadania;
    private Map<Uczestnik, Boolean> uczestnicyWZadaniu = new HashMap<>();

    public Map<Uczestnik, Boolean> getUczestnicyWZadaniu() {
        return uczestnicyWZadaniu;
    }

    Zadanie(DziedzinaZadania dziedzinaZadania) {
        this.dziedzinaZadania = dziedzinaZadania;
    }

    @Override
    public Iterable<Uczestnik> getUczestnicy() {
        return uczestnicyWZadaniu.keySet();
    }

    public DziedzinaZadania getDziedzinaZadania() {
        return dziedzinaZadania;
    }

    @Override
    public void dodajUczestnika(Uczestnik u) {
        uczestnicyWZadaniu.put(u, false);
    }

    @Override
    public void usunUczestnika(Uczestnik u) {
        uczestnicyWZadaniu.remove(u);
    }

    @Override
    public int getLiczbaUczestnikowNaTrasie() {
        return uczestnicyWZadaniu.size();
    }
}
