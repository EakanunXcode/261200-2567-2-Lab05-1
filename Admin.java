class Admin extends User {
    // Override เมธอด displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin"); // เพิ่มข้อความ "User type: admin"
    }

    // Overload เมธอด displayInfo ที่รับ boolean
    public void displayInfo(boolean full) {
        if (full) {
            System.out.println("Name: " + getName());
            System.out.println("User type: admin");
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println("Name: " + getName());
        }
    }
}