public class Animal {
    static void makeSound() {
        System.out.println("sound of Animal");
    }

    private void isLiving() {
        System.out.println("Animal is living");
    }

    final void isCrying() {
        System.out.println("Animal is crying");
    }

    void overrideTest1() {
        System.out.println("Animal");
    }

    /* compiler error: Duplicate method overrideTest1() in type Animal */
    // String overrideTest1() {
    //     String animalString = "Animal string";
    //     return animalString;
    // }

    void overloadTest1() {
        System.out.println("Animal");
    } 
    void overloadTest1(String str) {
        System.out.println(str);
    }

    /* compiler error: Duplicate method overloadTest1() in type Animal */
    // String overloadTest1() {
    //     String animalString = "Animal string";
    //     return animalString;
    // }



    public static void main(String[] args) {

        System.out.println();
        System.out.println("Running...");
        System.out.println();

        System.out.println();
        Animal animal = new Dog();
        animal.makeSound(); /* output: sound of animal */
        animal.isLiving(); /* output: Animal is Living */
        animal.isCrying(); /* output: Animal is crying */
        animal.overrideTest1(); /* output: Dog */
        animal.overloadTest1(); /* output: Dog */
        animal.overloadTest1("strong"); /* output: strong */

        System.out.println();
        Dog dog = new Dog();
        dog.makeSound(); /* output: sound of Dog */
        // dog.isLiving(); /* compiler error: 
        // The method isLiving() from the type Dog is not visible */
        dog.overrideTest1(); /* output: Dog */

        System.out.println();
        Animal animalInstance = new Animal();
        animalInstance.overrideTest1(); /* output: Animal */
    }
}