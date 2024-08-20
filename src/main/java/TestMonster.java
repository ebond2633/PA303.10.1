public class TestMonster {
    public static void main(String[] args) {
        // Declare instances of the superclass, substituted by subclasses
        Monster m1 = new FireMonster("FireMonster1");
        Monster m2 = new WaterMonster("WaterMonster1");
        Monster m3 = new StoneMonster("StoneMonster1");

        // Invoke the actual implementation
        System.out.println(m1.attack()); // Output: Attack with fire!
        System.out.println(m2.attack()); // Output: Attack with water!
        System.out.println(m3.attack()); // Output: Attack with stones!

        // Reassign m1 to a new StoneMonster instance
        m1 = new StoneMonster("StoneMonster2");
        System.out.println(m1.attack()); // Output: Attack with stones!

        // Create a generic Monster instance
        Monster m4 = new Monster("GenericMonster");
        System.out.println(m4.attack()); // Output: I don't know how to attack!
    }
}
