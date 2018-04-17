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
public class DaneOsobowe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Jan", "Kowalski","2018-32-32", "mezczyzna");
        osoba1.displayUser();
        Student student = new Student("Jan", "Kowalski","2018-32-32", "mezczyzna", 24, "test", "test", 21);
        student.displayUser();
        Wykladowca wykladowca = new Wykladowca("Jan", "Kowalski","2018-32-32", "mezczyzna", 24, "test", "test", 21);
        wykladowca.displayUser();
    }
}