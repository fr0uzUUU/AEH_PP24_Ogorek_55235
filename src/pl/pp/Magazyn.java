package pl.pp;

public class Magazyn {
    private int nrMagazynu;
    private long dostepnaPrzestrzen;
    private long zajetaPrzestrzen;
    private String nazwaWlasciciela;
    private String emailWlasciciela;
    private int nrTelefonuWlasciciela;

    public Magazyn(int nrMagazynu, long dostepnaPrzestrzen, long zajetaPrzestrzen, String nazwaWlasciciela, String emailWlasciciela, int nrTelefonuWlasciciela) {
        this.nrMagazynu = nrMagazynu;
        this.dostepnaPrzestrzen = dostepnaPrzestrzen;
        this.zajetaPrzestrzen = getZajetaPrzestrzen();
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.emailWlasciciela = emailWlasciciela;
        this.nrTelefonuWlasciciela =nrTelefonuWlasciciela;
    }
    public int getNrMagazynu(){
        return nrMagazynu;
    }
    public void setNrMagazynu(int nrMagazynu){
        this.nrMagazynu = nrMagazynu;
    }
    public long getDostepnaPrzestrzen(){
        return dostepnaPrzestrzen;
    }
    public void setDostepnaPrzestrzen(long dostepnaPrzestrzen){
        this.dostepnaPrzestrzen = dostepnaPrzestrzen;
    }
    public long getZajetaPrzestrzen(){
        return zajetaPrzestrzen;
    }
    public void setZajetaPrzestrzen(long zajetaPrzestrzen){
        this.zajetaPrzestrzen = zajetaPrzestrzen;
    }
    public String getNazwaWlasciciela(){
        return nazwaWlasciciela;
    }
    public void setNazwaWlasciciela(String nazwaWlasciciela){
        this.nazwaWlasciciela = nazwaWlasciciela;
    }
    public String getEmailWlasciciela(){
        return emailWlasciciela;
    }
    public void setEmailWlasciciela(String emailWlasciciela){
        this.emailWlasciciela = emailWlasciciela;
    }
    public int getNrTelefonuWlasciciela(){
        return nrTelefonuWlasciciela;
    }
    public void setNrTelefonuWlasciciela(int nrTelefonuWlasciciela){
        this.nrTelefonuWlasciciela = nrTelefonuWlasciciela;
    }
    public long dodajTowar(long zajetaPrzestrzen){
        if(zajetaPrzestrzen >= 0 && zajetaPrzestrzen <= this.dostepnaPrzestrzen){
            this.zajetaPrzestrzen += zajetaPrzestrzen;
            this.dostepnaPrzestrzen -= zajetaPrzestrzen;
            System.out.println("Dodano " + zajetaPrzestrzen + " jednostek towaru. Pozostala przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek");
        }
        else{
            System.out.println("Za mało miejsca w magazynie. Pozostała przestrzen magazynowa: " + dostepnaPrzestrzen + " jednostek");
        }
        return zajetaPrzestrzen;
    }
    public long usunTowar(long zajetaPrzestrzen){
        if (zajetaPrzestrzen >= 0 && zajetaPrzestrzen <= this.dostepnaPrzestrzen){
            this.zajetaPrzestrzen -= zajetaPrzestrzen;
            this.dostepnaPrzestrzen += zajetaPrzestrzen;
            System.out.println("Usunięto " + zajetaPrzestrzen + " jednostek towaru. Pozostala przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek");
        }
        else{
            System.out.println("Nie możesz usunąć więcej niż posiadasz. Pozostała przestrzen magazynowa: " + dostepnaPrzestrzen + " jednostek");
        }
        return zajetaPrzestrzen;
    }
    public void sprawdzZajetosc(){
        System.out.println("Zajęta przestrzen magazynowa: " + zajetaPrzestrzen + " jednostek");
        System.out.println("Dostępna przestrzeń magazynowa: " + this.dostepnaPrzestrzen + " jednostek");
    }
    public void aktualizujKontakt(String emailWlasciciela, int nrTelefonuWlasciciela){
        this.emailWlasciciela = emailWlasciciela;
        this.nrTelefonuWlasciciela = nrTelefonuWlasciciela;
        System.out.println("Nowy email: " + emailWlasciciela);
        System.out.println("Nowy nuber telefonu: " + nrTelefonuWlasciciela);
    }
}


































