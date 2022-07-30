package challenger;

public class ReferenceChallenge {

    public static void main(String[] args) {
        StringBuilder warriorProfession = new StringBuilder("Dragon");
        String warriorWeapon = "Sword";
        //Mutable StringBuilder and Immutable String are used.
        // Java uses pass by value methodology for both mutable and immutable objects
        // when you copy an object java still points to the same reference in the heap
        changeWarriorDetails(warriorProfession,warriorWeapon);
        System.out.println(warriorProfession);
        System.out.println(warriorWeapon);
    }

    private static void changeWarriorDetails(StringBuilder warriorProfession, String warriorWeapon) {
        warriorProfession.append("Slayer");
        warriorWeapon += "Swinger";

        //when you set null to an mutable object and if there is any live reference that exists in the calling code
        // it has no effect
        warriorProfession = null;
        warriorWeapon = null;
    }


}
