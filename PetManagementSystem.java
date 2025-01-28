public class PetManagementSystem {
    public static void main(String[] args) {
        // Creating pets
        Pet pet1 = new Pet("Buddy", "Dog", 3);
        Pet pet2 = new Pet("Whiskers", "Cat", 2);
        Pet pet3 = new Pet("Goldie", "Fish", 1);

        // Creating a pet shop
        PetShop petShop = new PetShop("Pet Haven");
        petShop.addPet(pet1);
        petShop.addPet(pet2);
        petShop.addPet(pet3);

        // Creating pet care and service
        PetCare petCare = new PetCare();
        petCare.addPetForCare(pet1);
        petCare.addPetForCare(pet2);

        PetService petService = new PetService();
        petService.addPetForService(pet3);

        // Displaying information
        petShop.displayPets();
        petCare.displayPetsUnderCare();
        petService.displayPetsServed();
    }
}
