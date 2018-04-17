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
public class Osoba {

    public String imie;
    public String nazwisko;
    public String data_urodzenia;
    public String plec;

    public Osoba(String imie, String nazwisko, String data_urodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.plec = plec;
    }

    public void displayUser() {
        System.out.println("--------- OSOBA ---------");
        System.out.println("Imie " + this.imie);
        System.out.println("Nazwisko " + this.nazwisko);
        System.out.println("Data urodzenia " + this.data_urodzenia);
        System.out.println("Plec " + this.plec);
    }

}
