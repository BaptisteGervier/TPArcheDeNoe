
public class Arche {


    private Animal[] animaux = new Animal[8];
    private final int CAPACITE = 8;

    // le fori permet d'ajouter un animal
    public void ajouter(Animal animal) {
        for (int i = 0; i < this.animaux.length; i++) {
            if (this.animaux[i] == null) {
                this.animaux[i] = animal;
                break;
            }
        }
    }

    public int nbreDanimauxDansLarche() {
        int cpt = 0;
        for (Animal animal : this.animaux) {
            if (animal != null) {
                cpt++;
            }
        }
        return cpt;
    }

    public int getCAPACITE() {
        return CAPACITE;
    }
}