package TaliaGlowna;

import Rozgrywka.WyborPrzywodcyImpl;

import java.util.ArrayList;
import java.util.List;

public class PrzywódcyDrużyn extends WyborPrzywodcyImpl {


    private void setPrzywodcyDruzyn(final List<String> przywodcyDruzyn) {
        this.przywodcyDruzyn = przywodcyDruzyn;
    }

    @Override
    public String toString() {
        return "Czas wyboru{" +
                "przywodcyDruzyn=" + przywodcyDruzyn.toString() +
                '}';
    }

    public List<String> przywodcyDruzyn = new ArrayList<>();


    public void add(final String cats) {
    }

}





