import java.util.ArrayList;
import java.util.List;

public class PetService {
    private List<Pet> petsServed;

    public PetService() {
        this.petsServed = new ArrayList<>();
    }

    public void addPetForService(Pet pet) {
        petsServed.add(pet);
    }

    public void displayPetsServed() {
        System.out.println("Pets served:");
        for (Pet pet : petsServed) {
            System.out.println("Name: " + pet.getName() + ", Type: " + pet.getType() + ", Age: " + pet.getAge());
        }
    }
}
