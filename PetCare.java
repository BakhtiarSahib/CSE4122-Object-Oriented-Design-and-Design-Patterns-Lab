import java.util.ArrayList;
import java.util.List;

public class PetCare {
    private List<Pet> petsUnderCare;

    public PetCare() {
        this.petsUnderCare = new ArrayList<>();
    }

    public void addPetForCare(Pet pet) {
        petsUnderCare.add(pet);
    }

    public void displayPetsUnderCare() {
        System.out.println("Pets under care:");
        for (Pet pet : petsUnderCare) {
            System.out.println("Name: " + pet.getName() + ", Type: " + pet.getType() + ", Age: " + pet.getAge());
        }
    }
}
