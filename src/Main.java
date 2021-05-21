import java.util.Scanner;

/**
 * TP ArcheDeNoe
 * Commancé le 19/05/2021
 *
 * @author Baptiste Gervier
 */

public class Main {

    private static final String ERREUR = "Erreur de saisie !";
    private static final String BIENVENUE = "Bienvenue, j'aurai besoin de renseignements sur l'animal avant d'entrer :";
    private static final String PLEIN = "Désolé l'arche est pleine, je ne peux plus prendre d'autre animaux !";

    public static void main(String[] args) {


// je créer une arche
        Arche arche = new Arche();

// je créer un scanner
        Scanner scan = new Scanner(System.in);

// boucle do pour permettre d'ajouter un autre animal dans l'arche

        char saisie = 0;
        do {
            System.out.println(BIENVENUE);
            System.out.println("Quel est son nom?");
            String nom = scan.nextLine();

// boucle do while pour rentrer le sexe de l'animal
            int sexe;
            do {
                System.out.println("Quel est son sexe? 0 pour masculin et 1 pour feminin");
                sexe = scan.nextInt();
                scan.nextLine();
                switch (sexe) {
                    case 0:
                        System.out.println(nom + " est masculin");
                        break;
                    case 1:
                        System.out.println(nom + " est feminin");
                        break;
                    default:
                        System.out.println(ERREUR);
                        break;
                }
            } while (sexe > 1);

// boucle do while pour rentrer l'espece de l'animal
            int espece;
            do {
                System.out.println("Quel est son espèce? 0 pour chat, 1 pour chien, 2 pour gorille et 3 pour lapin");
                espece = scan.nextInt();
                scan.nextLine();
                switch (espece) {
                    case 0:
                        if (Chat.getNbDeChats() < 2) {
                            System.out.println(nom + " est un chat so cute");
                            arche.ajouter(new Chat(nom, sexe));             //je fais le lien avec la class Arche.
                            System.out.println("L'animal " + nom + " est dans l'arche.");
                        } else {                                            //Et je créer un chat car je sais son nom, sexe et espece.
                            System.out.println("J'ai déjà deux chats, désolé. Attend la prochaine arche.");
                        }
                        break;
                    case 1:
                        if (Chien.getNbDeChiens() < 2) {
                            System.out.println(nom + " est un adorable chien");
                            arche.ajouter(new Chien(nom, sexe));
                            System.out.println("L'animal " + nom + " est dans l'arche.");
                        } else {
                            System.out.println("J'ai déjà deux chiens, désolé. Attend la prochaine arche.");
                        }
                        break;
                    case 2:
                        if (Gorille.getNbDeGorilles() < 2) {
                            System.out.println(nom + " est un gorille badass");
                            arche.ajouter(new Gorille(nom, sexe));
                            System.out.println("L'animal " + nom + " est dans l'arche.");
                        } else {
                            System.out.println("J'ai déjà deux gorilles, désolé. Attend la prochaine arche.");
                        }
                        break;
                    case 3:
                        if (Lapin.getNbDeLapins() < 2) {
                            System.out.println(nom + " est un lapin tout mignon");
                            arche.ajouter(new Lapin(nom, sexe));
                            System.out.println("L'animal " + nom + " est dans l'arche.");
                        } else {
                            System.out.println("J'ai déjà deux lapins, désolé. Attend la prochaine arche.");
                        }
                        break;
                    default:
                        System.out.println(ERREUR);
                        break;
                }
            } while (espece > 3);


// fin de la boucle do initialisé au debut
            System.out.println("Un autre animal à ajouter? o pour oui, n'importe quelle touche pour non.");
            saisie = scan.nextLine().charAt(0);
        } while ((saisie == 'o' || saisie == 'O') && (arche.nbreDanimauxDansLarche() < arche.getCAPACITE()));

        System.out.println(PLEIN);
        System.out.println("L'arche va partir !");
        System.out.println("L'arche possède à son bord : " + Chat.getNbDeChats() + " chats, " + Chien.getNbDeChiens()
        + " chiens, " + Gorille.getNbDeGorilles() + " gorilles, " + Lapin.getNbDeLapins() + " lapins");
    }
}

