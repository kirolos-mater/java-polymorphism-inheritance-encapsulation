public class Run {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Running...");
        System.out.println();

        Animal cat = new Cat();
        cat.makeSound();
        // Animal dog = new Dog();
        // dog.isLiving(); /* compiler error, 
        // isLiving() from animal is not visible from Run.java */
        // Dog dog = new Dog();
        // dog.isLiving(); /* compiler error, 
        // isLiving() from dog is not visible from Run.java */
    }
}
