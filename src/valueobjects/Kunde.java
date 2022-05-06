package valueobjects;

public class Kunde extends Nutzer{

    private int kundenNr = kundenNr;
    private String strasse = "";
    private String plz = "";
    private String wohnort = "";

    public Kunde(int kundenNr, String strasse, String plz, String wohnort){
        super(vorname, nachname, passwort, benutzername);
        this.kundenNr = kundenNr;
        this.strasse = strasse;
        this.plz = plz;
        this.wohnort = wohnort;
    }


}
