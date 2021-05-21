public class Chat extends Animal{
    private String nom;
    private int sexe;
    private static int nbDeChats = 0;

    public Chat(String nom, int sexe) {
        this.nom = nom;
        this.sexe = sexe;
        Chat.nbDeChats++;
    }

    public static int getNbDeChats() {
        return nbDeChats;
    }

    public int getSexe() {
        return sexe;
    }
}
