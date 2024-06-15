package pl.pp;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mojaCzternastaAplikacja {
    interface TypPaliwa {
        String getTypPaliwa();
    }
    public static void main(String[] args) {
        Osobowe osobowe = new Osobowe("WF123", "1HGCM82633A123456", "Czerwony", 150.0, 8.5, 50.0, 120000, 4);
        Ciezarowka ciezarowka = new Ciezarowka("WZ789", "2HGCM82633A654321", "Niebieski", 300.0, 15.0, 80.0, 250000, 2000.0);
        Motocykl motocykl = new Motocykl("WPR456", "3HGCM82633A789123", "Czarny", 75.0, 4.5, 20.0, 30000, true);
        SprzetBudowlany sprzetBudowlany = new SprzetBudowlany("BUD321", "4HGCM82633A321789", "Żółty", 500.0, 20.0, 100.0, 5000, 200);

        TypPaliwa diesel = new Diesel();
        TypPaliwa benzyna = new Benzyna();
        TypPaliwa elektryk = new Elektryk();

        System.out.println("Samochód osobowy używa paliwa: " + diesel.getTypPaliwa());
        osobowe.prowadz();
        osobowe.zatankuj(10);

        System.out.println("\nCiężarówka używa paliwa: " + benzyna.getTypPaliwa());
        ciezarowka.prowadz();
        ciezarowka.zatankuj(20);

        System.out.println("\nMotocykl używa paliwa: " + benzyna.getTypPaliwa());
        motocykl.prowadz();
        motocykl.zatankuj(5);

        System.out.println("\nSprzęt budowlany używa paliwa: " + diesel.getTypPaliwa());
        sprzetBudowlany.prowadz();
        sprzetBudowlany.zatankuj(30);
    }
}