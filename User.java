import java.time.LocalDate;
class User {
    private String name;     // ชื่อผู้ใช้
    private LocalDate dob;   // วันเกิดผู้ใช้

    // Constructor เริ่มต้น
    public User() {
        this.name = null;
        this.dob = LocalDate.now(); // ใช้วันที่ปัจจุบันเป็นค่าเริ่มต้น
    }

    // Constructor แบบกำหนดค่า
    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    // เมธอดแสดงข้อมูลผู้ใช้
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + dob);
    }

    // Getter สำหรับดึงชื่อผู้ใช้
    public String getName() {
        return name;
    }
}