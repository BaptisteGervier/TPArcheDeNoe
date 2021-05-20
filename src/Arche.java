
public class Arche {


    private Animal[] animaux = new Animal[8];

    // le fori permet d'ajouter un animal
    public void ajouter(Animal animal){
        for (int i = 0; i < this.animaux.length; i++) {
            if (this.animaux[i] == null){
                this.animaux[i] = animal;
                break;
            }
        }
    }

}
