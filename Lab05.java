public class Lab05 {
    public static void main(String[] args) {
        // Step 2: ทดสอบคลาส User
        User john = new User("John", 1954, 2, 18);
        System.out.println("User Information:");
        john.displayInfo();

        // Step 4: ทดสอบคลาส Admin
        Admin nicolas = new Admin();
        System.out.println("\nAdmin Information:");
        nicolas.displayInfo();

        // Step 6: ทดสอบ Override และ Overload เมธอด displayInfo
        System.out.println("\nAdmin with displayInfo(true):");
        nicolas.displayInfo(true);

        System.out.println("\nAdmin with displayInfo(false):");
        nicolas.displayInfo(false);
    }
}