public class App {
    public static void main(String[] args) {
        Student student = new Student("Hieu", "Ha Noi", "College", 2018, 58);
        System.out.println(student.toString());

        Staff staff = new Staff("Mrs.Van", "Ha Noi", "College FPT Polytechnic", 10);
        System.out.println(staff.toString());
    }
}
