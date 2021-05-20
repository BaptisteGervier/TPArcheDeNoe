public class Chien extends Animal{
    private String nom;
    private int sexe;
    private static int nbDeChiens = 0;

    public Chien(String nom, int sexe) {
        this.nom = nom;
        this.sexe = sexe;
        Chien.nbDeChiens++;
    }

    public static int getNbDeChiens() {
        return nbDeChiens;
    }
}
