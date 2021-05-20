import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Chat garfield = new Chat("Garfield", "M");
        Chat arizona = new Chat("Arizona", "F");
        Chien mango = new Chien("Mango", "M");
        Chien mia = new Chien("Mia", "F");
        Gorille donkey = new Gorille("Donkey", "M");
        Gorille peach = new Gorille("Peach", "F");
        Lapin bugs = new Lapin("Bugs", "M");
        Lapin lola = new Lapin("Lola", "F");

        Scanner scan = new Scanner(System.in);
        char saisie = 0;
        do {

            System.out.println("Quel est son nom?");
            String nom = scan.nextLine();

        System.out.println("Quel est son sexe? 0 pour masculin et 1 pour feminin");
        int sexe = scan.nextInt();
        scan.nextLine();
        do {
            switch (sexe) {
                case 0:
                    System.out.println("L'animal est masculin");
                    break;
                case 1:
                    System.out.println("L'animal est feminin");
                    break;
                default:
                    System.out.println("Erreur de saisie !");
                    break;
            }
        } while (sexe != 0 || sexe != 1);

        System.out.println("Quel est son espèce? 0 pour chat, 1 pour chien, 2 pour gorille et 3 pour lapin");
        int espece = scan.nextInt();
        scan.nextLine();

            System.out.println("L'animal " + nom + " est dans l'arche.");

            System.out.println("Un autre animal à ajouter? o pour oui, n pour non.");
                saisie = scan.nextLine().charAt(0);
            } while (saisie == 'o' || saisie == 'O');

            System.out.println("Pret à partir !");

    }
}

