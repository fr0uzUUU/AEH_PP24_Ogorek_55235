package pl.pp;

class SprzetBudowlany extends Pojazd {
    private int przepracowaneGodziny;

    public SprzetBudowlany(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, int przebieg, int przepracowaneGodziny) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.przepracowaneGodziny = przepracowaneGodziny;
    }
    public int getPrzepracowaneGodziny() {
        return przepracowaneGodziny;
    }
    public void prowadz() {
        System.out.println("Prowadzę sprzęt budowlany.");
    }
    public void zatankuj(double iloscPaliwa) {
        setPoziomPaliwa(getPoziomPaliwa() + iloscPaliwa);
        System.out.println("Zatankowano sprzęt budowlany.");
    }
}
