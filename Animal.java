public class Animal {
    static void makeSound() {
        System.out.println("sound of Animal");
    }

    private void isLiving() {
        System.out.println("Animal is living");
    }


    public static void main(String[] args) {

        System.out.println();
        System.out.println("Running...");
        System.out.println();

        Animal animal = new Dog();
        animal.makeSound(); /* output: sound of animal */
        animal.isLiving(); /* output: Animal is Living */

        Dog dog = new Dog();
        dog.makeSound(); /* output: sound of Dog */
        // dog.isLiving(); /* compiler error: 
        // The method isLiving() from the type Dog is not visible */
    }
}