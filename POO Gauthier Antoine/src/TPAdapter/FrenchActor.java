package TPAdapter;

public class FrenchActor {
    private String prenom;
    private String nom;
    public FrenchActor(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public String dire(String phrase, FrenchActor interlocuteur) {
        return this.prenom + " " + this.nom + "dit à "+interlocuteur.prenom + " " + interlocuteur.nom + " " +phrase;
    }
}

