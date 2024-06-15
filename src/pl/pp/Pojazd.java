package pl.pp;

abstract class Pojazd {
    private String nrRejestracyjny;
    private String numerVin;
    private String kolor;
    private double cena;
    private double spalanie;
    private double poziomPaliwa;
    private int przebieg;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, int przebieg) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
    }

    public abstract void prowadz();
    public abstract void zatankuj(double iloscPaliwa);
    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }
    public String getNumerVin() {
        return numerVin;
    }
    public String getKolor() {
        return kolor;
    }
    public double getCena() {
        return cena;
    }
    public double getSpalanie() {
        return spalanie;
    }
    public double getPoziomPaliwa() {
        return poziomPaliwa;
    }
    public int getPrzebieg() {
        return przebieg;
    }
    public void setPoziomPaliwa(double poziomPaliwa) {
        this.poziomPaliwa = poziomPaliwa;
    }
    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }
}
