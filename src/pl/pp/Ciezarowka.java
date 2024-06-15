package pl.pp;

class Ciezarowka extends Pojazd {
    private double ladownosc;

    public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, int przebieg, double ladownosc) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.ladownosc = ladownosc;
    }
    public double getLadownosc() {
        return ladownosc;
    }
    public void prowadz() {
        System.out.println("Prowadzę ciężarówkę.");
    }
    public void zatankuj(double iloscPaliwa) {
        setPoziomPaliwa(getPoziomPaliwa() + iloscPaliwa);
        System.out.println("Zatankowano ciężarówkę.");
    }
}
