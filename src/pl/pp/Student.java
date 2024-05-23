package pl.pp;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nrIndexu;
    private String Imie;
    private String Nazwisko;
    private List<Integer> oceny;
    public Student(String nrIndexu, String Imie, String Nazwisko, List<Integer> oceny){
        this.nrIndexu = nrIndexu;
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.oceny = new ArrayList<>(oceny);
    }
    public String getNrIndeksu() {
        return nrIndexu;
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public List<Integer> getOceny() {
        return oceny;
    }

    // Metoda do obliczania średniej ocen
    public double obliczSrednia() {
        if (oceny.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return suma / oceny.size();
    }
    public String toString() {
        return Imie + " " + Nazwisko + " (" + nrIndexu + ") -Average: " + obliczSrednia() ;
    }
}
