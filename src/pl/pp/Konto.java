package pl.pp;

public class Konto {
    private long numerKonta;
    private double dostepneSrodki;
    private String nazwaWlasciciela;
    private String email;
    private int nrTelefonu;

    public Konto(){

    }
    public Konto(long numerKonta, double dostepneSrodki, String nazwaWlasciciela, String email, int nrTelefonu){
        this.numerKonta = numerKonta;
        this.dostepneSrodki = dostepneSrodki;
        this. nazwaWlasciciela = nazwaWlasciciela;
        this.email = email;
        this.nrTelefonu = nrTelefonu;
    }
    public double getNumerKonta(){
        return numerKonta;
    }
    public void setNumerKonta(long numerKonta){
        this.numerKonta = numerKonta;
    }
    public double getDostepneSrodki(){
        return dostepneSrodki;
    }
    public void setDostepneSrodki(double dostepneSrodki){
        this.dostepneSrodki = dostepneSrodki;
    }
    public String getNazwaWlasciciela(){
        return nazwaWlasciciela;
    }
    public void setNazwaWlasciciela(String nazwaWlasciciela){
        this.nazwaWlasciciela = nazwaWlasciciela;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getNrTelefonu(){
        return nrTelefonu;
    }
    public void setNrTelefonu(int nrTelefonu){
        this.nrTelefonu = nrTelefonu;
    }

    /*public void Dane(){
        System.out.println("Nr Konta " + numerKonta + " "  + "Dostępne środki " + dostepneSrodki + ".");
    }*/
    public double Zasil(double dostepneSrodki){
        this.dostepneSrodki += dostepneSrodki;
        System.out.println("Wpłata PLN " + dostepneSrodki + " została wykonana. Pozostało na koncie " + this.dostepneSrodki + " PLN");
        return dostepneSrodki;
    }
    public double Wyciagnij(double dostepneSrodki){
        if (this.dostepneSrodki >= dostepneSrodki){
            this.dostepneSrodki -= dostepneSrodki;
            System.out.println("Pobrano PLN " + dostepneSrodki + " z konta. Nowe saldo " + this.dostepneSrodki + " PLN");
        }
        else{
            System.out.println("Brak środków na koncie. Masz: " + this.dostepneSrodki + " PLN");
        }
        return dostepneSrodki;
    }
}
