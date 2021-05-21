public class Gorille extends Animal{
    private String nom;
    private int sexe;
    private static int nbDeGorilles = 0;

    public Gorille(String nom, int sexe) {
        this.nom = nom;
        this.sexe = sexe;
        Gorille.nbDeGorilles++;
    }

    public static int getNbDeGorilles() {
        return nbDeGorilles;
    }

    public int getSexe() {
        return sexe;
    }
}
