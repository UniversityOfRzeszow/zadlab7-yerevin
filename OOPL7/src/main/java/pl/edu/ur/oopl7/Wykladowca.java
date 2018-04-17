/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Wykladowca extends Osoba {

    public int nr_indeksu;
    public String poziom;
    public String kierunek;
    public int rok_studiow;

    /**
     *
     * @param imie
     * @param nazwisko
     * @param nr_indeksu
     * @param data_urodzenia
     * @param plec
     * @param typ_studiow
     * @param kierunek
     * @param rok_studiow
     */
    public Wykladowca(String imie, String nazwisko, String data_urodzenia, String plec, int nr_indeksu, String typ_studiow, String kierunek, int rok_studiow) {
        
        super(imie, nazwisko, data_urodzenia, plec);
        this.nr_indeksu = nr_indeksu;
        this.poziom = typ_studiow;
        this.kierunek = kierunek;
        this.rok_studiow = rok_studiow;
    }
    
    
    @Override
    public void displayUser() {
        System.out.println("--------- Wykladowca ---------");
        System.out.println("Imie " + this.imie);
        System.out.println("Nazwisko " + this.nazwisko);
        System.out.println("Data urodzenia " + this.data_urodzenia);
        System.out.println("Plec " + this.plec);
        System.out.println("nr_indeksu " + this.nr_indeksu);
        System.out.println("poziom " + this.poziom);
        System.out.println("kierunek " + this.kierunek);
        System.out.println("rok_studiow " + this.rok_studiow);
    }

}
