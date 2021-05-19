import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String oui = "o";
        String non = "n";

        Chat garfield = new Chat("Garfield", "M");
        Chat arizona = new Chat("Arizona", "F");
        Chien mango = new Chien("Mango", "M");
        Chien mia = new Chien("Mia", "F");
        Gorille donkey = new Gorille("Donkey", "M");
        Gorille peach = new Gorille("Peach", "F");
        Lapin bugs = new Lapin("Bugs", "M");
        Lapin lola = new Lapin("Lola", "F");

        Scanner scan = new Scanner(System.in);

        System.out.println("Quel est ton nom?");
        String nom = scan.nextLine();

        System.out.println("Quel est ton sexe? 0 pour masculin et 1 pour feminin");
        int sexe = scan.nextInt();

        System.out.println("Quel est ton espèce? 0 pour chat, 1 pour chien, 2 pour gorille et 3 pour lapin");
        int espece = scan.nextInt();

        System.out.println("L'animal " + nom + " est dans l'arche.");

        System.out.println("Un autre animal à ajouter? o pour oui, n pour non.");
        String saisie = scan.nextLine();
        if (saisie == "o"){
            System.out.println();
        } else {
            scan.nextLine();
        }
        System.out.println("Pret à partir !");

    }
}
