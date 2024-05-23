package pl.pp;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class mojaJedenastaAplikacja {
    public static void main(String[] args) {
        List<Student> studenci = new ArrayList<>();
        studenci.add(new Student("12345", "Jan", "Kowalski", List.of(4, 5, 3, 5)));
        studenci.add(new Student("67890", "Anna", "Nowak", List.of(5, 5, 4, 4)));
        studenci.add(new Student("54321", "Paweł", "Wiśniewski", List.of(2, 3, 2, 4)));
        studenci.add(new Student("09876", "Katarzyna", "Kowalczyk", List.of(5, 4, 4, 5))
        );


        Student studentZNajwyzszaSrednia = null;
        double maxSrednia = 0;
        for (Student student : studenci) {
            double srednia = student.obliczSrednia();
            if (srednia > maxSrednia) {
                maxSrednia = srednia;
                studentZNajwyzszaSrednia = student;
            }
        }

        double sumaSrednich = 0;
        for (Student student : studenci) {
            sumaSrednich += student.obliczSrednia();
        }
        double sredniaWszystkichStudentow = sumaSrednich / studenci.size();

        if (studentZNajwyzszaSrednia != null) {
            System.out.println("Student z najwyższą średnią: " +studentZNajwyzszaSrednia.getNrIndeksu() + " " + studentZNajwyzszaSrednia.getImie() + " " + studentZNajwyzszaSrednia.getNazwisko() + " -Average: " + maxSrednia);
        }
        System.out.println("Średnia ocen wszystkich studentów: " + sredniaWszystkichStudentow);
        wypiszStudentow(studenci);
    }
    public static void wypiszStudentow(List<Student> studenci) {
        Collections.sort(studenci, (s1, s2) -> s1.getNazwisko().compareTo(s2.getNazwisko()));
        System.out.println("Lista studentów posortowana według nazwisk:");
        for (Student student : studenci) {
            System.out.println(student);
        }
    }
}