package SRP;

public class Client {
    public static void main(String[] args) {
        Pet guineaPig = new Pet("Bailey", "Neo");
        PetFood petFood = new PetFood();
        PetSound petSound=  new PetSound();

        petFood.eat(guineaPig, "timothy hay");
        petSound.makeSound(guineaPig, "Wheek! Wheek!");

    }
}
