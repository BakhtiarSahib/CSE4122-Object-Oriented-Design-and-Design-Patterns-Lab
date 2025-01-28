import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Pet> pets;
    private String shopName;

    public PetShop(String shopName) {
        this.pets = new ArrayList<>();
        this.shopName = shopName;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void displayPets() {
        System.out.println("Pets in " + shopName + ":");
        for (Pet pet : pets) {
            System.out.println("Name: " + pet.getName() + ", Type: " + pet.getType() + ", Age: " + pet.getAge());
        }
    }
}
