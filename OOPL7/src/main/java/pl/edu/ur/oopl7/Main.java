package pl.edu.ur.oopl7;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 2
        System.out.println("ZADANIE 1");
        Osoba osoba1 = new Osoba("Jan", "Kowalski","2018-32-32", "mezczyzna");
        osoba1.displayUser();
        Student student = new Student("Jan", "Kowalski","2018-32-32", "mezczyzna", 24, "test", "test", 21);
        student.displayUser();
        Wykladowca wykladowca = new Wykladowca("Jan", "Kowalski","2018-32-32", "mezczyzna", 24, "test", "test", 21);
        wykladowca.displayUser();
        System.out.println("ZADANIE 2");
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];
        for(int i = 0; i<100; i++) {
            array2D[i] = new Punkt2D().getRandomPlace();
        }
        for(int i = 0; i<100; i++) {
            array3D[i] = new Punkt3D().getRandomPlace();
        }
        for(int i = 0; i<100; i++) {
            if(array2D[i].x == array3D[i].x && array2D[i].y == array3D[i].y) {
                System.out.println("Ten sam punkt x: " + array2D[i].x + ", y: " + array2D[i].y);
            }
        }
    }
    
}
