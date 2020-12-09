public class Dog extends Animal {
    static void makeSound() {
        System.out.println("sound of Dog");
    }    

    private void isLiving() {
        System.out.println("Dog is living");
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Running...");
        System.out.println();
        
        Animal animal = new Dog();
        animal.makeSound(); /* output: sound of Animal*/
        // animal.isLiving(); /* compiler error, 
        // isLiving() from animal is not visible from Dog instance */

        Dog dog = new Dog();
        dog.makeSound(); /* output: sound of Dog */
        dog.isLiving(); /* output: Dog is living */
    }
}
