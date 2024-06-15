package pl.pp;

class Osobowe extends Pojazd {
    private int liczbaDrzwi;

    public Osobowe(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, int przebieg, int liczbaDrzwi) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
    }
    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }
    public void prowadz() {
        System.out.println("Prowadzę samochód osobowy.");
    }
    public void zatankuj(double iloscPaliwa) {
        setPoziomPaliwa(getPoziomPaliwa() + iloscPaliwa);
        System.out.println("Zatankowano samochód osobowy.");
    }
}