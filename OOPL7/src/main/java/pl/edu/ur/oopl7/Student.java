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
public class Student extends Osoba {

    public int nr_indeksu;
    public String typ_studiow;
    public String kierunek;
    public int rok_studiow;

    public Student(String imie, String nazwisko, String data_urodzenia, String plec, int nr_indeksu, String typ_studiow, String kierunek, int rok_studiow) {
        super(imie, nazwisko, data_urodzenia, plec);
        this.nr_indeksu = nr_indeksu;
        this.typ_studiow = typ_studiow;
        this.kierunek = kierunek;
        this.rok_studiow = rok_studiow;
    }

    @Override
    public void displayUser() {
        System.out.println("--------- STUDENT ---------");
        System.out.println("Imie " + this.imie);
        System.out.println("Nazwisko " + this.nazwisko);
        System.out.println("Data urodzenia " + this.data_urodzenia);
        System.out.println("Plec " + this.plec);
        System.out.println("indeks " + this.nr_indeksu);
        System.out.println("typ " + this.typ_studiow);
        System.out.println("kierunek " + this.kierunek);
        System.out.println("rok_studiow " + this.rok_studiow);
    }

}
