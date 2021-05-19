
public class Arche {

    int tabAnimal[] = new int[8];
    private Animal[] animal;

    public void ajouter(Animal animal){
        for (int i = 0; i < this.animal.length; i++) {
            if (this.animal[i] == null){
                this.animal[i] = animal;
                break;
            }
        }
    }

}
