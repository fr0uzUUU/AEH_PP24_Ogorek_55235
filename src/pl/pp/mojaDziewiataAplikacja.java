package pl.pp;
import pl.pp.Person;

public class mojaDziewiataAplikacja {
    public static void main(String[] args) {
        /*Person person1 = new Person("Test", "Testowy", 25); //nowy obiekt klasy Person
        person1.hiToAll(); //wywołanie metody hiToAll() z obiektu person1 klasy Person

        person1.growOld(10); //wywołanie metody growOld( z obiektu person1 klasy Person
        person1.hiToAll();

        person1.setForename("ZmienionyTest"); //wywołanie metody tzw. "settera" do zmiany imienia
        person1.hiToAll();

        String personName = person1.getForename(); //wywołanie metody tzw. "gettera" do pobrania imienia
        int personAge = person1.getAge(); //wywołanie metody tzw. "gettera" do pobrania wieku
        System.out.println("Pobrane imię to " + personName + " z wiekiem = " + personAge);

        Circle circle1 = new Circle(1.2); //nowy obiekt klasy Circle
        circle1.getInfo(); //wywołanie metody getInfo() z obiektu circle1 klasy Circle
        circle1.setRadius(2.6); //wywołanie metody tzw. "settera" do zmiany promienia
        circle1.getInfo();*/
        Magazyn mag1 = new Magazyn(1, 5000,0,"Adam","adam@example.com", 102840284);
        mag1.dodajTowar(400);
        mag1.dodajTowar(4000);
        mag1.dodajTowar(4000);
        mag1.sprawdzZajetosc();
        mag1.usunTowar(400);
        mag1.sprawdzZajetosc();
        mag1.usunTowar(5000);
        mag1.sprawdzZajetosc();
        mag1.aktualizujKontakt("robert@gamil.com", 600390092);
    }
}