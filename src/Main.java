import java.util.Scanner;

/**
 * TP ArcheDeNoe
 * Commancé le 19/05/2021
 *
 * @author Baptiste Gervier
 */

public class Main {
    public static void main(String[] args) {


// je créer une arche
        Arche arche = new Arche();

// je créer un scanner
        Scanner scan = new Scanner(System.in);

// boucle do pour permettre d'ajouter un autre animal dans l'arche
        char saisie = 0;
        do {
            System.out.println("Bienvenue, j'aurai besoin de renseignements sur l'animal avant d'entrer :");
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
                        System.out.println("Erreur de saisie !");
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
                        System.out.println(nom + " est un chat so cute");
                        // nom sexe
                        arche.ajouter(new Chat(nom, sexe));  //je fais le lien avec la class Arche.
                        break;                                  //Et je créer un chat car je sais son nom, sexe et espece.
                    case 1:
                        System.out.println(nom + " est un adorable chien");
                        arche.ajouter(new Chien(nom, sexe));
                        new Chien(nom, sexe);
                        break;
                    case 2:
                        System.out.println(nom + " est un gorille badass");
                        arche.ajouter(new Gorille(nom, sexe));
                        break;
                    case 3:
                        System.out.println(nom + " est un lapin tout mignon");
                        arche.ajouter(new Lapin(nom, sexe));
                        break;
                    default:
                        System.out.println("Erreur de saisie");
                        break;
                }
            } while (espece > 3);

            System.out.println("L'animal " + nom + " est dans l'arche.");

// fin de la boucle do initialisé au debut
            System.out.println("Un autre animal à ajouter? o pour oui, n pour non.");
            saisie = scan.nextLine().charAt(0);
        } while (saisie == 'o' || saisie == 'O');

        System.out.println("Pret à partir !");

    }
}

