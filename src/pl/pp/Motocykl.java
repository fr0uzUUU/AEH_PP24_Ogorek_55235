package pl.pp;

class Motocykl extends Pojazd {
    private boolean posiadaDostawke;
    public Motocykl(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, int przebieg, boolean posiadaDostawke) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.posiadaDostawke = posiadaDostawke;
    }
    public boolean isPosiadaDostawke() {
        return posiadaDostawke;
    }
    public void prowadz() {
        System.out.println("Prowadzę motocykl.");
    }
    public void zatankuj(double iloscPaliwa) {
        setPoziomPaliwa(getPoziomPaliwa() + iloscPaliwa);
        System.out.println("Zatankowano motocykl.");
    }
}
