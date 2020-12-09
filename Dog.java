public class Dog extends Animal {
    static void makeSound() {
        System.out.println("sound of Dog");
    }    

    private void isLiving() {
        System.out.println("Dog is living");
    }

    // final void isCrying() { 
    //     System.out.println("Animal is crying");
    // }
    /* compiler error: 
    Cannot override the final method from Animal */


    void overrideTest1() {
        System.out.println("Dog");
    }

    /* compiler error: Duplicate method overrideTest1() in type Dog */
    // String overrideTest1() {
    //     String animalString = "Animal string";
    //     return animalString;
    // }

    void overloadTest1() {
        System.out.println("Dog");
    }
    void overloadTest1(Number num) {
        System.out.println(num);
    } 

    /* output: The return type is incompatible with Animal.overloadTest1(String) */
    // String overloadTest1(String str) {
    //     return str;
    // }
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Running...");
        System.out.println();
        
        System.out.println();
        Animal animal = new Dog(); 
        animal.makeSound(); /* output: sound of Animal*/
        // animal.isLiving(); /* compiler error, 
        // isLiving() from animal is not visible from Dog instance */
        animal.overrideTest1(); /* output: Dog */

        System.out.println();
        Dog dog = new Dog();
        dog.makeSound(); /* output: sound of Dog */
        dog.isLiving(); /* output: Dog is living */
        dog.overrideTest1(); /* output: Dog */
        dog.overloadTest1(); /* output: Dog */
        dog.overloadTest1("string"); /* output: string */
        dog.overloadTest1(5); /* output: 5 */

        System.out.println();
        Animal animalInstance = new Animal();
        animalInstance.overrideTest1(); /* output: Animal */

    }
}
