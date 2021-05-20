public class Lapin extends Animal{
    private String nom;
    private int sexe;
    private static int nbDeLapins = 0;

    public Lapin(String nom, int sexe) {
        this.nom = nom;
        this.sexe = sexe;
        Lapin.nbDeLapins++;
    }

    public static int getNbDeLapins() {
        return nbDeLapins;
    }
}
